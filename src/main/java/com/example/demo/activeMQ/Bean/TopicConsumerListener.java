package com.example.demo.activeMQ.Bean;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumerListener {

    @JmsListener(destination = "$(spring.activemq.topic-name}", containerFactory="topicListener")
    public void readActiveTopic(String message) {
        System.out.println("topic received: " + message);
    }
}
