package io.github.martinmladenov.fuzzer.execution.result;

import io.github.martinmladenov.fuzzer.parsers.ParserAdapter;
import io.github.martinmladenov.fuzzer.parsers.result.ParserResult;

public record ParserRunResult(Class<? extends ParserAdapter> parser, ParserResult result) {

    public String getParserName() {
        return this.parser().getSimpleName();
    }
}
