package com.auto.coffee.http;

/**
 * HttpMethod
 * <br>
 * http1.0 : GET, POST, HEAD
 * <br>
 * http1.1 : OPTIONS, PUT, PATCH, DELETE, TRACE and CONNECT
 *
 * @author jasonxu
 */
public enum HttpMethod {
    GET("GET"), POST("POST"), HEAD("HEAD"), OPTIONS("OPTIONS"), PUT("PUT"), PATCH("PATCH"), DELETE("DELETE"), TRACE("TRACE"), CONNECT("CONNECT");

    private String value;

    private HttpMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
