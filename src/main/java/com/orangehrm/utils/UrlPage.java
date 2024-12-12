package com.orangehrm.utils;

public enum UrlPage {
    URLPAGE("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    private final String url;

    UrlPage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
