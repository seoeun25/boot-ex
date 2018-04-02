package com.lezhin.bootex.controller;

import com.lezhin.bootex.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author seoeun
 * @since 2018.04.02
 */
@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
