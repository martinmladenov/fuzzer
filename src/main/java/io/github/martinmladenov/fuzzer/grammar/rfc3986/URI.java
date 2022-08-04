package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Optional;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class URI extends Symbol {

    public URI() {
        super(
                new Concatenate(
                        new Scheme(),
                        new Terminal(":"),
                        new HierPart(),
                        new Optional(new Concatenate(new Terminal("?"), new Query())),
                        new Optional(new Concatenate(new Terminal("#"), new Fragment()))
                )
        );
    }

}
