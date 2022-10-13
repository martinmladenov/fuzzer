package io.github.martinmladenov.fuzzer.parsers.result;

public class ParserResultBuilder {

    private final ParserResult parserResult;


    public ParserResultBuilder() {
        this.parserResult = new ParserResult();
    }

    public ParserResult build() {
        return parserResult;
    }

    public ParserResultBuilder withScheme(String scheme) {
        this.parserResult.setScheme(scheme);
        return this;
    }

    public ParserResultBuilder withAuthority(String authority) {
        this.parserResult.setAuthority(authority);
        return this;
    }

    public ParserResultBuilder withPath(String path) {
        this.parserResult.setPath(path);
        return this;
    }

    public ParserResultBuilder withQuery(String query) {
        this.parserResult.setQuery(query);
        return this;
    }

    public ParserResultBuilder withFragment(String fragment) {
        this.parserResult.setFragment(fragment);
        return this;
    }

    public ParserResultBuilder withUserinfo(String userinfo) {
        this.parserResult.setUserinfo(userinfo);
        return this;
    }

    public ParserResultBuilder withHost(String host) {
        this.parserResult.setHost(host);
        return this;
    }

    public ParserResultBuilder withPort(String port) {
        this.parserResult.setPort(port);
        return this;
    }
}
