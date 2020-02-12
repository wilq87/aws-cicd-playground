# aws-cicd-playground


Simple app for AWS CI/CD tests

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/gradle-plugin/reference/html/)
* [Coroutines section of the Spring Framework Documentation](https://docs.spring.io/spring/docs/5.2.3.RELEASE/spring-framework-reference/languages.html#coroutines)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#production-ready)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)




# Run
./gradlew bootRun


# Build
./gradlew clean build

# Docker
See:
https://docs.spring.io/spring-boot/docs/2.3.0.BUILD-SNAPSHOT/gradle-plugin/reference/html//#packaging-layered-jars
Building layered JARs and unpacking it inside docker container.
https://spring.io/blog/2020/01/27/creating-docker-images-with-spring-boot-2-3-0-m1

To run as docker 
make

To publish
make publish version=$(date '+%Y%m%d-%H%M%S')

# Spring 5 Reactive Webflux
https://www.baeldung.com/spring-security-5-reactive
https://spring.io/blog/2019/04/12/going-reactive-with-spring-coroutines-and-kotlin-flow
https://www.baeldung.com/spring-boot-kotlin-coroutines


# Deployment
https://github.com/aws-samples/ecs-refarch-cloudformation
https://aws.amazon.com/blogs/devops/use-aws-codedeploy-to-implement-blue-green-deployments-for-aws-fargate-and-amazon-ecs/
https://aws.amazon.com/blogs/containers/aws-codedeploy-now-supports-linear-and-canary-deployments-for-amazon-ecs/

# Cognito
https://docs.aws.amazon.com/cognito/latest/developerguide/tutorial-create-user-pool.html
https://www.baeldung.com/spring-security-oauth-cognito
https://www.baeldung.com/spring-oauth-login-webflux
https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#oauth2client