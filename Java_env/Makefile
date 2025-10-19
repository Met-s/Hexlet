GR = ./gradlew
COMMAND?= -h
BASH = -bash
CE = 546
SHeELL := /bin/bash
#$(shell ./set.sh)

#source
run_file:
	. ./set.sh

var:
	$(origin CE)

.PHONY: do

do:
	sh ./set.sh

prerequisites: do

target: prerequisites

set.sh:
	echo



en:
	source /home/admint/Hexlet/Java_env/set.sh

ena:
	./build/install/Java_env/bin/Java_env



setup:
	$(GR) wrapper --gradle-version 8.11

clean:
	$(GR) clean

build:
	$(GR) build

clean-build: clean build

install:
	$(GR) clean install

run-dist:
	./build/install/Java_env/bin/Java_env

run:
	$(GR) run

test:
	$(GR) test

report:
	$(GR) jacocoTestReport

lint:
	$(GR) checkstyleMain

update-deps:
	$(GR) refreshVersions
	# ./gradlew wrapper --gradle-version 9.0.0

build-run: build run

jar:
	gradle installDist

jar-dist: clean-build jar run-dist

sonar:
	export SONAR_TOKEN=1999689c3a5feff3bc1a6a0d37a1bfdff335500f
	$(GR) sonar

date:
	node src/main/resources/date

.PHONY: build
