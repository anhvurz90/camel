package com.anhvurz90.camel2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext-camel.xml");
        
        ctx.start();
        System.out.println("Entered>>>>>>>>>");
        Thread.sleep(5 * 60 * 1000);
        ctx.stop();
    }
}
