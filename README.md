# Bridge
#### This project serves as a technical demonstration showcasing the interaction between a producer and a consumer through the Kafka messaging system. The MessageController and ProducerService collaborate to send messages to the Kafka topic, while the ConsumerService listens for these messages. Notably, the producer and consumer services can be implemented in separate applications, allowing modular development and deployment while maintaining seamless communication through Kafka topics.
## Flow
#### 1. A client makes an HTTP GET request to the /rest/api/producerMessage endpoint with a query parameter named message.
#### 2. The MessageController receives the request, extracts the message parameter, and calls the producerService.sendMessageToTopic(message) method.
#### 3. The ProducerService sends the message to the Kafka topic named "Topic_One" using the kafkaTemplate.
#### 4. The Kafka server (running on Docker) receives the message and publishes it to the "Topic_One".
#### 5. The ConsumerService is listening to the "Topic_One" topic with the specified consumer group "group_one".
#### 6. When a new message is published to the topic, the listenToTopic method in the ConsumerService is triggered, printing the received message to the console.
