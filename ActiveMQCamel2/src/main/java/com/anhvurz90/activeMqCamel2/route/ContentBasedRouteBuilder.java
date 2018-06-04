package com.anhvurz90.activeMqCamel2.route;

import org.apache.camel.builder.RouteBuilder;

public class ContentBasedRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/home/anhvu/Desktop/camel").split().tokenize("\n").to("direct:test");
        
		//Content Based routing- Route the message based on the token it contains.
        from("direct:test"). 
        choice().
        when(body().contains("text1"))
        .to("jms:queue:text1").
        when(body().contains("text2"))
        .to("jms:queue:text2")
        .when(body().contains("text3"))
        .to("jms:queue:text3").
        otherwise().
        to("jms:queue:otherwise");
	}

}
