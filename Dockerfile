FROM 100.125.5.235:20202/cpe/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/cse-ui-project-n27097-0.0.1-SNAPSHOT.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
