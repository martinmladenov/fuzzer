package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.Repeat;
import io.github.martinmladenov.fuzzer.grammar.base.Symbol;

/**
 * Generate a certain symbol a random positive number of times.
 */
public class OneOrMore extends Repeat {

    public OneOrMore(Symbol symbol) {
        super(symbol, 1, Repeat.DEFAULT_MAX);
    }

}
