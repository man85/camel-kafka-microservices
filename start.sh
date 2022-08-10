#!/bin/bash

# Build http-receiver jar file
cd http-receiver
mvn clean
mvn package
cd ..

# Build processor jar
cd processor
mvn clean
mvn package
cd ..

# Build Docker images
docker-compose build

# Run Docker containers
docker-compose up -d

