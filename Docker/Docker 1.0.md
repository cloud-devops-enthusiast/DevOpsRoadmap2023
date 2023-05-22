**What is Docker?**

Docker is more of like a scalable bag which can be used for any use-case whether it's a office trip or holiday trip or moving to any city, whose size can be increased or decreased as per the requirement. Docker cosists of containers which can be used to pack and ship any application with all its dependencies. Using docker over virtual machines is more efficient because it uses the same kernel as the host machine and hence it is more lightweight.

In other words:

- A package for your application with all its dependencies

- Isolation of the application from the host and other applications

- Shareable and portable

- Works for all major platforms

- Lightweight, as they use the same kernel as the host machine

**What makes containers so small?**

- Container = User Space of OS

- User Space refers to all of the code in an operating system that lives outside of the kernel.

```
Process Virtualization :
    ------------------                                       --------------------
    |   User Space   |                                       |   Kernal Space   |                                       
    |                |                                       |   ------------   |
    |  --------------------System Calls--------------------->|   |   RAM    |   |
    |  ------------  |                                       |   ------------   |
    |  |  Process |  |                                       |   ------------   |
    |  ------------  |                                       |   |   CPU    |   |
    ------------------                                       |   ------------   |
                                                             --------------------
```
**Container= User Space of OS**

**Docker Vocabulary**

- Docker Image: The basis of a docker container. This represents a full application with all dependencies.

- Docker Container: The standard unit in the docker's ecosystem, into which the application service resides and executes.

- Docker Engine: It Creates, Ships and runs Docker containers deployable on a physical or virtual, host locally, in a data center or in the cloud.

- Registry Service: Cloud or Server based storage and distribution of Docker images. (Docker Hub or Docker Trusted Registry)

**Docker Architecture**

![Docker Engine Architecture](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/d7c39faf881a8ce5f8049ff161b26828dd9e4de1/Images/docker_eng_arch.png "Docker Engine Architecture")

Reference to above Image: https://hemanta.io/a-detailed-guide-to-docker-engine/

*Containerd:* Containerd is the container life cycle (Start | Pause | Stop | Restart | Delete) management daemon. It is responsible for pulling images from the registry, unpacking them, and running the application.

*runc:* runc is a container runtime tool, whose use is to create containers. The layer of the container is created by runc. The layer that runc operates at is called the OCI Layer. runc interfaces with the kernal of the OS to pull all the layers of the container and create a container. The container process is started with a child process of runc and as soon it starts, runc exits.

*shim:* The shim makes sure that the container process is running and it is possible to decouple the running containers from the daemon for the purpose of restarting the daemon or daemon upgrades.

**Containerd creates a new instance of runc for every container that it creates. Once each container is created the parent runc process exits, the associated containerd-shim process becomes the container’s direct parent.**

![Docker Architecture](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bd1a3acdc40b017c3df8971481817b6a88c41696/Images/docker_arch.png "Docker Architecture")

**Basic Docker Commands**

- Pulling an image from Docker Hub

```
docker pull <image_name>
```

- Listing all the images

```
docker images
```

- Running Docker container

```
docker run <image_name>
```

- Listing all the running containers

```
docker ps
```

- Listing all the containers (running and stopped)

```
docker ps -a
```

- Stopping a container

```
docker stop <container_id>
```

- Removing a container

```
docker rm <container_id>
```

**Getting Started with Hello World Example**

- Pulling the image from Docker Hub: 

```
docker pull hello-world:latest
```

![Pulling image from docker registry](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f212506a99ae230418e7666f00309e54d88b9d21/Images/Screenshot%202023-04-02%20175811.png "pull image")


- Checking for the downloaded image

```
docker images
```

![Checking for the downloaded Image](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f212506a99ae230418e7666f00309e54d88b9d21/Images/Screenshot%202023-04-02%20175924.png "docker images")

- Checking for any existing running containers

```
docker ps
```

