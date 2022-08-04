package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.ext.Digit;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;
import io.github.martinmladenov.fuzzer.grammar.base.ext.ZeroOrMore;

public class Port extends Symbol {

    public Port() {
        super(
                new ZeroOrMore(
                        new Digit()
                )
        );
    }

}
