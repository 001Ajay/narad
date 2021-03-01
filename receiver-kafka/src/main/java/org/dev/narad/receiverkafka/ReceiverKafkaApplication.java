package org.dev.narad.receiverkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@SpringBootApplication(scanBasePackages = {"org.dev.narad.*"})
public class ReceiverKafkaApplication {

    @Autowired
    private DiscoveryClient discoveryClient;

    public static void main(String[] args) {
        SpringApplication.run(ReceiverKafkaApplication.class, args);
    }

}
