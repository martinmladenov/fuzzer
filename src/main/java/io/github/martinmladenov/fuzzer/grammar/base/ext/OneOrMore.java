package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.RepeatRandom;
import io.github.martinmladenov.fuzzer.grammar.base.Symbol;

/**
 * Generate a certain symbol a random positive number of times.
 */
public class OneOrMore extends RepeatRandom {

    public OneOrMore(Symbol symbol) {
        super(symbol, 1, RepeatRandom.DEFAULT_MAX);
    }

}
