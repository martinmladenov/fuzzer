package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;
import io.github.martinmladenov.fuzzer.grammar.base.ext.ZeroOrMore;

public class PathNoscheme extends Symbol {

    public PathNoscheme() {
        super(
                new Concatenate(
                        new SegmentNzNc(),
                        new ZeroOrMore(
                                new Concatenate(
                                        new Terminal("/"),
                                        new Segment()
                                )
                        )
                )
        );
    }

}
