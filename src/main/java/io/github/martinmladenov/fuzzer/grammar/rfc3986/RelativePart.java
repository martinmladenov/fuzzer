package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class RelativePart extends Symbol {

    public RelativePart() {
        super(
                new OneOf(
                        new Concatenate(new Terminal("//"), new Authority(), new PathAbempty()),
                        new PathAbsolute(),
                        new PathNoscheme(),
                        new PathEmpty()
                )
        );
    }

}
