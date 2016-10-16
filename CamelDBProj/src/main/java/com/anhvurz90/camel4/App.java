package com.anhvurz90.camel4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext(
                        "applicationContext-camel.xml");
        ctx.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Entered>>>>>>");
        ctx.stop();
    }
}
