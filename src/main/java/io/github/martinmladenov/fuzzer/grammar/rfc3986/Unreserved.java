package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class Unreserved extends Symbol {

    public Unreserved() {
        super(
                new OneOf(
                        new Alpha(),
                        new Digit(),
                        new Terminal("-"),
                        new Terminal("."),
                        new Terminal("_"),
                        new Terminal("~")
                )
        );
    }

}
