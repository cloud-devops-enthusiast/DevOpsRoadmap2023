**Image With Git installation.**

```
FROM alpine:3.5
RUN apk update
Run apk add git
```

**Image with ADD instruction.**

```
FROM alpine:3.5
Run apk update
ADD http://www.vlsitechnology.org/pharosc_8.4.tar.gz .
```

**Image with COPY instruction.**

```
FROM nginx:alpine
LABEL maintainer="Collabnix"

COPY index.html /usr/share/nginx/html/
ENTRYPOINT ["nginx","-g","daemon off;"]
```

```
FROM alpine:3.6
RUN apk update

ENTRYPOINT ["/bin/echo", "Hello in this for you can see entrypoint instructuion in Executable form !!!"]
```