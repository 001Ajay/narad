# narad
Spring Integration project to validate NT KnowHow

### Zuul
Port : 9000
Routes - http://localhost:9000/actuator/routes 

### Eureka - Service Registry
Port : 8761  
Services - http://localhost:8761/  


### Receiver


spring:
  cloud.stream:
    defaultBinder: scl
    binders:
      scl:
        type: kafka
        environment.spring.cloud.stream:
          kafka.binder.brokers: "localhost:9092"
      scl1:
        type: kafka
        environment.spring.cloud.stream:
          kafka.binder.brokers: "localhost:9092"
    bindings:
      outputRequest:
        destination: "outputRequestDev"
        binder: scl1
    kafka.binder:
      autoAddPartitions: true


### Transformer
### Publisher

Tech Stack to Cover 

DONE - Zuul + Eureka (Need to upgrade too Spring Cloud Gateway)
In Progress - Docker, Kubernetes

TODO - CQRS, ReactJS, React-Redux, Marklogic, Kafka, Rabbit, Spring Integration
Concourse, Azure, Sonar
