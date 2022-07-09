package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;

/**
 * Generate a certain symbol a random number of times.
 */
public class RepeatRandom extends BaseSymbol {

    // TODO: This is an arbitrary value, perhaps it should be changed in the future
    private static final int DEFAULT_MAX = 50;

    private final int min;
    private final int max;
    private final BaseSymbol symbol;

    /**
     * @param symbol the symbol to generate
     * @param min    the minimum number of times to generate the symbol (incl.)
     * @param max    the maximum number of times to generate the symbol (incl.)
     */
    public RepeatRandom(BaseSymbol symbol, int min, int max) {
        if (min < 0) {
            throw new IllegalArgumentException("min must be >= 0");
        }

        if (max <= min) {
            throw new IllegalArgumentException("max must be >= min");
        }

        this.symbol = symbol;
        this.min = min;
        this.max = max;
    }

    public RepeatRandom(BaseSymbol symbol, int min) {
        this(symbol, min, DEFAULT_MAX);
    }

    @Override
    public void generate(StringBuilder sb, Random rnd) {
        int count = rnd.nextInt(max - min + 1) + min;
        for (int i = 0; i < count; i++) {
            symbol.generate(sb, rnd);
        }
    }

}
