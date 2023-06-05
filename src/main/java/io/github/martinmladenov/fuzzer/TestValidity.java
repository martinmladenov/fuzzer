package io.github.martinmladenov.fuzzer;

import io.github.martinmladenov.fuzzer.grammar.rfc3986.URIReference;
import io.github.martinmladenov.fuzzer.parsers.ParserAdapter;
import io.github.martinmladenov.fuzzer.parsers.implementations.JavaURIParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestValidity {
    public static void main(String[] args) {
        ParserAcceptanceTester tester = new ParserAcceptanceTester();
        UriGenerator generator = new UriGenerator(123);

        Set<String> allFeatures = new HashSet<>();

        int n = 1200;

        ArrayList<Result> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Set<String> used = new HashSet<>();
            String uri = generator.generate(used);
            allFeatures.addAll(used);
            boolean accepted = tester.isAccepted(uri);
            Result result = new Result(used, accepted);
            results.add(result);
        }

        String[] featureArr = allFeatures.stream().sorted().toArray(String[]::new);

        StringBuilder csv = new StringBuilder();
        csv.append(String.join(",", featureArr) + ",label" + '\n');

        for (Result res : results) {
            for (String feature : featureArr) {
                csv.append(res.features.contains(feature) ? '1' : '0');
                csv.append(',');
            }

            csv.append(res.label ? '1' : '0');

            csv.append('\n');
        }

        String csvString = csv.toString();
        try {
            Files.writeString(Paths.get("results.csv"), csvString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class Result {
        Set<String> features;
        boolean label;

        public Result(Set<String> features, boolean label) {
            this.features = features;
            this.label = label;
        }
    }

    static class ParserAcceptanceTester {
        ParserAdapter parser;

        ParserAcceptanceTester() {
            this(new JavaURIParser());
        }

        ParserAcceptanceTester(ParserAdapter parser) {
            this.parser = parser;
        }

        boolean isAccepted(String uri) {
            try {
                this.parser.run(uri);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    static class UriGenerator {
        Random rnd;
        URIReference symbol;

        UriGenerator(int seed) {
            this.symbol = new URIReference();
            this.rnd = new Random(seed);
        }

        String generate(Set<String> used) {
            StringBuilder sb = new StringBuilder();
            symbol.generate(sb, rnd, used);
            return sb.toString();
        }
    }
}