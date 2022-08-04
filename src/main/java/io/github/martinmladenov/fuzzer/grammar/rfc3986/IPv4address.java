package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class IPv4address extends Symbol {

    public IPv4address() {
        super(
                new Concatenate(
                        new DecOctet(),
                        new Terminal("."),
                        new DecOctet(),
                        new Terminal("."),
                        new DecOctet(),
                        new Terminal("."),
                        new DecOctet()
                )
        );
    }

}
