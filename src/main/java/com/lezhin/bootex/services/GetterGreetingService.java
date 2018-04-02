package com.lezhin.bootex.services;

import org.springframework.stereotype.Service;

/**
 * @author seoeun
 * @since 2018.04.02
 */
@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
