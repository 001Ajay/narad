package org.dev.narad.receiverkafka.endpoints;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface Channels {

    @Input("inputChannel")
    MessageChannel inputChannel();

    @Input("outputChannel")
    MessageChannel outputChannel();
}
