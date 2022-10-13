package io.github.martinmladenov.fuzzer.execution;

import io.github.martinmladenov.fuzzer.execution.result.RunResult;
import io.github.martinmladenov.fuzzer.execution.result.RunResultBuilder;
import io.github.martinmladenov.fuzzer.parsers.ParserAdapter;
import io.github.martinmladenov.fuzzer.parsers.implementations.JavaURIParser;
import io.github.martinmladenov.fuzzer.parsers.result.ParserResult;

import java.util.ArrayList;
import java.util.List;

public class ParserRunner {
    private final List<ParserAdapter> parsers;

    public ParserRunner(List<ParserAdapter> parsers) {
        this.parsers = new ArrayList<>();
        this.parsers.addAll(parsers);
    }

    public RunResult run(String input) {
        RunResultBuilder builder = new RunResultBuilder(parsers.size());

        for (ParserAdapter parser : parsers) {
            ParserResult parserResult = parser.run(input);
            builder.logResult(parser.getClass(), parserResult);
        }

        return builder.build();
    }

    public static ParserRunner createDefaultParserRunner() {
        List<ParserAdapter> defaultParsers = getDefaultParserList();
        return new ParserRunner(defaultParsers);
    }

    public static List<ParserAdapter> getDefaultParserList() {
        return List.of(
                new JavaURIParser()
        );
    }
}
