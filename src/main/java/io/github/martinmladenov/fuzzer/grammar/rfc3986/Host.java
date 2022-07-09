package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

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
