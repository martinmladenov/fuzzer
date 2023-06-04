package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;
import java.util.Set;

/**
 * Generate a random ascii character in a predefined range.
 */
public class CharBetween extends BaseSymbol {

    char min;
    char max;

    public CharBetween(char min, char max) {
        if (min >= max) {
            throw new IllegalArgumentException("min must be < max");
        }

        this.min = min;
        this.max = max;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd, Set<String> used) {
        char c = (char) (rnd.nextInt(max - min + 1) + min);
        sb.append(c);
    }

}
