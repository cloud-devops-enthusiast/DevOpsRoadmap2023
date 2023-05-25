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