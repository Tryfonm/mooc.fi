FROM ubuntu:18.04

RUN apt-get update && apt-get install -y curl
WORKDIR /usr/src/app

COPY webScript.sh .

CMD ./webScript.sh
