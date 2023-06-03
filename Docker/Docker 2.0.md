Getting Started with Docker

Part-2

**Saving Images and Containers as Tar Files**


**Building Docker Image and Pushing it to Docker Hub**

- In this section we will be build a docker image based on alpine linux:

```
docker pull alpine:latest
```

- Checking for the downloaded image

```
docker images
```

- Run the Downloaded Docker Image.

```
docker run -dit alpine:latest
```
![Image 1](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ab601d821faa8d675c728a6317ad30514bf73975/Images/Screenshot%202023-05-23%20223046.png)

- Checking for the running container

```
docker ps
```

- Updating the APK packages.

```
apk update

apk add git

```

![Image 2](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ab601d821faa8d675c728a6317ad30514bf73975/Images/Screenshot%202023-05-23%20223834.png)

- Commiting the changes to the container.

```
docker commit -m "Added GIT to image" dd9ee08c911c abhinav41999/alpine-git
```

- Checking for the commited image

```
docker images
```

![Image 3](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ab601d821faa8d675c728a6317ad30514bf73975/Images/Screenshot%202023-05-23%20224338.png)


- Tagging the image

```
docker tag abhinav41999/alpine-git abhinav41999/alpine-git:latest
```

- Checking for the tagged image

```
docker images
```

![Image 4](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ab601d821faa8d675c728a6317ad30514bf73975/Images/Screenshot%202023-05-23%20224940.png)

- Pushing the image to Docker Hub

```
docker push abhinav41999/alpine-git:latest
```

![Image 5](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ab601d821faa8d675c728a6317ad30514bf73975/Images/Screenshot%202023-05-23%20225224.png)

**DockerFile**

A Dockerfile is a text document with all the commands a user is needed to call over the command line to assemble an image. In other words you can say a docker file as a recipe required to create an image.

A Dockerfile must be created with no extension. To do this in Windows, create the file with your editor of choice, then save it with the notation "Dockerfile" (including the quotes).

**Creating an Image with GIT installed**

- Create a Docker File.

```
FROM alpine:3.5
RUN apk update
Run apk add git
```

- Build the Docker Image.

```
docker build -t abhinav41999/alpine-git .
```

![Image 6](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ce85f32ca6929d0d71ebf3a263f0c3411dce5aad/Images/Screenshot%202023-05-25%20193506.png)

- Checking for the image.

```
docker images
```

![Image 7](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ce85f32ca6929d0d71ebf3a263f0c3411dce5aad/Images/Screenshot%202023-05-25%20193622.png)

- Tagging the image and Checking for the image.

```
docker tag abhinav41999/alpine-git:latest abhinav41999/lab-git:v1.0

docker images
```

![Image 8](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ce85f32ca6929d0d71ebf3a263f0c3411dce5aad/Images/Screenshot%202023-05-25%20194222.png)

- Creating a container from the image.

```
docker run -itd abhinav41999/lab-git:v1.0 /bin/sh
```

- Checking for the running container.

```
docker ps
```

- Checking for the git version in the container.

```
docker attach ddd2
```

![Image 9](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/ce85f32ca6929d0d71ebf3a263f0c3411dce5aad/Images/Screenshot%202023-05-25%20194450.png)

- Checking for the git version in the container.

```
git --version
```

**Creating an Image with ADD instruction**

- Creating a Docker File.

```
FROM alpine:3.5
Run apk update
ADD http://www.vlsitechnology.org/pharosc_8.4.tar.gz .
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/alpine-add .
```

![Image 10](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/16c7773631b26f8e35f3863051767ddacfe0baa1/Images/Screenshot%202023-05-28%20142446.png)


- Tagging the created docker image.

```
docker tag abhinav41999/alpine-add:latest abhinav41999/alpine-add:v1.0
```

![Image 11](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/16c7773631b26f8e35f3863051767ddacfe0baa1/Images/Screenshot%202023-05-28%20142512.png)

- Checking for the created image.

```
docker images
```

![Image 12](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/16c7773631b26f8e35f3863051767ddacfe0baa1/Images/Screenshot%202023-05-28%20142630.png)

- Running the recently created image.

```
docker run -itd abhinav41999/alpine-add:v1.0 /bin/sh
```

![Image 13](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/16c7773631b26f8e35f3863051767ddacfe0baa1/Images/Screenshot%202023-05-28%20142716.png)

- Checking for the running container.

```
docker ps
```

- Checking for the downloaded file in the container.

```
docker attach 064d

ls -ltr
```

![Image 14](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/16c7773631b26f8e35f3863051767ddacfe0baa1/Images/Screenshot%202023-05-28%20142805.png)

**Creating an Image with COPY instruction**

- Creating a Docker File.

```
FROM nginx:alpine
LABEL maintainer="Collabnix"

COPY index.html /usr/share/nginx/html/
ENTRYPOINT ["nginx", "-g", "daemon off;"]
```

