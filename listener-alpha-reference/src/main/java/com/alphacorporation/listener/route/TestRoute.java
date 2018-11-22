package com.alphacorporation.listener.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Configuration;
import static org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent;

@Configuration
public class TestRoute extends RouteBuilder {

    @Override
    public void configure(){

        from("activemq:topic:ALPHA.TEST.ROUTE").log(LoggingLevel.INFO, "${body}").end();

    }
}
