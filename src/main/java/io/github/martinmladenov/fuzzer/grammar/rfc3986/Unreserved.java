package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Alpha;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Digit;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

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
