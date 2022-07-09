package io.github.martinmladenov.fuzzer.grammar.rfc3986;

import io.github.martinmladenov.fuzzer.grammar.base.*;
import io.github.martinmladenov.fuzzer.grammar.base.ext.*;

public class IPv6address extends Symbol {

    public IPv6address() {
        super(
                new OneOf(
                        new Concatenate(
                                new RepeatConstant(
                                        new Concatenate(
                                                new H16(),
                                                new Terminal(":")
                                        ),
                                        6
                                ),
                                new Ls32()
                        ),
                        new Concatenate(
                                new Terminal("::"),
                                new RepeatConstant(
                                        new Concatenate(
                                                new H16(),
                                                new Terminal(":")
                                        ),
                                        5
                                ),
                                new Ls32()
                        ),
                        new Concatenate(
                                new Optional(
                                        new H16()
                                ),
                                new Terminal("::"),
                                new RepeatConstant(
                                        new Concatenate(
                                                new H16(),
                                                new Terminal(":")
                                        ),
                                        4
                                ),
                                new Ls32()
                        ),
                        new Concatenate(
                                new Optional(
                                        new Concatenate(
                                                new RepeatRandom(
                                                        new Concatenate(
                                                                new H16(),
                                                                new Terminal(":")
                                                        ),
                                                        0, 1
                                                ),
                                                new H16()
                                        )
                                ),
                                new Terminal("::"),
                                new RepeatConstant(
                                        new Concatenate(
                                                new H16(),
                                                new Terminal(":")
                                        ),
                                        3
                                ),
                                new Ls32()
                        ),
                        new Concatenate(
                                new Optional(
                                        new Concatenate(
                                                new RepeatRandom(
                                                        new Concatenate(
                                                                new H16(),
                                                                new Terminal(":")
                                                        ),
                                                        0, 2
                                                ),
                                                new H16()
                                        )
                                ),
                                new Terminal("::"),
                                new RepeatConstant(
                                        new Concatenate(
                                                new H16(),
                                                new Terminal(":")
                                        ),
                                        2
                                ),
                                new Ls32()
                        ),
                        new Concatenate(
                                new Optional(
                                        new Concatenate(
                                                new RepeatRandom(
                                                        new Concatenate(
                                                                new H16(),
                                                                new Terminal(":")
                                                        ),
                                                        0, 3
                                                ),
                                                new H16()
                                        )
                                ),
                                new Terminal("::"),
                                new H16(),
                                new Terminal(":"),
                                new Ls32()
                        ),
                        new Concatenate(
                                new Optional(
                                        new Concatenate(
                                                new RepeatRandom(
                                                        new Concatenate(
                                                                new H16(),
                                                                new Terminal(":")
                                                        ),
                                                        0, 4
                                                ),
                                                new H16()
                                        )
                                ),
                                new Terminal("::"),
                                new Ls32()
                        ),
                        new Concatenate(
                                new Optional(
                                        new Concatenate(
                                                new RepeatRandom(
                                                        new Concatenate(
                                                                new H16(),
                                                                new Terminal(":")
                                                        ),
                                                        0, 5
                                                ),
                                                new H16()
                                        )
                                ),
                                new Terminal("::"),
                                new H16()
                        ),
                        new Concatenate(
                                new Optional(
                                        new Concatenate(
                                                new RepeatRandom(
                                                        new Concatenate(
                                                                new H16(),
                                                                new Terminal(":")
                                                        ),
                                                        0, 6
                                                ),
                                                new H16()
                                        )
                                ),
                                new Terminal("::")
                        )
                )
        );
    }

}
