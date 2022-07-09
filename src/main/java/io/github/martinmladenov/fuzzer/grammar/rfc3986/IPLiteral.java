package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class IPLiteral extends Symbol {

    public IPLiteral() {
        super(
                new Concatenate(
                        new Terminal("["),
                        new OneOf(
                                new IPv6address(),
                                new IPvFuture()
                        ),
                        new Terminal("]")
                )
        );
    }

}
