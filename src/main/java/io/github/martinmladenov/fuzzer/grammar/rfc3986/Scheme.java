package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Alpha;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Digit;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;
import io.github.martinmladenov.fuzzer.grammar.base.ext.ZeroOrMore;

public class Scheme extends Symbol {

    public Scheme() {
        super(
                new Concatenate(
                        new Alpha(),
                        new ZeroOrMore(new OneOf(new Alpha(), new Digit(),
                                new OneOf(new Terminal("+"), new Terminal("-"), new Terminal("."))))
                )
        );
    }

}
