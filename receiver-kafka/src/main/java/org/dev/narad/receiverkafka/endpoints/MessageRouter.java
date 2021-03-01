package org.dev.narad.receiverkafka.endpoints;

import lombok.extern.slf4j.Slf4j;
import org.dev.narad.receiverkafka.AppConstants;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;

@EnableBinding(Channels.class)
@Configuration
@Slf4j
public class MessageRouter {

    @Transformer(inputChannel = AppConstants.INPUT_CHANNEL,
            outputChannel = AppConstants.OUTPUT_CHANNEL)
    public Message<?> receiveMessage(Message<?> srcMessage){
        log.debug(srcMessage.getPayload().toString());
        return srcMessage;
    }

}
