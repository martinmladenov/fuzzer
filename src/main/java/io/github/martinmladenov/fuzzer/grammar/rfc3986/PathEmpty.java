package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class PathEmpty extends Symbol {

    public PathEmpty() {
        super(
                new Terminal("")
        );
    }

}
