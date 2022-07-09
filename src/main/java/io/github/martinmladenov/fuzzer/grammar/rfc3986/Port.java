package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class Port extends Symbol {

    public Port() {
        super(
                new ZeroOrMore(
                        new Digit()
                )
        );
    }

}
