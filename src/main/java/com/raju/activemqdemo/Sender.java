/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.activemqdemo;

import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

/**
 *
 * @author ismailu
 */
public class Sender {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Sender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message) {
        LOGGER.info("Sending message'{}'" + message);
        jmsTemplate.convertAndSend("helloworld.q", message);
    }

}
