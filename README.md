# narad
Spring Integration project with queues

### Service Registry
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-eureka-server</artifactId>
</dependency> 
<lombok.version>1.16.18</lombok.version>
app.yml------------------
server:
  port:8761
spring:
  profiles:
    active: local
  application:
    name: nar-service-registry

management:
  
  


### Receiver


application.yml


### Transformer
### Publisher
