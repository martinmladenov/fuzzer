package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class Path extends Symbol {

    public Path() {
        super(
                new OneOf(
                        new PathAbempty(),
                        new PathAbsolute(),
                        new PathNoscheme(),
                        new PathRootless(),
                        new PathEmpty()
                )
        );
    }

}
