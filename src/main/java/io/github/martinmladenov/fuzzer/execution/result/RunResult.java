package io.github.martinmladenov.fuzzer.execution.result;

import java.util.List;

public class RunResult {
    private final List<ParserRunResult> results;
    private final boolean hasDifferences;

    public RunResult(List<ParserRunResult> results) {
        this.results = results;
        this.hasDifferences = calculateHasDifferences();
    }

    public List<ParserRunResult> getResults() {
        return results;
    }

    public boolean hasDifferences() {
        return hasDifferences;
    }

    private boolean calculateHasDifferences() {
        boolean hasDifferences = false;
        for (int i = 1; i < results.size() - 1; i++) {
            if (!results.get(0).result().equals(results.get(i).result())) {
                hasDifferences = true;
                break;
            }
        }

        return hasDifferences;
    }
}
