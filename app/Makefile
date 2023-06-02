.DEFAULT_GOAL := build-run

clean:
	./gradlew clean

build:
	./gradlew clean build

run-dist:
	./build/install/app/bin/app

install:
	./gradlew clean install

run:
	./gradlew run

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain checkstyleTest

update-deps:
	./gradlew useLatestVersions

build-run: build run

.PHONY: build
