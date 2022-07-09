package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class SegmentNz extends Symbol {

    public SegmentNz() {
        super(
                new OneOrMore(new Pchar())
        );
    }

}
