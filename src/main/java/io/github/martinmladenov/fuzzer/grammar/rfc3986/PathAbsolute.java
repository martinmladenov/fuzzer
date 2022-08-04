package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Optional;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;
import io.github.martinmladenov.fuzzer.grammar.base.ext.ZeroOrMore;

public class PathAbsolute extends Symbol {

    public PathAbsolute() {
        super(
                new Concatenate(
                        new Terminal("/"),
                        new Optional(
                                new Concatenate(
                                        new SegmentNz(),
                                        new ZeroOrMore(
                                                new Concatenate(
                                                        new Terminal("/"),
                                                        new Segment()
                                                )
                                        )
                                )
                        )
                )
        );
    }

}
