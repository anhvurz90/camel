package com.anhvurz90.camel2;

public class Transformer {

    public String transformContent(String body) {
        System.out.println("Invoking the transformContent method...");
        return body.toUpperCase();
    }
}
