package com.lezhin.bootex.controller;

import com.lezhin.bootex.services.GetterGreetingService;
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
        this.getterInjectedController.setGreetingService(new GetterGreetingService());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals("Hello - I was injected by the getter", getterInjectedController.sayHello());
    }



}
