package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.HexDig;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

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
