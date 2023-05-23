**Virtualization (Virtual + Realization)**

Virtualization is the process which allows you for more efficient utilization of the hardware or physical utilization and one of the foundation of containers and cloud computing. In the process of virtualization, takes the help of the software which is used to create an abstraction layer over the computer hardware which allows every single element of your computer to be divided into multiple virtual computers which are commonly called as virtual machines(VMs). Every single VM (Virtual Machine) out of which can have its own operating system (OS) and with their own set of applications. Here every single VM acts as a separate computer which can be used as per the requirement.

As in todays world virtualization is a common practice among the Enterprises IT Architecture, extended with the use of cloud computing. Virtualization helps the cloud providers to provision the resources on demand with their existing hardware while saving on the cost of extra hardware, by this means the cloud users to purchase only the computing reources they need and pay only for the resources they use.

*Benefits of Virtualization*

- *Improved Productivity and Resource Efficiency:* Virtualization enables you to have more efficient utilization of the hardware resources with less resources and reduced IT staff which helps in improving the time spent over managing the IT infrastructure and the time spent on the business critical tasks. Before the virtualization, most IT infrastructure was underutilized and the Spending over the IT infrastructure was increasing, which leads to more cost and less productivity. In overall, the virtualization lets you have more out out of the existing hardware resources, while running more virtual machines on the same hardware with their independent operating systems and applications.

- *Easier Management and Easier Testing:* When you replace the physical hardware with the virtual machines, where it becomes easier to use and manage the policies written for the virtual machines. This also enables you to create automated IT service management workflows with more granular control over the virtual machines. Testing is also easier with the virtual machines, as the regular snapshots and backups of the virtual machines can be used at the time of emergency and testing. Additionally, the virtual machines can be used to install the services or applications onto the virtual machines and test them before deploying them as per the usecase. With the virtualization, you can have security policies to mandate certain security configurations based on the usecase of the virtual machine.

- *Minimum Downtime and Quicker Backups:* Backups can be taken of both the virtual server and virtual machine. Automatic snapshots are taken throughout the time, which guarentees that all the data is up to date. With these backups all the time going on, the downtime can be reduced and disrupt the productivity of the business. The admins can run multiple virtual machines alongside each other, and if one of the virtual machines goes down, the other virtual machines can be used to continue the work. But, running the multiple virtual machines on the same hardware requires more resources and can be expensive.

- *Faster Provisioning of resources:* Buying, Installing and configuring the hardware for each new application is more costly as well as more time consuming. As you already have the hardware, you can create the virtual machines and run your applications over them which is more significantly faster. You can also create automations with the virtual machines using the virtual machines management software and build it into the automated workflows.

*Types of Virtualization*

- *Network Virtualization:* Network virtualization is the process of creating a virtual network that can be used to combine the available resources by splitting up the available bandwidths into multiple channels or virtual machines. Each of these channels is independent from the others and can be assigned or reassigned to different users or applications. This kind of virtualization mimics the true complexity of the network by able to manage with seperatable parts of the network. In this kind of virtualization network administrators can modify and control these elements of the network without affecting the other elements of the network. This kind of virtualization is used in the cloud computing and data centers. There are two types of network virtualization: ```Software Defined Networking (SDN)```, which virtualizes the hardware that controls the network traffic routing called as the "Control Pane" and ```Network Function Virtualization (NFV)```, which virtualizes one or more hardware appliances which provide a specific network function, making those appliances easier to configure, provision and manage (Example, A firewall, Load Balancer or Traffic Analyzer).

- *Storage Virtualization:* Storage virtualization is the process of pooling the storage resources from multiple storage devices and presenting them as a single storage device. Storage virtualization is mostly used in storage area networks. This kind of virtualization makes it easier to provision storage for VM's and makes the maximum use of the available storage over the network.

- *Data Virtualization:* Data Virtualization is about storing the data from the multiple sources and multiple applications, with multiple formats, at multiple locations ranging from cloud to on-premises. Data virtualization allows any application to access the data from any source, irrespective of the format, location or the type of the data. Data virtualization tools create a software layer between the applications accessing the data and the systems over storing it. The layer translates the application data request or query as needed and return the results that can span multiple data sources. This kind of virtualization is used in the data warehouses and data lakes.

