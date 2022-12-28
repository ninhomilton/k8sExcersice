FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} k8sExercise-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/k8sExercise-0.0.1-SNAPSHOT.jar"]
