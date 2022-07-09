package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.RepeatRandom;
import io.github.martinmladenov.fuzzer.grammar.base.BaseSymbol;

/**
 * Generate a certain symbol a random non-negative number of times.
 */
public class ZeroOrMore extends RepeatRandom {

    public ZeroOrMore(BaseSymbol symbol) {
        super(symbol, 0, RepeatRandom.DEFAULT_MAX);
    }

}
