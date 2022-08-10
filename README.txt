The App receives POST requests with a text body on localhost:8080,
transforms the text to upper case and save it into 'tmp\logged-upper-case-text-topic.txt' file.

The 'http-receiver' gets a request in passes it to 'consumer-topic', then
the 'processor' transforms text from 'consumer-topic' to upper case and saves it
in 'upper-case-text' topic. After that, 'logger-connector' saves messages from 'upper-case-text'
topic into '/tmp/logged-upper-case-text-topic.txt'.

Prerequisites:
1. Docker should be installed
2. Maven should be installed
3. JDK 11 should be installed and 'JAVA_PATH' variable should be set to Java JDK 11 path

Run the App: start.sh
Stop the App: stop.sh
