package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.Concatenate;
import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;
import io.github.martinmladenov.fuzzer.grammar.base.ext.HexDig;
import io.github.martinmladenov.fuzzer.grammar.base.ext.OneOrMore;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class IPvFuture extends Symbol {

    public IPvFuture() {
        super(
                new Concatenate(
                        new Terminal("v"),
                        new OneOrMore(new HexDig()),
                        new Terminal("."),
                        new OneOrMore(
                                new OneOf(
                                        new Unreserved(),
                                        new SubDelims(),
                                        new Terminal(":")
                                )
                        )
                )
        );
    }

}
