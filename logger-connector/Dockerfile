FROM wurstmeister/kafka:2.12-2.3.0

COPY logger-connect-file-sink.properties /opt/kafka/config/

COPY logger-connect-standalone.properties /opt/kafka/config/

COPY start-kafka.sh /usr/bin/

RUN chmod a+x /usr/bin/start-kafka.sh
