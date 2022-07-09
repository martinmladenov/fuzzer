package io.github.martinmladenov.fuzzer.grammar.base.ext;

import io.github.martinmladenov.fuzzer.grammar.base.OneOf;
import io.github.martinmladenov.fuzzer.grammar.base.Terminal;

/**
 * Generates a random uppercase or lowercase letter with equal probability.
 */
public class Alpha extends OneOf {

    public Alpha() {
        super(new AlphaLowercase(), new AlphaUppercase());
        // the probability of generating any arbitrary letter is equal as the number of letters is equal in both cases
    }

}
