package com.lezhin.bootex.controller;

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
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceimpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceimpl.HELLO_AZRAEL, constructorInjectedController.sayHello());
    }



}
