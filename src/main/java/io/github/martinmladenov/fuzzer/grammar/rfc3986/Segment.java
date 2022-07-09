package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class Segment extends Symbol {

    public Segment() {
        super(
                new ZeroOrMore(new Pchar())
        );
    }

}
