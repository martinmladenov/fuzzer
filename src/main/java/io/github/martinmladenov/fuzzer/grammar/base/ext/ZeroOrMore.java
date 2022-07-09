package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.Repeat;
import io.github.martinmladenov.fuzzer.grammar.base.Symbol;

/**
 * Generate a certain symbol a random non-negative number of times.
 */
public class ZeroOrMore extends Repeat {

    public ZeroOrMore(Symbol symbol) {
        super(symbol, 0, Repeat.DEFAULT_MAX);
    }

}
