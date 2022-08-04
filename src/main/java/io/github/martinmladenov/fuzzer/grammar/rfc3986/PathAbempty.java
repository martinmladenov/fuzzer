package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;
import io.github.martinmladenov.fuzzer.grammar.base.ext.ZeroOrMore;

public class PathAbempty extends Symbol {

    public PathAbempty() {
        super(
                new ZeroOrMore(
                        new Concatenate(
                                new Terminal("/"),
                                new Segment()
                        )
                )
        );
    }

}