- *Application Virtualization:* Application virtualization is about abstracting the layers of the application from the operating system while running the application software without installing it directly on the operating system. This is not about the complete desktop virtualization, because in this kind of virtualization only the application is virtualized. The OS on the end user's device will run as usual. There are three types of application virtualization: ```Application Streaming``` where the applications lives on the server which sends small components of the software to run on the end user's device when needed, ```Local application Virtualization (Application Isolation)``` where the entire application runs on the endpoint device but runs in a runtime environment instead of the native hardware and ```Server-based application Virtualization (Application Repackaging)``` .which allows the applications to run on a server that sends only the components of the application that are needed to run on the end user's device or only its user interface to the end user's device.

- *Desktop Virtualization:* This is about virtualzing a complete desktop virtualization, which includes the operating system, applications and the user data. This kind of virtualization is used to run the desktops on the virtual machines. This also allows the user to access the desktops from, anywhere and anytime. Mostly in these scenarios the desktops are accessed from data center or the cloud and access to it can be both more secure and portable. The operating system license does still need to be purchased for each user. There are two types of desktop virtualization: ```Virtual Desktop Infrastructure (VDI)``` which runs multiple virtual desktops on a central server and streams them to their user devices when they log in. In this way the organizations can provide access to variety of the OS's and applications to the users. ```Local Desktop Virtualization (VDI)``` which runs a hypervisor on a local computer enabling the user to run more than one additional Operating System on that computer and switch from one OS to another OS without changing anything about the primary OS.

- *CPU and GPU Virtualization:* CPU Virtualization is the process of creating multiple virtual CPUs (vCPUs) on a single physical CPU (pCPU). This kind of fundamental technology which makes the hypervisors, virtual machines and operating systems possible. Whereas GPU Virtualization is the process of a special type of virtualization that allows multiple virtual machines to share a single physical GPU. This kind of virtualization is used in the cloud computing and data centers for faster video, artificial intelligence (AI) and other graphic or maths intensive applications. This kind of GPU virtualization has two types: ```GPU Pass-through``` which allows to make use of the entire GPU to a single guest OS and ```vGPU Sharing``` which divide the physical GPU cores among the virtual GPUs and allows multiple virtual machines to share the same GPU.

- *Linux Virtualization:* Linux includes its own hypervisor, called the ```Linux Kernel-based Virtual Machine (KVM)```, which supports both Intel and AMD's virtualization processor extensions so you can easily create x86-based virtual machines from within a Linux host OS. As Linux is an open source OS, it is highly customizable You can create VM's running versions of Linux tailored for specific use cases or security hardend versions for more sensitive applications.

- *Windows Virtualization:* Windows Server 2016 and Windows 10 both support Hyper-V, which is Microsoft's hypervisor. Hyper-V is a type 1 hypervisor, which means it runs directly on the hardware. Hyper-V is a full virtualization solution that allows you to run multiple virtual machines on a single physical server. Hyper-V is a free feature of Windows Server 2016 and Windows 10 Pro. Windows Server 2016 also includes a free version of Windows Server 2016 Essentials, which is a simplified version of Windows Server 2016 that is designed for small businesses. Windows Server 2016 Essentials includes Hyper-V, which allows you to run up to two virtual machines on a single physical server.

- *Cloud Virtualization:* Cloud virtualization is the process of creating cloud computing models that can be used to run the applications and services by virtualizing the servers, storage and other physical data center resources. Here the Cloud Providers can provide the virtualized resources to the customers. Like, Infrastructure as a Service (IaaS), which is used to virtualize the servers, storage and networking resources. Platform as a Service (PaaS), which is about the virtualized development tools, databases and other cloud based services you can use to build and run your applications. Software as a Service (SaaS), which makes the use of the software applications you can use on the cloud.

*Hypervisor*

