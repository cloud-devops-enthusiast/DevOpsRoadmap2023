**What is Docker?**

- Standardized packaging for software and dependencies\

- Isolate apps from each other

- Share the same OS kernel as the host

- Works for all major platforms

- Containers native to windows server

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

**Docker Terminology**

- Docker Image: The basis of a docker container. This represents a full application with all dependencies.

- Docker Container: The standard unit in the docker's ecosystem, into which the application service resides and executes.

- Docker Engine: It Creates, Ships and runs Docker containers deployable on a physical or virtual, host locally, in a data center or in the cloud.

- Registry Service: Cloud or Server based storage and distribution of Docker images. (Docker Hub or Docker Trusted Registry)