package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class URIReference extends Symbol {

    public URIReference() {
        super(
                new OneOf(
                        new URI(),
                        new RelativeRef()
                )
        );
    }

}
