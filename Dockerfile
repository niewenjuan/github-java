FROM 192.168.0.48:20202/servicestage_beta1/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/github-java-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
