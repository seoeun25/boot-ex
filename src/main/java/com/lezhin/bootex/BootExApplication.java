package com.lezhin.bootex;

import com.lezhin.bootex.controller.ConstructorInjectedController;
import com.lezhin.bootex.controller.GetterInjectedController;
import com.lezhin.bootex.controller.MyController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * To start application with profile(local)
 * <p>
 * $ gradle bootRun
 * </p>
 * <p>
 * see the build.gradle
 */
@SpringBootApplication
public class BootExApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootExApplication.class, args);

        // DI demo. @Controller로 annotation해서 bean이 생성. context를 통해서 bean을 얻을 수 있다.
        ApplicationContext ctx = SpringApplication.run(BootExApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());


    }
}
