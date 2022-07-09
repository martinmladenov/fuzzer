package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class PctEncoded extends Symbol {

    public PctEncoded() {
        super(
                new Concatenate(
                        new Terminal("%"),
                        new HexDig(),
                        new HexDig()
                )
        );
    }

}
