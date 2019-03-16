
package com.auto.coffee.servlet;

import java.io.InputStream;
import java.util.Enumeration;

/**
 * CoffeeRequest
 *
 * @author jasonxu
 */
public interface CoffeeRequest {

    /**
     * get input stream
     *
     * @return
     */
    InputStream getInputStream();

    /**
     * get context path
     *
     * @return
     */
    String getContextPath();

    /**
     * get http method
     *
     * @return
     */
    String getMethod();

    String getRequestURI();

    String getHost();

    String getUserAgent();

    String getHeader(String name);

    Enumeration<String> getHeaderNames();

}
