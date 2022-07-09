package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;

/**
 * Generates a random lowercase letter with equal probability.
 */
public class AlphaLowercase extends OneOf {

    public AlphaLowercase() {
        super(new Terminal("a"),
                new Terminal("b"),
                new Terminal("c"),
                new Terminal("d"),
                new Terminal("e"),
                new Terminal("f"),
                new Terminal("g"),
                new Terminal("h"),
                new Terminal("i"),
                new Terminal("j"),
                new Terminal("k"),
                new Terminal("l"),
                new Terminal("m"),
                new Terminal("n"),
                new Terminal("o"),
                new Terminal("p"),
                new Terminal("q"),
                new Terminal("r"),
                new Terminal("s"),
                new Terminal("t"),
                new Terminal("u"),
                new Terminal("v"),
                new Terminal("w"),
                new Terminal("x"),
                new Terminal("y"),
                new Terminal("z"));
    }

}
