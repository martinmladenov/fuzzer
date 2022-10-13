package io.github.martinmladenov.fuzzer.execution.result;

import io.github.martinmladenov.fuzzer.parsers.ParserAdapter;
import io.github.martinmladenov.fuzzer.parsers.result.ParserResult;

import java.util.ArrayList;
import java.util.List;

public class RunResultBuilder {
    private final List<ParserRunResult> results;

    public RunResultBuilder(int parserCount) {
        this.results = new ArrayList<>(parserCount);
    }

    public void logResult(Class<? extends ParserAdapter> parser, ParserResult result) {
        this.results.add(new ParserRunResult(parser, result));
    }

    public RunResult build() {
        return new RunResult(results);
    }
}
