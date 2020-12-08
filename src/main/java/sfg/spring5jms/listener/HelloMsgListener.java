package sfg.spring5jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import sfg.spring5jms.config.JmsConfig;
import sfg.spring5jms.model.HelloWorldMessage;

import javax.jms.Message;

@Component
public class HelloMsgListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage, @Headers MessageHeaders headers,
                       Message message) {

        System.out.println("Message received: " + helloWorldMessage.getMessage());

    }

}