- Creating a index.html file.

```
"Welcome to Dockerlabs!!!`
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/cpyv1.0:v1.0 .
```

![Image 15](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/52e2aae606bdaddfb9883d32950233455c9f2779/Images/Screenshot%202023-05-29%20223823.png)

- Checking and Running the recently created image.

```
docker images
```

![Image 16](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/52e2aae606bdaddfb9883d32950233455c9f2779/Images/Screenshot%202023-05-29%20224414.png)

```
docker container run -d --rm --name myapp -p 80:80 abhinav41999/cpyv1.0:v1.0
```

![Image 17](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/52e2aae606bdaddfb9883d32950233455c9f2779/Images/Screenshot%202023-05-29%20225535.png)

- Checking the localhost for the output of the index.html file.

```
http://localhost/
```

![Image 18](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/52e2aae606bdaddfb9883d32950233455c9f2779/Images/Screenshot%202023-05-29%20224420.png)


- Editing the existing dockerfile with the below content. This contains the COPY instruction in Multi-Stage Dockerfile.

```
FROM alpine AS stage1
LABEL maintainer="Collabnix"
RUN echo "Welcome to Docker Labs!" > /opt/index.html

FROM nginx:alpine
LABEL maintainer="Collabnix"
COPY --from=stage1 /opt/index.html /usr/share/nginx/html/
ENTRYPOINT ["nginx", "-g", "daemon off;"]
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/cpyv1.1:v1.1 .
```

![Image 19](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/52e2aae606bdaddfb9883d32950233455c9f2779/Images/Screenshot%202023-05-29%20225416.png)

- Running the created Docker Image.

```
docker container run -d --rm --name myapp2 -p 8080:80 abhinav41999/cpyv1.1:v1.1
```

![Image 20](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/52e2aae606bdaddfb9883d32950233455c9f2779/Images/Screenshot%202023-05-29%20225554.png)

- Checking the localhost for the output of the index.html file.

```
http://localhost:8080/
```

![Image 21](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/52e2aae606bdaddfb9883d32950233455c9f2779/Images/Screenshot%202023-05-29%20225656.png)


**Creating an Image and adding CMD instruction**

- Creating a Docker File.

```
FROM alpine:3.6
RUN apk update
CMD echo 'Hello world'
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/cmdv1.0:v1.0 .
```

![Image 22](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/cb15517b08e27c4c5c3eafb595a8772e1261f08f/Images/Screenshot%202023-06-01%20211110.png)

- Checking for the created image.

```
docker images
```

![Image 23](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/cb15517b08e27c4c5c3eafb595a8772e1261f08f/Images/Screenshot%202023-06-01%20211209.png)

- Running the created Docker Image.

```
docker run abhinav41999/cmd1.0:1.0
```

![Image 24](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/cb15517b08e27c4c5c3eafb595a8772e1261f08f/Images/Screenshot%202023-06-01%20220642.png)


**Creating an Image and adding ENTRYPOINT instruction**

- Creating a Docker File. In this case we are using the ENTRYPOINT instruction in Executable form.

```
FROM alpine:3.6
RUN apk update

ENTRYPOINT ["/bin/echo", "Hello in this for you can see entrypoint instructuion in Executable form !!!"]
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/entrypoint:v1.0 .
```

![Image 25](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd82568b38aaeb4fb8705a99991e8dc8f1d65060/Images/Screenshot%202023-06-01%20222723.png)

- Checking for the created image.

```
docker images
```

![Image 26](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd82568b38aaeb4fb8705a99991e8dc8f1d65060/Images/Screenshot%202023-06-01%20222917.png)

- Running the created Docker Image.

```
docker run abhinav41999/entrypoint:v1.0
```

![Image 27](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd82568b38aaeb4fb8705a99991e8dc8f1d65060/Images/Screenshot%202023-06-01%20223007.png)

- Creating a Docker File. In this case we are using the ENTRYPOINT instruction in Shell form.

```
FROM alpine:3.6
RUN apk update

ENTRYPOINT echo "Hello in this for you can see entrypoint instruction in Shell form !!!"
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/entrypoint:v2.0 .
```

![Image 28](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd82568b38aaeb4fb8705a99991e8dc8f1d65060/Images/Screenshot%202023-06-01%20223524.png)

- Checking for the created image.

```
docker images
```

![Image 29](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd82568b38aaeb4fb8705a99991e8dc8f1d65060/Images/Screenshot%202023-06-01%20223605.png)

- Running the created Docker Image.

```
docker run abhinav41999/entrypoint:v2.0
```

![Image 30](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd82568b38aaeb4fb8705a99991e8dc8f1d65060/Images/Screenshot%202023-06-01%20223636.png)

- Running the container and overriding the ENTRYPOINT instruction.

```
 docker run --entrypoint "bin/echo" abhinav41999/entrypoint:v2.0 "Hello Guys, I am taking over the existing entrypoint !!!"
