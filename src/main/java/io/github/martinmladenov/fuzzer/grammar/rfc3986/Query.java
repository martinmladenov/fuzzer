package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class Query extends Symbol {

    public Query() {
        super(
                new ZeroOrMore(
                        new OneOf(
                                new Pchar(),
                                new Terminal("/"),
                                new Terminal("?")
                        )
                )
        );
    }

}
