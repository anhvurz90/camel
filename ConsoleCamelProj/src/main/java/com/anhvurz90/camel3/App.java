package com.anhvurz90.camel3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext-camel.xml");
        ctx.start();
        Thread.sleep(10 * 1000);
        System.out.println("Entered>>>>>");
        ctx.stop();
    }
}
