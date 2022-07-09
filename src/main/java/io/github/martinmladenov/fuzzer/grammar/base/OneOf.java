package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;

/**
 * Randomly picks one of the symbols from the list with equal probability.
 */
public class OneOf extends Symbol {

    private Symbol[] symbols;

    public OneOf(Symbol... symbols) {
        this.symbols = symbols;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd) {
        int index = rnd.nextInt(symbols.length);

        symbols[index].generate(sb, rnd);
    }

}
