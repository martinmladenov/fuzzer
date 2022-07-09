package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class PathEmpty extends Symbol {

    public PathEmpty() {
        super(
                new Terminal("")
        );
    }

}
