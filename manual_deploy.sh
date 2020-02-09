#!/bin/bash

dt=$(date '+%Y%m%d-%H%M%S');
echo "$dt"

./gradlew clean build

$(aws ecr get-login --no-include-email --region eu-west-1)
docker build . --tag "awscicd-test"
docker tag awscicd-test:latest 031709530795.dkr.ecr.eu-west-1.amazonaws.com/awscicd-test:latest
docker push 031709530795.dkr.ecr.eu-west-1.amazonaws.com/awscicd-test:latest