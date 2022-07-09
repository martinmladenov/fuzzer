package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class H16 extends Symbol {

    public H16() {
        super(
                new RepeatRandom(new HexDig(), 1, 4)
        );
    }

}
