package com.auto.coffee.boot;

import com.auto.coffee.servlet.CoffeeServlet;

/**
 * CoffeeBoot
 *
 * @author jasonxu
 */
public class CoffeeBoot {

    public static void main(String[] args) {
        CoffeeServlet coffeeServlet = new CoffeeServlet();
        coffeeServlet.doService();
    }
}
