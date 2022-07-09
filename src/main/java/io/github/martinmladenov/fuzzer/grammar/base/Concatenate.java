package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;

/**
 * Generates all symbols from left to right and concatenates their results.
 */
public class Concatenate extends BaseSymbol {

    private final BaseSymbol[] symbols;

    public Concatenate(BaseSymbol... symbols) {
        this.symbols = symbols;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd) {
        for (BaseSymbol symbol : symbols) {
            symbol.generate(sb, rnd);
        }
    }

}
