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