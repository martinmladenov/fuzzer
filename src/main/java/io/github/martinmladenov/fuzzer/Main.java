package io.github.martinmladenov.fuzzer;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;
import io.github.martinmladenov.fuzzer.grammar.rfc3986.URIReference;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        String s = getDemoStrings(123123);
        String s = getDemoUris(123123);

        System.out.println(s);
    }

    private static String getDemoUris(int seed) {
        URIReference symbol = new URIReference();

        StringBuilder sb = new StringBuilder();
        Random rnd = new Random(seed);

        Set<String> used = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            sb.append(i).append(": ");
            symbol.generate(sb, rnd, used);
            sb.append("\n");
        }
        return sb.toString();
    }

    private static String getDemoStrings(int seed) {
        var demo = new Concatenate(
                new Digit(),
                new AlphaLowercase(),
                new AlphaUppercase(),
                new ZeroOrMore(new AlphaLowercase()),
                new ZeroOrMore(new AlphaUppercase()),
                new OneOrMore(new AlphaLowercase()),
                new OneOrMore(new AlphaUppercase())
        );

        StringBuilder sb = new StringBuilder();
        Random rnd = new Random(seed);
        Set<String> used = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            sb.append(i).append(": ");
            demo.generate(sb, rnd, used);
            sb.append("\n");
        }
        return sb.toString();
    }
}
