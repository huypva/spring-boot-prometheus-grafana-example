FROM maven:3.6.3-jdk-11 AS builder
WORKDIR /workdir/hello-world
COPY pom.xml /workdir/hello-world/pom.xml
RUN mvn dependency:go-offline

COPY src /workdir/hello-world/src
RUN mvn install
RUN mkdir  -p target/depency
WORKDIR /workdir/hello-world/target/dependency
RUN jar -xf ../*.jar

FROM openjdk:11-jre-slim

EXPOSE 8081
VOLUME /tmp
ARG DEPENDENCY=/workdir/hello-world/target/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","io.codebyexample.helloworld.HelloWorldApplication"]
