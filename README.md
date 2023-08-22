# kafka_real_project

list :
1. edit the pom inside kafka-real-project - >pom<
2. reload the parent project (maven changes)
3. Create new Module kafka-producer-wikimedia
4. reload the parent project (maven changes)
5. make kafka-producer-wikimedia spring boot project
6. net.mic.spring -> SpringBootProducerApplication (main method)
7. run it
8. to make user --- >> mvn clean install
9. inside kafka-producer-wikimedia ,packaging as jar
10. mvn clean install
11. now config kafka producer and create a topic
12. create -> application.properties
13. create kafka topic --> KafkaTopicConfig (public NewTopic topic() ...)
14. << producer implementation >>
15. Service : WikimediaChangesProducer
16. add event source dependency - to read time stream data from wikimedia 
17. jackson json - dependency
18. jason databind - dependency
19. WikimediaChangesHandler implement EventHandler (eventsource)
20. onMessage()
21. 

## after adding new module and adding the spring boot
## in order to verify this Spring Boot project setup
```
mvn clean install
```