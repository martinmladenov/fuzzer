package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;
import java.util.Set;

/**
 * Randomly picks one of the symbols from the list with equal probability.
 */
public class OneOf extends BaseSymbol {

    private final BaseSymbol[] symbols;

    public OneOf(BaseSymbol... symbols) {
        this.symbols = symbols;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd, Set<String> used) {
        int index = rnd.nextInt(symbols.length);

        symbols[index].generate(sb, rnd, used);
    }

}
