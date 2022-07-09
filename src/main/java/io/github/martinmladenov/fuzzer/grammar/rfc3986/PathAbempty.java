package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

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
