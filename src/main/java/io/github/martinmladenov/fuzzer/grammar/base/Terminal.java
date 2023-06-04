package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;
import java.util.Set;

/**
 * Appends a predefined string.
 */
public class Terminal extends BaseSymbol {

    private final String value;

    public Terminal(String value) {
        this.value = value;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd, Set<String> used) {
        sb.append(value);
    }

}
