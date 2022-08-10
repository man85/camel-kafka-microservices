#!/bin/bash

# blocks until kafka is reachable
kafka-topics.sh --bootstrap-server kafka:9092 --list

echo -e 'Creating kafka topics'
kafka-topics.sh --bootstrap-server kafka:9092 --create --if-not-exists \
          --topic consumer-topic \
          --partitions 6 \
          --replication-factor 1

kafka-topics.sh --bootstrap-server kafka:9092 --create --if-not-exists \
          --topic upper-case-text \
          --partitions 6 \
          --replication-factor 1

echo -e 'Successfully created the following topics:'
kafka-topics.sh --bootstrap-server kafka:9092 --list

connect-standalone.sh /opt/kafka/config/logger-connect-standalone.properties /opt/kafka/config/logger-connect-file-sink.properties
