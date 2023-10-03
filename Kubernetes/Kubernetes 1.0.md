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

**Kubernetes Pods**

A Pod is a single instance of an application in Kubernetes, this is also the smallest object that you can create in kubernetes. Here the containers are not directly deployed on the worker nodes, here the containers are deployed inside the pods. If you have an application that is running on 2 containers deployed on their seperate pods with while running on same node, and the work load increases and you need to scale the application, then you can add more pods to the node to scale the application and similarly you can remove the pods to scale down the application.

*Multi-Conatiner Pods*

A Single pod can have multiple containers running inside it, except for the fact that they're not multiple containers of the same kind. This happens when you have a helper containers in place that helps the main container to run. In such case the helper container is called as the sidecar container. The sidecar container is used to provide the additional functionality to the main container. For example, if you have a main container that is running a web server and you have a sidecar container that is used to processing a user entered data and then pass it to the main container. These helper conatainer stays on the same pod as the main container and they share the same resources and network, this also shares the same lifecycle as the main container in the pod. Like the helper container, is therefore created and destroyed at the same time as the main container.

**Challenge 1** 

I accidently installed the minikube while having docker-desktop installed onto my system and started minikube using "minikube start" command. After installation everything was working fine and stopped the minikube using "minikube stop" command. After this the next time I tried to start the "kubectl" command it was throwing error. 

![Image 1](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/9cfbd4dce4d42cf913b71e3ba728fed2a4c92019/Images/Screenshot%202023-09-16%20002906.png)

I thought that the minikube was not installed properly and tried to uninstall it and started the docker-desktop. But the error was still there.

Laterly i found out that the minikube was being used as the "current context" and I had to change it to "docker-desktop" in the kubectl config file and removed the minikube from the configuration file, as it was not required anymore after the uninstallation of minikube.

![Image 2](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/9cfbd4dce4d42cf913b71e3ba728fed2a4c92019/Images/Screenshot%202023-09-15%20235030.png)

After this everything was working fine.

**First Kubernetes Run**

- To Create a Pod in kubernetes using the kubectl command and run the nginx image in it.

```
kubectl run nginx --image=nginx
```

![Image 3](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/d488188830af143f80a44edd85f9075fb080322e/Images/Screenshot%202023-09-16%20004530.png)

- To check the status of the pod

```
kubectl get pods
```

![Image 4](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/d488188830af143f80a44edd85f9075fb080322e/Images/Screenshot%202023-09-16%20004609.png)

- To describe the pod in detail

```
kubectl describe pod nginx
```

![Image 5](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/d488188830af143f80a44edd85f9075fb080322e/Images/Screenshot%202023-09-16%20004734.png)

- To check the status of the pod in detail

```
kubectl get pods -o wide
```

![Image 6](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/d488188830af143f80a44edd85f9075fb080322e/Images/Screenshot%202023-09-16%20004800.png)

**What is YAML?**

YAML is a file format that is used to store data in a structured way. YAML follows the key value pair format to store the data. Dictionaries are ordered way to store the data in YAML whereas the Lists are ordered way to store the data in YAML.

*Dictionary*

```
martin:
  name: Abhinav Singh
  job: Developer
  skill: Cloud
  experience: 1.5 years
```

*List*

```
Fruits:
  - Orange
  - Apple
  - Banana
  - Mango
  - Grapes
```

Note: Any line starting with "#" is a comment in YAML.

*Dictionaries and Lists*

```
# Employee records
- martin:
    name: Martin D'vloper
    job: Developer
    skills:
      - python
      - perl
      - pascal
- tabitha:
    name: Tabitha Bitumen
    job: Developer
    skills:
      - lisp
      - fortran
      - erlang
```

**Creating a Pod using YAML**

- To create a pod using YAML file and name it as "pod-defintion.yml".

```
apiVersion: v1
#This is the version of the api which is used to create the pod.
kind: Pod
#This is the kind of the object that is being created. As we are creating a pod here, so the kind is pod.
metadata:
    name: myapp-pod
    labels:
        app: myapp
        type: front-end
#This is data about the object that is being created. Here we are creating a pod named myapp-pod and we are also adding some labels to it.
spec:
    containers:
        - name: nginx-container
          image: nginx
#This is the specification of the object that is being created. Here we are creating a pod with a container in it.
```

