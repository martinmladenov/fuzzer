package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class Pchar extends Symbol {

    public Pchar() {
        super(
                new OneOf(
                        new Unreserved(),
                        new PctEncoded(),
                        new SubDelims(),
                        new Terminal(":"),
                        new Terminal("@")
                )
        );
    }

}
