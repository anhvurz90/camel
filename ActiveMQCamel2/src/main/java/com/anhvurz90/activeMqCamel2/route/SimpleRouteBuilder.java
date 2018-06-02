package com.anhvurz90.activeMqCamel2.route;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
        from("file:/home/anhvu/Desktop/camel/input")
        	.split()
        	.tokenize("\n")
        	.to("jms:queue:firstQueue");
	}

}
