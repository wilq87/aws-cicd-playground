# make publish version=$(date '+%Y%m%d-%H%M%S')

name = awscicd-test
registry = 031709530795.dkr.ecr.eu-west-1.amazonaws.com
version ?= 1.0

all: run

build:
	$(call blue, "Building application")
	./gradlew clean build

image: build
	$(call blue, "Building docker image...")
	docker build -t ${name}:latest .

run: build image
	$(call blue, "Running Docker image locally...")
	docker run -i -t --rm -p 8080:8080 ${name}:latest

publish: build image
	$(call blue, "Publishing Docker image to registry...")
	$(aws ecr get-login --no-include-email --region eu-west-1)
	docker tag ${name}:latest ${registry}/${name}:latest
	docker tag ${name}:latest ${registry}/${name}:${version}
	docker push ${registry}/${name}:latest
	docker push ${registry}/${name}:${version}

define blue
	@tput setaf 6
	@echo $1
	@tput sgr0
endef