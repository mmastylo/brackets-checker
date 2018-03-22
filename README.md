# Brackets checker

This project checks if brackets are balanced in given string.

## Getting Started


### Installing

Install [Maven](https://maven.apache.org/) first.


## Running & Tests

### Running

Project is a Maven project. It can be built with following command:

```
mvn clean package
```

Brackets checker can be run in console from root folder with following command :

```
java -jar target/brackets-0.0.1-SNAPSHOT.jar "path to file"
```

where "path to file" is an absolute path to text file located on disk and containing string to check.

### Tests

Tests can be run with following command:

```
mvn test
```

## Validation

Brackets checker validates if path is provided and if file exists in given location. Algorithm throws IllegalArgumentException if given string is null.

## Used libraries

* JUnit