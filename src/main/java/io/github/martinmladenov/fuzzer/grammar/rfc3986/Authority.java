package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Optional;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class Authority extends Symbol {

    public Authority() {
        super(
                new Concatenate(
                        new Optional(new Concatenate(new Userinfo(), new Terminal("@"))),
                        new Host(),
                        new Optional(new Concatenate(new Terminal(":"), new Port()))
                )
        );
    }

}
