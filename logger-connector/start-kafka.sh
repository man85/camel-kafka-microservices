#!/bin/bash

#exec "/opt/kafka/bin/connect-standalone.sh" "/opt/kafka/config/logger-connect-standalone.properties" "/opt/kafka/config/logger-connect-file-sink.properties"
connect-standalone.sh /opt/kafka/config/logger-connect-standalone.properties /opt/kafka/config/logger-connect-file-sink.properties
