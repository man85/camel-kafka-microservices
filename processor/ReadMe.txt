The app converts string to uppercase from Kafka topic 'consumer-topic' to 'upper-case-text'

To build and run the application:
1. Install Maven.
2. Install Java JDK 11 version.
3. Set 'JAVA_PATH' variable to Java JDK 11 path (e.g. 'export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64' in Linux)
4. Run 'mvn package' from current path.

To build Docker image:
1.  docker build -t string-processor .
