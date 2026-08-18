package dev.java10x.email.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component
public class EmailConsumer {

    Logger logger = Logger.getLogger(getClass().getName());

    @RabbitListener
    public void listenEmailQueue(@Payload String message) {
        logger.info("Message");
    }
}
