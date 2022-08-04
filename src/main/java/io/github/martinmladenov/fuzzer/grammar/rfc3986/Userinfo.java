package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;
import io.github.martinmladenov.fuzzer.grammar.base.ext.ZeroOrMore;

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
