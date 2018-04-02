package com.lezhin.bootex.controller;

import com.lezhin.bootex.services.ConstructorGreetingService;
import com.lezhin.bootex.services.GreetingServiceimpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author seoeun
 * @since 2018.04.02
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals("Hello - I was injected via the constructor !!!", constructorInjectedController.sayHello());
    }



}
