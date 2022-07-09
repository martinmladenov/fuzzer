package io.github.martinmladenov.fuzzer;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String s = getDemoStrings(123123);

        System.out.println(s);
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

        for (int i = 0; i < 100; i++) {
            sb.append(i).append(": ");
            demo.generate(sb, rnd);
            sb.append("\n");
        }
        return sb.toString();
    }
}
