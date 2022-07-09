package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;

/**
 * Generates a random digit with equal probability.
 */
public class Digit extends OneOf {

    public Digit() {
        super(new Terminal("0"),
                new Terminal("1"),
                new Terminal("2"),
                new Terminal("3"),
                new Terminal("4"),
                new Terminal("5"),
                new Terminal("6"),
                new Terminal("7"),
                new Terminal("8"),
                new Terminal("9"));
    }

}
