package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.RepeatRandom;
import io.github.martinmladenov.fuzzer.grammar.base.Symbol;

public class Optional extends RepeatRandom {

    public Optional(Symbol symbol) {
        super(symbol, 0, 1);
    }

}
