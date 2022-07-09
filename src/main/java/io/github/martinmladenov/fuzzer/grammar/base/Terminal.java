package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;

/**
 * Appends a predefined string.
 */
public class Terminal extends Symbol {

    private String value;

    public Terminal(String value) {
        this.value = value;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd) {
        sb.append(value);
    }

}
