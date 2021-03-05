FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/demouserforkube-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
EXPOSE 9090
ENTRYPOINT java -Dvaadin.productionMode -jar app.jar




