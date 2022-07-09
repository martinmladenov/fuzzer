package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class RelativeRef extends Symbol {

    public RelativeRef() {
        super(
                new Concatenate(
                        new RelativePart(),
                        new Optional(new Concatenate(new Terminal("?"), new Query())),
                        new Optional(new Concatenate(new Terminal("#"), new Fragment()))
                )
        );
    }

}