- To create the pod using the YAML file.

```
kubectl create -f pod-definition.yml
```

![Image 7](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b8cfde6bb2c5493825f9300172f83d75a6603d72/Images/Screenshot%202023-09-16%20182210.png)

- To check the status of the pod.

```
kubectl get pods
```

![Image 8](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b8cfde6bb2c5493825f9300172f83d75a6603d72/Images/Screenshot%202023-09-16%20182302.png)

- To describe the pod in detail.

```
kubectl describe pod myapp-pod
```

![Image 9](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b8cfde6bb2c5493825f9300172f83d75a6603d72/Images/Screenshot%202023-09-16%20182506.png)

- To delete the pod.

```
kubectl delete pod myapp-pod
```

**Creating a Pod using YAML with Multiple Containers**

- This time we are creating a pod with two containers in it one of them is nginx and the other one is redis.

```
apiVersion: v1
kind: Pod
metadata:
    name: myapp-pod
    labels:
        app: myapp
        type: front-end
spec:
    containers:
        - name: nginx-container
          image: nginx
        - name: redis-container
          image: redis
```

- To create the pod using the YAML file.

```
kubectl create -f redis.yaml
```

![Image 10](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/371ea823ff0eb3dae8b557440fc5feec9665bc43/Images/Screenshot%202023-09-16%20221544.png)

- To check the status of the pod.

```
kubectl get pods
```

![Image 11](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/029b6d572424b5f68d44147b47941c148d28e0bd/Images/Screenshot%202023-09-16%20221807.png)

- To describe the pod in detail.

```
kubectl describe pod myapp-pod
```

![Image 12](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/e8522bfc946e7be57c780abcbb8229715ffb7c2c/Images/Screenshot%202023-09-16%20222108.png)

- To delete the pod.

```
kubectl delete pod myapp-pod
```

![Image 13](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/696dff57cad2e8da7a605aea7045208688af1f4a/Images/Screenshot%202023-09-16%20222403.png)

**Replication Controller and ReplicaSet**

The replication controller allows the user to run multiple instances of the same pod. Ultimately this lets the user to achieve higher availability. The replication controller is responsible for making sure that the specified number of pods are running at all times. If there is a single container running and the container goes down this replication controller will bring up a new container to make sure that a single container should be running at the time.

If the load on the pods increase and the user wants to scale the application, then the user can increase the number of pods on the node, but if the demand further increases and the user wants to scale the application further, then the user can add more nodes to the cluster and then add more pods to the cluster. This is where the replication controller comes into play, it is used to make sure that the specified number of pods are running at all times.

**Creating a Replication Controller**

- Prepare the YAML file for the replication controller.

```
apiVersion: v1
kind: ReplicationController
metadata:
  name: myapp-replication-controller
  labels:
    app: myapp-replication-controller
    type: front-end
spec:
# Here we are using the template of the pod that we created earlier from pod-definition.yaml. This only includes the specification of the pod starting from the metadata and the spec section.
  template:
    metadata:
      name: myapp-pod
      labels:
        app: myapp-pod
        type: front-end
    spec:
      containers:
        - name: nginx-container
          image: nginx
replicas: 3
# Here we are specifying the number of replicas that we want to run at the same time.
```

- To create the replication controller using the YAML file.

```
kubectl create -f replication-controller.yaml
```

![Image 14](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b49226a2df3c6f1945e81581449d4b154e182c3e/Images/Screenshot%202023-09-16%20233142.png)

- To check the status of the replication controller.

```
kubectl get replicationcontroller
```

![Image 15](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b49226a2df3c6f1945e81581449d4b154e182c3e/Images/Screenshot%202023-09-16%20233228.png)

- To check the status of the pods.

```
kubectl get pods
```

![Image 16](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b49226a2df3c6f1945e81581449d4b154e182c3e/Images/Screenshot%202023-09-16%20233411.png)

- To describe the replication controller in detail.

```
kubectl describe replicationcontroller myapp-replication-controller
```

![Image 17](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/0bc7cb05d12c196ac785da349b9030a91e082445/Images/Screenshot%202023-09-16%20233636.png)

- To delete the replication controller.

```
kubectl delete replicationcontroller myapp-replication-controller
```

