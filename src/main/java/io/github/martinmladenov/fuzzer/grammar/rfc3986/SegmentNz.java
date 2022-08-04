package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.ext.OneOrMore;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class SegmentNz extends Symbol {

    public SegmentNz() {
        super(
                new OneOrMore(new Pchar())
        );
    }

}
