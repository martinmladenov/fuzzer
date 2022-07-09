package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

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
