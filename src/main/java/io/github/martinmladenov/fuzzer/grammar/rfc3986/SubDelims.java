package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class SubDelims extends Symbol {

    public SubDelims() {
        super(
                new OneOf(
                        new Terminal("!"),
                        new Terminal("$"),
                        new Terminal("&"),
                        new Terminal("'"),
                        new Terminal("("),
                        new Terminal(")"),
                        new Terminal("*"),
                        new Terminal("+"),
                        new Terminal(","),
                        new Terminal(";"),
                        new Terminal("=")
                )
        );
    }

}
