package io.github.martinmladenov.fuzzer.grammar.base;

import java.util.Random;

/**
 * A base class defining a symbol.
 */
public abstract class BaseSymbol {

    public abstract void generate(StringBuilder sb, Random rnd);

}