![Image 18](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f22bad30b34cb156888fd29804d7aa95666a1d09/Images/Screenshot%202023-09-16%20233756.png)

**Creating a Replicaset**

- Prepare the YAML file for the replicaset.

```
apiVersion: apps/v1
kind: ReplicaSet
metadata:
  name: myapp-replicaset
  labels:
    app: myapp
    type: front-end
spec:
  template:
    metadata:
      name: myapp-pod
      labels:
        app: myapp
        type: front-end
    spec:
      containers:
        - name: nginx-container
          image: nginx
  replicas: 3
  selector:
  #There is one major difference between replicaset and replica-controller. In replica-controller, we have to specify the label of the pod that we want to replicate. As replicaset can also replicate the pods which are not created with the help of replicaset, so we have to specify the label of the pod that we want to replicate.
    matchLabels:
    #Here the matchlabels selector matches the labels of the pod that we want to replicate.
      type: front-end
```

- To create the replicaset using the YAML file.

```
kubectl create -f replicaset-definition.yaml
```

![Image 19](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/922f8f1c7a69497f13ebd9885a719aa523b6df94/Images/Screenshot%202023-09-17%20000040.png)

- To check the status of the replicaset.

```
kubectl get replicaset
```

![Image 20](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/922f8f1c7a69497f13ebd9885a719aa523b6df94/Images/Screenshot%202023-09-17%20000123.png)

- To check the status of the pods.

```
kubectl get pods
```

![Image 21](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/922f8f1c7a69497f13ebd9885a719aa523b6df94/Images/Screenshot%202023-09-17%20000144.png)

- To describe the replicaset in detail.

```
kubectl describe replicaset myapp-replicaset
```

![Image 22](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/922f8f1c7a69497f13ebd9885a719aa523b6df94/Images/Screenshot%202023-09-17%20000342.png)

- To delete the replicaset.

```
kubectl delete replicaset myapp-replicaset
```

![Image 23](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/922f8f1c7a69497f13ebd9885a719aa523b6df94/Images/Screenshot%202023-09-17%20000424.png)

**Labels and Selectors**

Labels are kind of like tags that are used to identify the objects in the cluster. Replicaset and replication controller uses the labels to identify the pods that they need to replicate. Replicaset also uses them to monitor the pods and if any of the pods goes down then it will bring up a new pod to make sure that the specified number of pods are running at all times.

**Scaling the replicaset**

- *To scale the replicaset using the existing yaml file*, which we used in last demo. Here we will be increasing the number of replicas from 3 to 6.

```
apiVersion: apps/v1
kind: ReplicaSet
metadata:
  name: myapp-replicaset
  labels:
    app: myapp
    type: front-end
spec:
  template:
    metadata:
      name: myapp-pod
      labels:
        app: myapp
        type: front-end
    spec:
      containers:
        - name: nginx-container
          image: nginx
  replicas: 6
  selector:
    matchLabels:
      type: front-end
```

- To apply the changes to the replicaset.

```
kubectl replace -f replicaset-definition-v2.yaml
```

Note: This command helps the user to replace the running replicaset with the new one from the existing yaml file.\

![Image 24](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/3b3992f628e312dba3f2e322196b1700158cbeed/Images/Screenshot%202023-09-17%20152449.png)

- Check the status of the replicaset.

```
kubectl get replicaset
```

![Image 25](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/3b3992f628e312dba3f2e322196b1700158cbeed/Images/Screenshot%202023-09-17%20152841.png)

- *Scaling the replicaset using the command line*. Here we will be increasing the number of replicas from 6 to 9. Here we will be specifying the number of replicas followed by the name of the yaml file.

```
kubectl scale --replicas=9 -f replicaset-definition-v2.yaml
```

![Image 26](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/3b3992f628e312dba3f2e322196b1700158cbeed/Images/Screenshot%202023-09-17%20153032.png)

- Check the status of the replicaset.

```
kubectl get replicaset
```

![Image 27](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/3b3992f628e312dba3f2e322196b1700158cbeed/Images/Screenshot%202023-09-17%20153053.png)

- *Scaling the replicaset using the command line*. Here we will be increasing the number of replicas from 9 to 12. Here we will be specifying the number of replicas followed by the type of the object and the name of the object.

