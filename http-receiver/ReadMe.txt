The app listens 'http://localhost:8080' and sends incoming post requests body to
Kafka 'localhost:9092' server 'consumer-topic' topic

To build and run the application:
1. Install Maven.
2. Install Java JDK 11 version.
3. Set 'JAVA_PATH' variable to Java JDK 11 path (e.g. 'export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64' in Linux)
4. Run 'mvn package' from current path.

To build Docker image:
1.  docker build -t http-receiver .
