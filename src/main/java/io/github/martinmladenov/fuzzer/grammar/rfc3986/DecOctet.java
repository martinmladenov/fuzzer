package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Digit;
import io.github.martinmladenov.fuzzer.grammar.base.ext.Symbol;

public class DecOctet extends Symbol {

    public DecOctet() {
        super(
                new OneOf(
                        new Digit(),
                        new Concatenate(new CharBetween('1', '9'), new Digit()),
                        new Concatenate(new Terminal("1"), new RepeatConstant(new Digit(), 2)),
                        new Concatenate(new Terminal("2"), new CharBetween('0', '4'), new Digit()),
                        new Concatenate(new Terminal("25"), new CharBetween('0', '5'))
                )
        );
    }

}
