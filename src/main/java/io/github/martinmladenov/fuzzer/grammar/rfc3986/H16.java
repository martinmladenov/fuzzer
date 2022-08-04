package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.RepeatRandom;
import io.github.martinmladenov.fuzzer.grammar.base.ext.HexDig;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class H16 extends Symbol {

    public H16() {
        super(
                new RepeatRandom(new HexDig(), 1, 4)
        );
    }

}
