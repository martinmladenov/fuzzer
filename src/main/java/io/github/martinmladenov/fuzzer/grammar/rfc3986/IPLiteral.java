package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

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