```

![Image 31](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd82568b38aaeb4fb8705a99991e8dc8f1d65060/Images/Screenshot%202023-06-01%20224221.png)


**WORKDIR instruction**

- Creating a Docker File. In this docker file we will be using the WORKDIR instruction which lets us set the working directory.

```
FROM alpine:3.9.3

RUN apk update

WORKDIR /opt/folder1
RUN echo "Hello Guys, This is my first Dockerfile inside this container" > amp.txt

WORKDIR /var/tmp
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/workdirv1.0:v1.0 .
```

![Image 32](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f0db1dff9b4ecdeb11ad38185d964734651a60a2/Images/Screenshot%202023-06-01%20225808.png)

- Checking for the created image.

```
docker images
```

![Image 33](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f0db1dff9b4ecdeb11ad38185d964734651a60a2/Images/Screenshot%202023-06-01%20225841.png)

- Running the created Docker Image with the command "pwd" to check the working directory which we set in the Dockerfile.

```
docker run abhinav41999/workdirv1.0:v1.0 pwd
```

![Image 34](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f0db1dff9b4ecdeb11ad38185d964734651a60a2/Images/Screenshot%202023-06-01%20230039.png)

- Creating a docker file in which we will be setting the environment variable as path.

```
FROM alpine:3.9.3

RUN apk update

ENV DIRPATH /mypath

WORKDIR $DIRPATH
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/workdirv2.0:v2.0 .
```

![Image 35](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f0db1dff9b4ecdeb11ad38185d964734651a60a2/Images/Screenshot%202023-06-01%20230705.png)

- Checking for the created image.

```
docker images
```

![Image 36](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f0db1dff9b4ecdeb11ad38185d964734651a60a2/Images/Screenshot%202023-06-01%20230813.png)

- Running the created Docker Image with the command "pwd" to check the working directory which we set in the Dockerfile.

```
docker run abhinav41999/workdirv2.0:v2.0 pwd
```

![Image 37](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f0db1dff9b4ecdeb11ad38185d964734651a60a2/Images/Screenshot%202023-06-01%20230922.png)

- Creating a docker file in which we will be creating multiple directories.

```
FROM alpine:3.9.3

RUN apk update

ENV DIRPATH /opt

WORKDIR $DIRPATH

RUN echo "Welcome to Docker Practice" > opt1.txt

WORKDIR folder1

RUN echo "Welcome to Docker Practice" > folder1.txt

WORKDIR folder2

RUN echo "Welcome to Docker Practice" > folder2.txt
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/workdir3.0:v3.0 .
```

![Image 38](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/0dc92419c170fc0db4b8c5e4b7504255395a6ca0/Images/Screenshot%202023-06-02%20223924.png)

- Checking for the created image.

```
docker images
```

![Image 39](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/0dc92419c170fc0db4b8c5e4b7504255395a6ca0/Images/Screenshot%202023-06-02%20224023.png)

- Running the created Docker Image with the command "PWD" to check the working directory which we set in the Dockerfile.

```
docker run -it abhinav41999/workdir3.0:v3.0 pwd
```

![Image 40](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/0dc92419c170fc0db4b8c5e4b7504255395a6ca0/Images/Screenshot%202023-06-02%20224235.png)

**RUN instruction**

- Create a Dockerfile with the RUN instruction.

```
FROM alpine:3.9.3

RUN apk update

RUN apk add --update

RUN apk add curl

RUN rm -rf /var/cache/apk/

RUN date > date.txt

RUN cat date.txt
```

- Building the Docker Image from the Docker File.

```
docker build -t abhinav41999/run_insv1:v1.0 .  
```

![Image 41](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20120549.png)


- Checking the layers of the Docker Image.

```
docker image history abhinav41999/run_insv1:v1.0
```

![Image 42](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20121329.png)

- Checking for the created image.

```
docker images
```

![Image 43](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20120626.png)

- Running the created Docker Image.

```
docker run -it abhinav41999/run_insv1:v1.0
```

![Image 44](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20122631.png)

- Checking the date.txt file.

```
cat date.txt
```

- Create a Dockerfile with the RUN instruction.

```
FROM alpine:3.9.3

RUN apk add --update && \
    apk add curl && \
    rm -rf /var/cache/apk/
```

- Building the Docker Image from the Docker File.

```
docker image build -t run_insv2:v2.0 .
```

![Image 45](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20123347.png)

- Checking for the created image.

```
docker images
```

![Image 46](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20123750.png)

- Checking the layers of the Docker Image.

```
docker image history run_insv2:v2.0
```

![Image 47](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20124145.png)

- Running the created Docker Image.

```
docker run run_insv2:v2.0
```

![Image 48](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/4102e058c74a62b5cb966767206b92d4f92dfb00/Images/Screenshot%202023-06-03%20125556.png)