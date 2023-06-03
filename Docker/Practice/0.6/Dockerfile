FROM alpine:3.9.3

#Setting a default value to an argument

ARG WELCOME_USER=centurix

ENV DIRPATH /opt

WORKDIR $DIRPATH

RUN echo "Welcome ${WELCOME_USER}, to the immersive world of Docker" > message.txt

CMD cat message.txt