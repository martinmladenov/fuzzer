package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class Userinfo extends Symbol {

    public Userinfo() {
        super(
                new ZeroOrMore(
                        new OneOf(
                                new Unreserved(),
                                new PctEncoded(),
                                new SubDelims(),
                                new Terminal(":")
                        )
                )
        );
    }

}
