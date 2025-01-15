package io.hexlet;

public class Url {
    private String url;

    Url(String url) {
        this.url = url;
    }

    public String getProtocol() {
        return url.split("://")[0];
    }

    public String getHost() {
        return url.split("://")[1];
    }
}
