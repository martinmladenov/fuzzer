package io.github.martinmladenov.fuzzer;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
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
        Random rnd = new Random(123123);

        for (int i = 0; i < 100; i++) {
            sb.append(i).append(": ");
            demo.generate(sb, rnd);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
