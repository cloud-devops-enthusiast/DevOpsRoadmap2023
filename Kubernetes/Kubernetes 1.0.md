**What is Kubernetes?**

Kubernetes is a container orchestration system for running and coordinating applications across a cluster of machines. This tool was made in such a way that it can be used in both public and private cloud environments, while managing the complete lifecycle of the containerized applications and services using methods that provide predictability, scalability, and high availability. Kubernetes were first developed by Google and then donated to the cloud native and computing foundation while being open sourced in 2014.

**Containers**

Containers are a way of packaging software in such a way it can be completely isolated environment with all their processes or services, networking interfaces and the mounting points. Containers share the same operating system kernel and isolate the application processes from the rest of the system. Containers are lightweight as compared to the virtual machines which makes them easier to deploy and faster to start and stop. Containers are also portable and can be moved easily from one machine to another. Docker has less isolation and security as they share the same kernal and operating system than the virtual machines but it is more flexible and portable. Some of the popular container technologies are Docker, LXC, LXD, and Rkt. All the created conatainers are converted into images which are stored in the container registry. These images are used to create containers which are then used to run the applications. These images are been stored on the container registry which can be either public or private. Some of the popular container registries are Docker Hub, Google Container Registry, and Amazon Elastic Container Registry.

**Container Orchestration**

Container orchestration is the process of automating the deployment, management, scaling, networking, and availability of container based applications. Container orchestration tools are used to manage the lifecycles of containers and the applications that are running on them. 

**Kubernetes Architecture**


**Need of Kubernetes**


**Key Terms in Kubernetes**

- *Cluster*: A cluster is a set of nodes which are used to run containerized applications.

- *Node*: A node is a physical or virtual machine that is used to run applications and services. A cluster is made up of one or more nodes in which there is at least one worker node and at least one master node.

- *Cloud Container*: A cloud container is an image that is used to store all the softwares and dependencies that are required to run an application.

- *Pod*: A pod is a single or group of containers which is running on a kubernetes cluster.

- *Deployment*: A deployment is a set of pods that are running on a kubernetes cluster. It is used to define the state of the application and how many replicas of the application should be running.

- *ReplicaSet*: A replicaset is a set of pods that are running at the same time in a kubernetes cluster. It is used to define the number of replicas of the application that should be running at the same time.

- *Service*: A Service helps to describe the way in which the application represented by the pods can be accessed. Service mostly consists of the IP address and port number that is used to access the application, which also helps to control internal and external access to the application.

**What is the difference between Kubernetes and Docker?**
