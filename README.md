# ChatApp
A spring boot app coupled with kafka for messaging purpose

# Reference:
https://dev.to/subhransu/realtime-chat-app-using-kafka-springboot-reactjs-and-websockets-lc

# To start kafka server
C:\kafka\bin\windows>./kafka-server-start.bat ../../config/server.properties

# To create kafka topic
C:\kafka\bin\windows>kafka-topics --create --topic kafka-chat --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1

# To test the message has reached consumer in kafka topic
C:\kafka\bin\windows>kafka-console-consumer --bootstrap-server localhost:9092 --topic kafka-chat

# Why WebSockets?
Since Apache Kafka cannot send the Consumer Messages instantly to the client with Classical GET and POST operations.
I performed these operations using WebSockets which provide full-duplex bidirectional communication, which means that information can flow from the client to the server and also in the opposite direction simultaneously.
It is widely used in chat applications.



