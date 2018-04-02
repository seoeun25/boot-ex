package com.lezhin.bootex.controller;

import com.lezhin.bootex.services.GreetingService;

import org.springframework.stereotype.Controller;

/**
 * @author seoeun
 * @since 2018.04.02
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
