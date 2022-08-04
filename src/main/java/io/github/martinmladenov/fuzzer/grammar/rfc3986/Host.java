package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class Host extends Symbol {

    public Host() {
        super(
                new OneOf(
                        new IPLiteral(),
                        new IPv4address(),
                        new RegName()
                )
        );
    }

}
