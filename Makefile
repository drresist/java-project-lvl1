run-dist:
	./app/build/install/app/bin/app

build-and-install:
	chmod +x gradlew
	./gradlew build
	./gradlew installDist