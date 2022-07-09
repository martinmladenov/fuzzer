package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class AbsoluteURI extends Symbol {

    public AbsoluteURI() {
        super(
                new Concatenate(
                        new Scheme(), new Terminal(":"), new HierPart(),
                        new Optional(new Concatenate(new Terminal("?"), new Query()))
                )
        );
    }

}
