package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;

/**
 * Generates a random hex digit as defined by the ABNF standard, with equal probability.
 */
public class HexDig extends OneOf {

    public HexDig() {
        super(new Terminal("0"),
                new Terminal("1"),
                new Terminal("2"),
                new Terminal("3"),
                new Terminal("4"),
                new Terminal("5"),
                new Terminal("6"),
                new Terminal("7"),
                new Terminal("8"),
                new Terminal("9"),
                new OneOf(new Terminal("A"), new Terminal("a")),
                new OneOf(new Terminal("B"), new Terminal("b")),
                new OneOf(new Terminal("C"), new Terminal("c")),
                new OneOf(new Terminal("D"), new Terminal("d")),
                new OneOf(new Terminal("E"), new Terminal("e")),
                new OneOf(new Terminal("F"), new Terminal("f")));
    }

}