![Checking for running containers](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f212506a99ae230418e7666f00309e54d88b9d21/Images/Screenshot%202023-04-02%20180100.png "running containers")

- Running the container

```
docker run hello-world:latest
```

![Running container](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f212506a99ae230418e7666f00309e54d88b9d21/Images/Screenshot%202023-04-02%20180210.png "docker run")

- Docker Inspect

```
docker inspect hello-world:latest
```
Output
```
PS C:\Users\abhin> docker inspect hello-world:latest
[
    {
        "Id": "sha256:feb5d9fea6a5e9606aa995e879d862b825965ba48de054caab5ef356dc6b3412",
        "RepoTags": [
            "hello-world:latest"
        ],
        "RepoDigests": [
            "hello-world@sha256:ffb13da98453e0f04d33a6eee5bb8e46ee50d08ebe17735fc0779d0349e889e9"
        ],
        "Parent": "",
        "Comment": "",
        "Created": "2021-09-23T23:47:57.442225064Z",
        "Container": "8746661ca3c2f215da94e6d3f7dfdcafaff5ec0b21c9aff6af3dc379a82fbc72",
        "ContainerConfig": {
            "Hostname": "8746661ca3c2",
            "Domainname": "",
            "User": "",
            "AttachStdin": false,
            "AttachStdout": false,
            "AttachStderr": false,
            "Tty": false,
            "OpenStdin": false,
            "StdinOnce": false,
            "Env": [
                "PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"
            ],
            "Cmd": [
                "/bin/sh",
                "-c",
                "#(nop) ",
                "CMD [\"/hello\"]"
            ],
            "Image": "sha256:b9935d4e8431fb1a7f0989304ec86b3329a99a25f5efdc7f09f3f8c41434ca6d",
            "Volumes": null,
            "WorkingDir": "",
            "Entrypoint": null,
            "OnBuild": null,
            "Labels": {}
        },
        "DockerVersion": "20.10.7",
        "Author": "",
        "Config": {
            "Hostname": "",
            "Domainname": "",
            "User": "",
            "AttachStdin": false,
            "AttachStdout": false,
            "AttachStderr": false,
            "Tty": false,
            "OpenStdin": false,
            "StdinOnce": false,
            "Env": [
                "PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"
            ],
            "Cmd": [
                "/hello"
            ],
            "Image": "sha256:b9935d4e8431fb1a7f0989304ec86b3329a99a25f5efdc7f09f3f8c41434ca6d",
            "Volumes": null,
            "WorkingDir": "",
            "Entrypoint": null,
            "OnBuild": null,
            "Labels": null
        },
        "Architecture": "amd64",
        "Os": "linux",
        "Size": 13256,
        "VirtualSize": 13256,
        "GraphDriver": {
            "Data": {
                "MergedDir": "/var/lib/docker/overlay2/5ad99317a43aae24f3d2a18a1fb5e0f49e00994415159e0c6755d595c1b38aa2/merged",
                "UpperDir": "/var/lib/docker/overlay2/5ad99317a43aae24f3d2a18a1fb5e0f49e00994415159e0c6755d595c1b38aa2/diff",
                "WorkDir": "/var/lib/docker/overlay2/5ad99317a43aae24f3d2a18a1fb5e0f49e00994415159e0c6755d595c1b38aa2/work"
            },
            "Name": "overlay2"
        },
        "RootFS": {
            "Type": "layers",
            "Layers": [
                "sha256:e07ee1baac5fae6a26f30cabfe54a36d3402f96afda318fe0a96cec4ca393359"
            ]
        },
        "Metadata": {
            "LastTagTime": "0001-01-01T00:00:00Z"
        }
    }
]
```

- Using dive tool to inspect the image

```
dive hello-world:latest
```

![Exploring each layer of image](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f212506a99ae230418e7666f00309e54d88b9d21/Images/Screenshot%202023-04-02%20180956.png "Dive tool")

    