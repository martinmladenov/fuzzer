package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.BaseSymbol;
import io.github.martinmladenov.fuzzer.grammar.base.RepeatRandom;

public class Optional extends RepeatRandom {

    public Optional(BaseSymbol symbol) {
        super(symbol, 0, 1);
    }

}
