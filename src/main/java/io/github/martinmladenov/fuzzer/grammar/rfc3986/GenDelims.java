package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class GenDelims extends Symbol {

    public GenDelims() {
        super(
                new OneOf(
                        new Terminal(":"),
                        new Terminal("/"),
                        new Terminal("?"),
                        new Terminal("#"),
                        new Terminal("["),
                        new Terminal("]"),
                        new Terminal("@")
                )
        );
    }

}
