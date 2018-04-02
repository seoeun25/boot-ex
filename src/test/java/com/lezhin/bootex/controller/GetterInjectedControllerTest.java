package com.lezhin.bootex.controller;

import com.lezhin.bootex.services.GreetingServiceimpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author seoeun
 * @since 2018.04.02
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceimpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceimpl.HELLO_AZRAEL, getterInjectedController.sayHello());
    }



}
