# aws-cicd-playground


Simple app for AWS CI/CD tests





# Run
./gradlew bootRun


# Build
./gradlew clean build

# Docker
Building layered JARs and unpacking it inside docker container.
See:
https://docs.spring.io/spring-boot/docs/2.3.0.BUILD-SNAPSHOT/gradle-plugin/reference/html//#packaging-layered-jars
https://spring.io/blog/2020/01/27/creating-docker-images-with-spring-boot-2-3-0-m1

docker build . --tag awscicd

# Docker run

docker run -p 8080:8080 awscicd
