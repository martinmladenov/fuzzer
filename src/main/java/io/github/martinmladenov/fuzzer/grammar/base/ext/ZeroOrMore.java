package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.BaseSymbol;

/**
 * Generate a certain symbol a random non-negative number of times.
 */
public class ZeroOrMore extends Optional {

    public ZeroOrMore(BaseSymbol symbol) {
        super(new OneOrMore(symbol));
    }

}
