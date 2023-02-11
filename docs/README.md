# WIP 02-11-2023
# requires java11 + basic tor outbound access
# java -jar bitnet-exchange.jar
# BASED OFF OF Bisq 
# QR code deposit is broken right now
# adjusted "trade offer" deposit wallet to -> legacy addresses instead of segwit addresses to support the api/tx broadcast function to avoid rpc errors (bitnet doesnt support segwit addresses to send or receive)

* pretty straight forward
* use build script build-bitnet-exchange.sh to build with java 11 jdk installed (openjdk-11-jdk)
* then run program with java -jar bitnet-exchange.jar
* check releases for the already made java binary

