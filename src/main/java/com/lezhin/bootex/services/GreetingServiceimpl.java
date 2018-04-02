package com.lezhin.bootex.services;

import org.springframework.stereotype.Service;

/**
 * @author seoeun
 * @since 2018.04.02
 */
@Service
public class GreetingServiceimpl implements GreetingService {

    public static final String HELLO_AZRAEL = "Hello seoeun";

    @Override
    public String sayGreeting() {
        return HELLO_AZRAEL;
    }
}
