#!/bin/bash
cd /opt/kafka/kafka_2.13-3.2.0/bin;
./zookeeper-server-start.sh ../config/zookeeper.properties
./kafka-server-start.sh ../config/server.properties

./kafka-topics.sh --bootstrap-server kafka:9092 \
--create \
--topic consumer-topic \
--partitions 6 \
--replication-factor 1

./kafka-topics.sh --bootstrap-server kafka:9092 \
--create \
--topic upper-case-text \
--partitions 6 \
--replication-factor 1