A Hypervisor is kind of virtualization software which can be used to create and run the virtual machines. This is mostly used in cloud hosting and provisioning of the cloud resources used to divide and allocate the resources on the various pieces of hardware. A Hypervisor, is sometimes called a virtual machine monitor (VMM), which isolates the hypervisor operating system and resources from the virtual machines and enables the creation and management of virtual machines. The program which works for the partitioning, isolation or abstraction is called a virtualization hypervisor.

The physical hardware when used by the hypervisor, is often called as *Host*, while the many virtual machines running on the hypervisor are called as *Guests*. The hypervisor uses the resources like the CPU, Memory and Storage as a pool which can be easily reallocated between the existing guests or to the new running virtual machines. The hypervisor gives each virtual machines the resources it needs to run, while also isolating the virtual machines from each other. Hypervisors allocate and manages the scheduling of VM resources against the physical resources of the host.

*Types of Hypervisors*

- *Type 1 Hypervisor:* Type 1 hypervisor which is also called as a native or bare metal hypervisor, which runs directly onto the host's hardware to manage the guest operating systems. In the process, it takes the place of a host operating system and VM resources which are scheduled directly to the hardware by the hypervisor. These kind of hypervisors are mostly used in the enterprise data centers and other server-based environments. KVM, Mircosoft Hyper-V and VMware vSphere are examples of Type 1 hypervisors.

- *Type 2 Hypervisor:* Type 2 hypervisor which is also called as a hosted hypervisor, and is run on a conventional operating system as a software layer or application. It also works by abstracting the guest operating system over the host operating system, which is then executed against the hardware. hypervisor asks the operating system to make the hardware call. A type 2 hypervisor is a better for individual users who want to run multiple operating systems on a single computer. Oracle VirtualBox, VMware Workstation are some of the examples of Type 2 hypervisors. Hosted hypervisors are often found on endpoints like PCs.


*Virtual Machine*

A virtual machine or A VM is a Virtual environment which functions as a Virtual System or Computer with its own CPU, memory, Network interfaces and storage, created on a physical hardware system (located off or on premises). Software called a hypervisor seperates the machines resources from the hardware and provisions them appropriately so they can be used by the VM. The physical hardware, equipped with a hypervisor, is called a host machine, host computer, host operating system or simply host. The many VMs that use its resources are called as guest machines, guest computers, guest operating systems or simply guests. VM allows the user with the multiple different operating systems to run on the same hardware. Each os runs in the same way an operating system or applications normally would on the host hardware, so the end user experience within the VM which is nearly identical to a real-time operating system.

The use of VM is important in the area of cloud computing and data centers. Most operating system and application deployment only use a small amount of the physical resources available when deployed to the host of the physical hardware or bare metal. This keeps you from needing to buy additional resources like drives, as well as reducing the amount of power and cooling required to run the hardware.

*Containers*

A container is a lightweight software package which contains all of the dependencies required to execute the contained software application. These dependencies include the system libraries, some third party packages and the other operating system level applications. The containers allows the applications to run quickly and reliably from the one computing environment to another. For example, A docker container image is a lightweight, standalone, executable package of the software which includes everything needed to run the application like Code, Runtime, System Tools, System Libraries and settings.

The container images become containers at runtime and in the case of docker containers, These images become containers when they run on docker engine.

The benefits of containers are:

- *Less Overhead:* As Containers requires less resources than the traditional or hardware virtual machine environments because they don't include the operating system images, which makes them faster to start and use less memory.

- *Increased Portability:* Cotainers are portable across multiple environments, which makes them easy to deploy and scale, while being to run on any infrastructure without any changes.

- *More Consistent Operation:*  As it is known that containers will run the same, regardless of the environment. This makes it easier to develop, test and deploy code.

- *Greater Efficiency:* Containers allow the applications to be more rapidly deployed, patched and scaled, which makes them more efficient.

- *Better Application Development:* Containers support agile and DevOps efforts by allowing the developers to work in standardized environments using common languages and frameworks. This also makes it accelerate the development, testing and production cycle processes.

- *Seperation of Responsibility:* Containerization gives a clear separation of responsiblity, as developers can focus on application logic and dependencies, while IT teams can focus on the infrastructure and deployment.

- *Application Isolation:* Containers allow the applications to be isolated from each other and the underlying infrastructure, which makes them more secure.