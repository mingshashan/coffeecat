package com.auto.coffee.servlet;

/**
 * CoffeeResponse
 *
 * @author jasonxu
 */
public interface CoffeeResponse {

    CoffeeRequest getCoffeeRequest();

    public void setStatus();

    String getStatus();


}
