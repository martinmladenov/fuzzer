package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class Fragment extends Symbol {

    public Fragment() {
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
