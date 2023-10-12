# WIP 02-11-2023

# absoloutely requires java11 + basic tor outbound access (will not work with java 17 or java 8 or versions of java higher or lower than 11)
* running the exchange
java -jar bitnet-exchange.jar


about bitnet-exchange 
```
BASED OFF OF Bisq 
 QR code deposit is broken right now
 adjusted "trade offer" deposit wallet to -> legacy addresses instead of segwit
 addresses to support the api/tx broadcast function to avoid rpc errors (bitnet 
 doesnt support segwit addresses to send or receive)
```

# building the project with java 11 openjdk
* pretty straight forward
* use build script build-bitnet-exchange.sh to build with java 11 jdk installed (openjdk-11-jdk)
* then run program with java -jar bitnet-exchange.jar
* check releases for the already made java binary

# data dir location
* linux user data-dir is located in /root/.local/share/BitnetX-exchange or /home/user/.local/share/BitnetX-exchange
* windows user data-dir is located in C:/users/AppData/Roaming/BitnetX-exchange
