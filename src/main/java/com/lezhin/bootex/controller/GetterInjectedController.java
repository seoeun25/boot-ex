package com.lezhin.bootex.controller;

import com.lezhin.bootex.services.GreetingService;

/**
 * @author seoeun
 * @since 2018.04.02
 */
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
