package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class Ls32 extends Symbol {

    public Ls32() {
        super(
                new OneOf(
                        new Concatenate(
                                new H16(),
                                new Terminal(":"),
                                new H16()
                        ),
                        new IPv4address()
                )
        );
    }

}
