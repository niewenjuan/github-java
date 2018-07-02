FROM 100.125.32.42:20202/hwcpe/as-docker-java:1.11.2-8

WORKDIR /home/apps/
ADD target/github-java-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
