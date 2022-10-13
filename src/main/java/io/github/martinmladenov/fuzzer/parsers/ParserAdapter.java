package io.github.martinmladenov.fuzzer.parsers;

import io.github.martinmladenov.fuzzer.parsers.result.ParserResult;

public abstract class ParserAdapter {
    public abstract ParserResult run(String inputString);
}
