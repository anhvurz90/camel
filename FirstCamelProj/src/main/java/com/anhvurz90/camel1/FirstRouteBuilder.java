package com.anhvurz90.camel1;

import org.apache.camel.builder.RouteBuilder;

public class FirstRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/anhvu/Desktop/camel/input?noop=true")
        .process(new LogProcessor())
        .bean(new Transformer(), "transformContent")
        .to("file:/home/anhvu/Desktop/camel/output");
    }

}
