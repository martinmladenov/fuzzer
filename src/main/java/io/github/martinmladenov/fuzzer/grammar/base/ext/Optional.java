package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.RepeatRandom;
import io.github.martinmladenov.fuzzer.grammar.base.BaseSymbol;

public class Optional extends RepeatRandom {

    public Optional(BaseSymbol symbol) {
        super(symbol, 0, 1);
    }

}
