package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.BaseSymbol;

import java.util.Random;
import java.util.Set;

/**
 * A dummy symbol that wraps another symbol.
 * Used for clearer grammar definition.
 */
public class Symbol extends BaseSymbol {

    private final BaseSymbol symbol;

    public Symbol(BaseSymbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public void generate(StringBuilder sb, Random rnd, Set<String> used) {
        // log actual class
        used.add(this.getClass().getSimpleName());

        symbol.generate(sb, rnd, used);
    }

}
