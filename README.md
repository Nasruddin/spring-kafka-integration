# spring-kafka
* Playground for Spring + Kafka + Microservices

## Requirement
* Java 8
* Kafka
* Docker

## Running the sample app

* Starting zookeeper & kafka server
```
    ./bin/zookeerper-server-start.sh ./config/zookeeper.properties
    
    ./bin/kafka-server-start.sh ./config/server.properties
```
* Alternatively, you can also use docker, I have added docker-compose.yml
```
cd spring-kafka-integration

docker compose up -d

```
* You can now run Producer and Consumer application
```
    cd spring-kafka/kafka-producer
    mvn spring-boot:run
    
    cd spring-kafka/kafka-consumer
    mvn spring-boot:run
```

##Testing
* Now you can open Postman and hit the API

![Alt text](https://github.com/Nasruddin/spring-kafka-integration/blob/master/images/publish.JPG "Publisher")

* You can navigate local development environment, check the console for the received message
![Alt text](https://github.com/Nasruddin/spring-kafka-integration/blob/master/images/consumer.JPG "Publisher")

## Contributors
Nasruddin @iam_nasir
Email: nasruddin.java@gmail.com


