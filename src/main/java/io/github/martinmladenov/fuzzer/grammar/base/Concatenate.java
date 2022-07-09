package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;

/**
 * Generates all symbols from left to right and concatenates their results.
 */
public class Concatenate extends Symbol {

    private Symbol[] symbols;

    public Concatenate(Symbol... symbols) {
        this.symbols = symbols;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd) {
        for (Symbol symbol : symbols) {
            symbol.generate(sb, rnd);
        }
    }

}
