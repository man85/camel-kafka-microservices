FROM wurstmeister/kafka:2.13-2.8.1

COPY logger-connect-file-sink.properties /opt/kafka/config/

COPY logger-connect-standalone.properties /opt/kafka/config/

COPY start-kafka.sh /usr/bin/

RUN chmod a+x /usr/bin/start-kafka.sh
