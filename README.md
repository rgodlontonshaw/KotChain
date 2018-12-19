# Kotcoin - a simple blockchain in Kotlin


## Running

To run this application, simply execute:

gradlew run

## Public API

After running the application, the public instance is available at http://localhost:7000
As for now, it offers the following endpoints:
* `GET /blocks` for listing all existing blocks in the chain
* `POST /blocks/mine` for mining new block

## Credit

This project uses some open source libraries:
* [Apache Commons Codec](https://github.com/apache/commons-codec)
* [JavaLin](https://javalin.io/)
* [Jackson Module Kotlin](https://github.com/FasterXML/jackson-module-kotlin)
