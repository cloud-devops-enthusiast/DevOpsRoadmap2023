**What is Kubernetes?**

Kubernetes is a container orchestration system for running and coordinating applications across a cluster of machines. This tool was made in such a way that it can be used in both public and private cloud environments, while managing the complete lifecycle of the containerized applications and services using methods that provide predictability, scalability, and high availability. Kubernetes were first developed by Google and then donated to the cloud native and computing foundation while being open sourced in 2014.

**Containers**

Containers are a way of packaging software in such a way it can be completely isolated environment with all their processes or services, networking interfaces and the mounting points. Containers share the same operating system kernel and isolate the application processes from the rest of the system. Containers are lightweight as compared to the virtual machines which makes them easier to deploy and faster to start and stop. Containers are also portable and can be moved easily from one machine to another. Docker has less isolation and security as they share the same kernal and operating system than the virtual machines but it is more flexible and portable. Some of the popular container technologies are Docker, LXC, LXD, and Rkt. All the created conatainers are converted into images which are stored in the container registry. These images are used to create containers which are then used to run the applications. These images are been stored on the container registry which can be either public or private. Some of the popular container registries are Docker Hub, Google Container Registry, and Amazon Elastic Container Registry.

**Container Orchestration**

Container orchestration is the process of automating the deployment, management, scaling, networking, and availability of container based applications. Container orchestration tools are used to manage the lifecycles of containers and the applications that are running on them. Some of the popular container orchestration tools are Kubernetes, Docker Swarm, Apache Mesos, and Amazon ECS.

**What happens when you install Kubernetes?**

When you install kubernetes on your machine it installs the following components:

- *API Server*: This acts as a frontend for the kubernetes control plane. All the services, commands, and information are processed by the API server to interact with the kubernetes cluster. 

- *etcd*: This is a key value store that is used to store all the cluster data. This is a distributed key value store that is used to store the configuration data of the cluster and the state of the cluster.

- *Scheduler*: This is a component that is used to distribute the workload across multiple nodes. This continuously checks for the newly created pods and assigns them to the nodes.

- *Controller*: This is the brain of the cluster it acts like a control loop that regulates the state of the cluster. It is responsible for noticing and responding when nodes, pods, or endpoints go down, here the controller makes the decision to bring up new containers or restart the failed ones.

- *Container Runtime*: This is the component that is used to run the containers. This is the software that is used to run the containers. Some of the popular container runtimes are Docker, containerd, and CRI-O.

- *Kubelet*: This is the agent that runs on each node in the cluster. This is responsible for making sure that the containers are running on the nodes as expected.

**Kubernetes Architecture**

- *Cluster*: A cluster is a set of nodes or multiple nodes running in a group which are used to run containerized applications.

- *Master*: A master is a node that controls the cluster, this is actually responsible for managing the cluster. 

- *Node*: A node is a physical or virtual machine that is used to run applications and services. Here the containers are launched to make the things work in a streamline fashion. A cluster is made up of one or more nodes in which there is at least one worker node and at least one master node. 

- *Cloud Container*: A cloud container is an image that is used to store all the softwares and dependencies that are required to run an application.

- *Pod*: A pod is a single or group of containers which is running on a kubernetes cluster.

- *Deployment*: A deployment is a set of pods that are running on a kubernetes cluster. It is used to define the state of the application and how many replicas of the application should be running.

- *ReplicaSet*: A replicaset is a set of pods that are running at the same time in a kubernetes cluster. It is used to define the number of replicas of the application that should be running at the same time.

- *Service*: A Service helps to describe the way in which the application represented by the pods can be accessed. Service mostly consists of the IP address and port number that is used to access the application, which also helps to control internal and external access to the application.

**Master vs Worker Node**

The master node is the brain of the cluster, it has the </>kube-apiserver which gives commands to the </>kubelet which is present on the worker node. The master node and worker node interacts with each other in a seamless way to run the applications, this consists of the actions requested by the master node and worker node providing health information at the same time. All these information are stored in the key value store called etcd which is also present on the master node with the controller and scheduler in place. 

**Need of Kubernetes**


**Key Terms in Kubernetes**


**What is the difference between Kubernetes and Docker?**

**Kubernetes Pods**

A Pod is a single instance of an application in Kubernetes, this is also the smallest object that you can create in kubernetes. Here the containers are not directly deployed on the worker nodes, here the containers are deployed inside the pods. 
