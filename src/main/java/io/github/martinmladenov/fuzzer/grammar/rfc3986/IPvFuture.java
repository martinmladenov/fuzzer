package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class IPvFuture extends Symbol {

    public IPvFuture() {
        super(
                new Concatenate(
                        new Terminal("v"),
                        new OneOrMore(new HexDig()),
                        new Terminal("."),
                        new OneOrMore(
                                new OneOf(
                                        new Unreserved(),
                                        new SubDelims(),
                                        new Terminal(":")
                                )
                        )
                )
        );
    }

}
