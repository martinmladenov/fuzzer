package io.github.martinmladenov.fuzzer;

import io.github.martinmladenov.fuzzer.grammar.rfc3986.URIReference;
import io.github.martinmladenov.fuzzer.parsers.ParserAdapter;
import io.github.martinmladenov.fuzzer.parsers.implementations.JavaURIParser;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestValidity {
    public static void main(String[] args) {
        ParserAcceptanceTester tester = new ParserAcceptanceTester();
        UriGenerator generator = new UriGenerator(123);
        Set<String> used = new HashSet<>();


        String uri = generator.generate(used);
        System.out.println(uri);
        used.forEach(System.out::println);

        boolean accepted = tester.isAccepted(uri);
        System.out.println(accepted);
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
                e.printStackTrace();
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
