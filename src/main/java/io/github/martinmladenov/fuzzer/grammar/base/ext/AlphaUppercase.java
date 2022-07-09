package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;

/**
 * Generates a random uppercase letter with equal probability.
 */
public class AlphaUppercase extends OneOf {

    public AlphaUppercase() {
        super(new Terminal("A"),
                new Terminal("B"),
                new Terminal("C"),
                new Terminal("D"),
                new Terminal("E"),
                new Terminal("F"),
                new Terminal("G"),
                new Terminal("H"),
                new Terminal("I"),
                new Terminal("J"),
                new Terminal("K"),
                new Terminal("L"),
                new Terminal("M"),
                new Terminal("N"),
                new Terminal("O"),
                new Terminal("P"),
                new Terminal("Q"),
                new Terminal("R"),
                new Terminal("S"),
                new Terminal("T"),
                new Terminal("U"),
                new Terminal("V"),
                new Terminal("W"),
                new Terminal("X"),
                new Terminal("Y"),
                new Terminal("Z"));
    }

}
