FROM alpine:3.9.3

RUN apk update

ENV DIRPATH /opt

WORKDIR $DIRPATH

RUN echo "Welcome to Docker Practice" > opt1.txt

WORKDIR folder1

RUN echo "Welcome to Docker Practice" > folder1.txt

WORKDIR folder2

RUN echo "Welcome to Docker Practice" > folder2.txt