```
kubectl scale replicas=12 replicaset myapp-replicaset
```

Note: Here the "ReplicaSet" is the type of the object and "myapp-replicaset" is the name of the object.

![Image 28](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/3b3992f628e312dba3f2e322196b1700158cbeed/Images/Screenshot%202023-09-17%20190023.png)

- Check the status of the replicaset.

```
kubectl get replicaset
```

![Image 29](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/bf65c89e3098065980a960143f31e86aa664c29f/Images/Screenshot%202023-09-17%20190357.png)

**Creating a Deployment**

A deployment is a higher level concept that is used to manage the pods and the replicaset. A deployment is used to make sure that the specified number of pods are running at all times. If the load on the pods increase and the user wants to scale the application, then the user can increase the number of pods on the node, but if the demand further increases and the user wants to scale the application further, then the user can add more nodes to the cluster and then add more pods to the cluster. This is where the deployment comes into play, it is used to make sure that the specified number of pods are running at all times.

```
apiVersion: apps/v1
kind: Deployment
metadata:
  name: myapp-deployment
  labels:
    app: myapp
    type: front-end
spec:
  template:
    metadata:
      name: myapp-pod
      labels:
        app: myapp
        type: front-end
    spec:
      containers:
        - name: nginx-container
          image: nginx
  replicas: 3
  selector:
    matchLabels:
      type: front-end
```

- To create the deployment using the YAML file.

```
kubectl create -f deployment.yaml
```

![Image 30](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/6fba19b05920b9e60ff815fa3b641689e9a46c35/Images/Screenshot%202023-09-17%20224007.png)

- To check the status of the deployment.

```
kubectl get deployment
```

![Image 31](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/6fba19b05920b9e60ff815fa3b641689e9a46c35/Images/Screenshot%202023-09-17%20224100.png)

- To check the status of the replicaset.

```
kubectl get replicaset
```

![Image 32](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/6fba19b05920b9e60ff815fa3b641689e9a46c35/Images/Screenshot%202023-09-17%20224150.png)

- To check the status of the pods.

```
kubectl get pods
```

![Image 33](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/6fba19b05920b9e60ff815fa3b641689e9a46c35/Images/Screenshot%202023-09-17%20224248.png)

- To check the status of the deployment in detail.

```
kubectl get all
```

![Image 34](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/6fba19b05920b9e60ff815fa3b641689e9a46c35/Images/Screenshot%202023-09-17%20224346.png)

**Updates and Rollbacks in a Deployment**


**Deployment Strategies**

There are two types of deployment strategies:

- *Recreate*: In this strategy the deployment will first terminate all the existing pods and then create new pods with the updated configuration. Under this strategy the application will suffer a downtime as the application will be unavailable during the time when the pods are being terminated and the new pods are being created.

- *Rolling Update*: In this strategy the deployment will first create new pods with the updated configuration and then terminate the old pods. This is the recommended strategy that is used by the kubernetes. Under this strategy the application will not suffer a downtime as the application will be available during the time when the pods are being terminated and the new pods are being created.

Note: The default deployment strategy is rolling update, so if you don't specify the deployment strategy in the deployment yaml file then the rolling update strategy will be used by default.

**Updating the Deployment**

- *To update the deployment using the existing yaml file*, Here we will be updating the nginx image from nginx to nginx:1.7.1. Here we will be using kubectl apply command to apply the changes to the deployment.

```
apiVersion: apps/v1
kind: Deployment
metadata:
  name: myapp-deployment
  labels:
    app: myapp
    type: front-end
spec:
  template:
    metadata:
      name: myapp-pod
      labels:
        app: myapp
        type: front-end
    spec:
      containers:
        - name: nginx-container
          image: nginx:1.7.1
  replicas: 3
  selector:
    matchLabels:
      type: front-end
```

```
kubectl apply -f deployment-definition.yaml
```

![Image 35](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/3b0da3fa6d9c3b5adf9e45ac3304e2e52f6a27cf/Images/Screenshot%202023-09-17%20233521.png)

You can do this using command line using command,
```
kubectl set image deployment/myapp-deployment \
nginx-container=nginx:1.7.1"
```
but this requires you to to change the configuration of the deployment file.
