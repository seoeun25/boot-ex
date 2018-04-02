package com.lezhin.bootex.controller;

import org.springframework.stereotype.Controller;

/**
 * {@link org.springframework.context.ApplicationContext} 를 통해서 bean을 얻은 후,
 * bean 을 통해서 접근 하는 예. hello() 호출.
 * Spring이 객체를 생성하고, DI 를 통해서 주거나, context 를 통해서 get 할 수 있다.
 *
 * @author seoeun
 * @since 2017.10.21
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("---- hello!!");

        return "foo";
    }
}
