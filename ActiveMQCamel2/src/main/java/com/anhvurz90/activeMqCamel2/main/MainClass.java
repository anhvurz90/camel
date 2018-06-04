package com.anhvurz90.activeMqCamel2.main;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.anhvurz90.activeMqCamel2.route.ContentBasedRouteBuilder;
import com.anhvurz90.activeMqCamel2.route.SimpleRouteBuilder;

public class MainClass {

	public static void main(String[] args) {
		RouteBuilder simpleRouteBuilder = new SimpleRouteBuilder();
		RouteBuilder contentBasedRouteBuilder = new ContentBasedRouteBuilder();
		CamelContext ctx = new DefaultCamelContext();

		// configure jms component
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://0.0.0.0:61616");
		ctx.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));

		try {
			ctx.addRoutes(contentBasedRouteBuilder);
			ctx.start();
			Thread.sleep(5 * 60 * 1000);
			ctx.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
