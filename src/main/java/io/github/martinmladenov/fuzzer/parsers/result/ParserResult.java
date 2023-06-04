package io.github.martinmladenov.fuzzer.parsers.result;

import java.util.Objects;

public class ParserResult {
    private String scheme;
    private String authority;
    private String path;
    private String query;
    private String fragment;

    private String userinfo;
    private String host;
    private String port;

    protected ParserResult() {
    }


    public String getScheme() {
        return scheme;
    }

    public String getAuthority() {
        return authority;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getFragment() {
        return fragment;
    }

    public String getUserinfo() {
        return userinfo;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    protected void setScheme(String scheme) {
        this.scheme = scheme;
    }

    protected void setAuthority(String authority) {
        this.authority = authority;
    }

    protected void setPath(String path) {
        this.path = path;
    }

    protected void setQuery(String query) {
        this.query = query;
    }

    protected void setFragment(String fragment) {
        this.fragment = fragment;
    }

    protected void setUserinfo(String userinfo) {
        this.userinfo = userinfo;
    }

    protected void setHost(String host) {
        this.host = host;
    }

    protected void setPort(String port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParserResult that = (ParserResult) o;
        return Objects.equals(scheme, that.scheme) && Objects.equals(authority, that.authority) &&
               Objects.equals(path, that.path) && Objects.equals(query, that.query) &&
               Objects.equals(fragment, that.fragment) && Objects.equals(userinfo, that.userinfo) &&
               Objects.equals(host, that.host) && Objects.equals(port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheme, authority, path, query, fragment, userinfo, host, port);
    }

    @Override
    public String toString() {
        return "---\n" +
               "  scheme:    " + scheme + '\n' +
               "  userinfo:  " + userinfo + '\n' +
               "  host:      " + host + '\n' +
               "  port:      " + port + '\n' +
               "  authority: " + authority + '\n' +
               "  path:      " + path + '\n' +
               "  query:     " + query + '\n' +
               "  fragment:  " + fragment + '\n' +
               "---";
    }
}
