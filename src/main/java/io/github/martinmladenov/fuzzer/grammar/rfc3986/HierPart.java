package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class HierPart extends Symbol {

    public HierPart() {
        super(
                new OneOf(
                        new Concatenate(new Terminal("//"), new Authority(), new PathAbempty()),
                        new PathAbsolute(),
                        new PathRootless(),
                        new PathEmpty()
                )
        );
    }

}
