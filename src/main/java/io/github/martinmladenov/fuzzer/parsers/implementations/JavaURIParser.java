package io.github.martinmladenov.fuzzer.parsers.implementations;

import io.github.martinmladenov.fuzzer.parsers.ParserAdapter;
import io.github.martinmladenov.fuzzer.parsers.result.ParserResult;
import io.github.martinmladenov.fuzzer.parsers.result.ParserResultBuilder;

import java.net.URI;

public class JavaURIParser extends ParserAdapter {
    @Override
    public ParserResult run(String inputString) {
        URI uri = URI.create(inputString);

        return new ParserResultBuilder()
                .withScheme(uri.getScheme())
                .withAuthority(uri.getAuthority())
                .withPath(uri.getPath())
                .withQuery(uri.getQuery())
                .withFragment(uri.getFragment())
                .withUserinfo(uri.getUserInfo())
                .withHost(uri.getHost())
                .withPort(Integer.toString(uri.getPort()))
                .build();
    }
}
