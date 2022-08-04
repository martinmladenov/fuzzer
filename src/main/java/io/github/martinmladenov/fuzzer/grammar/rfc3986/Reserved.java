package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class Reserved extends Symbol {

    public Reserved() {
        super(
                new OneOf(
                        new GenDelims(),
                        new SubDelims()
                )
        );
    }

}
