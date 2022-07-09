package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

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
