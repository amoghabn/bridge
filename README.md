# Bridge
#### This project serves as a technical demonstration showcasing the interaction between a producer and a consumer through the Kafka messaging system. The MessageController and ProducerService collaborate to send messages to the Kafka topic, while the ConsumerService listens for these messages. Notably, the producer and consumer services can be implemented in separate applications, allowing modular development and deployment while maintaining seamless communication through Kafka topics.
## Flow
#### A client makes an HTTP GET request to the /rest/api/producerMessage endpoint with a query parameter named message.
#### The MessageController receives the request, extracts the message parameter, and calls the producerService.sendMessageToTopic(message) method.
#### The ProducerService sends the message to the Kafka topic named "Topic_One" using the kafkaTemplate.
#### The Kafka server (running on Docker) receives the message and publishes it to the "Topic_One".
#### The ConsumerService is listening to the "Topic_One" topic with the specified consumer group "group_one".
#### When a new message is published to the topic, the listenToTopic method in the ConsumerService is triggered, printing the received message to the console.
