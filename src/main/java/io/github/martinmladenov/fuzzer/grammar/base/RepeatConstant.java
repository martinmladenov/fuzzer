package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;

/**
 * Generate a certain symbol a predefined number of times.
 */
public class RepeatConstant extends Symbol {

    private final int count;
    private final Symbol symbol;

    public RepeatConstant(Symbol symbol, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("count must be > 0");
        }

        this.symbol = symbol;
        this.count = count;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd) {
        for (int i = 0; i < count; i++) {
            symbol.generate(sb, rnd);
        }
    }

}
