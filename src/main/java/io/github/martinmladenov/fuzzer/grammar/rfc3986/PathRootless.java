package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class PathRootless extends Symbol {

    public PathRootless() {
        super(
                new Concatenate(
                        new SegmentNz(),
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
