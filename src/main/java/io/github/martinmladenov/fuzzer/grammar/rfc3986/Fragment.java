package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;
import io.github.martinmladenov.fuzzer.grammar.base.ext.ZeroOrMore;

public class Fragment extends Symbol {

    public Fragment() {
        super(
                new ZeroOrMore(
                        new OneOf(
                                new Pchar(),
                                new Terminal("/"),
                                new Terminal("?")
                        )
                )
        );
    }

}
