package unit.execution;

import io.github.martinmladenov.fuzzer.execution.ParserRunner;
import io.github.martinmladenov.fuzzer.execution.result.RunResult;
import io.github.martinmladenov.fuzzer.parsers.ParserAdapter;
import io.github.martinmladenov.fuzzer.parsers.result.ParserResult;
import io.github.martinmladenov.fuzzer.parsers.result.ParserResultBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ParserRunnerTests {
    @Test
    public void noDifferencesReturnsFalse() {
        // Arrange
        String input = "test";
        List<ParserAdapter> mockParsers = List.of(
                getMockParserAdapter(input, getExampleTestResult()),
                getMockParserAdapter(input, getExampleTestResult()),
                getMockParserAdapter(input, getExampleTestResult()),
                getMockParserAdapter(input, getExampleTestResult())
        );
        ParserRunner runner = new ParserRunner(mockParsers);

        // Act
        RunResult result = runner.run(input);

        // Assert
        assertThat(result.hasDifferences()).isFalse();
    }

    @Test
    public void withDifferencesReturnsTrue() {
        // Arrange
        String input = "test";
        List<ParserAdapter> mockParsers = List.of(
                getMockParserAdapter(input, getExampleTestResult()),
                getMockParserAdapter(input, getExampleTestResult()),
                getMockParserAdapter(input, getTestResult("tudelft.nl")),
                getMockParserAdapter(input, getExampleTestResult())
        );
        ParserRunner runner = new ParserRunner(mockParsers);

        // Act
        RunResult result = runner.run(input);

        // Assert
        assertThat(result.hasDifferences()).isTrue();
    }

    private ParserAdapter getMockParserAdapter(String input, ParserResult result) {
        ParserAdapter mockParser = mock(ParserAdapter.class);
        when(mockParser.run(anyString())).thenReturn(result);
        return mockParser;
    }

    private ParserResult getTestResult(String host) {
        return new ParserResultBuilder()
                .withScheme("http")
                .withPath("/path")
                .withQuery("query=1")
                .withFragment("abc")
                .withUserinfo("user:pass")
                .withHost(host)
                .withPort("123")
                .build();
    }

    private ParserResult getExampleTestResult() {
        return getTestResult("example.com");
    }

    private ParserResult getDifferentExampleTestResult() {
        return getTestResult("tudelft.nl");
    }
}
