**OS Concepts**

*Linux Booting Process*

- *BIOS:* BIOS stands for (Basic Input Output System), which loads the and executes the Master Boot Record (MBR) from the hard disk. Whenever you press the button of your laptop or computer where BIOS performs the following tasks:

    - Checks the hardware components of the system.
    - Checks the boot device.
    - Loads the boot loader from the boot device.
    - Executes the boot loader.

- *MBR:* MBR stands for (Master Boot Record), and it is a small program that is stored in the first sector of the drive, which is ```/dev/hda``` or ```/dev/sda```, based on the hardware. The MBR is responsible for loading the boot loader from the boot drive.

- *GRUB:* GRUB stands for the (Grand Unified Bootloader), which is short for the GNU GRand Unified Bootloader. GRUB is a boot loader used in most of the linux distributions and it is one of the first thing which you see when you boot your system. Which is a simple menu which you allow you to choose some options like:

    - Booting into the system.
    - Booting into the recovery mode.
    - Booting into the single user mode.
    - Booting into the rescue mode.
    - Booting into the live mode.
    - Booting into the memory test mode.
    - Booting into the command line mode.
    - Choosing from which kernal to be used for the boot process.

    By default the latest kernal image is selected by default. Most times the GRUB configuration file is located in ```/boot/grub/grub.cfg``` or ```etc/grub.conf```.

*GRUB File*
```
#boot=/dev/sda
default=0
timeout=5
splashimage=(hd0,0)/boot/grub/splash.xpm.gz
hiddenmenu
title CentOS (2.6.18-194.el5PAE)
      root (hd0,0)
      kernel /boot/vmlinuz-2.6.18-194.el5PAE ro root=LABEL=/
      initrd /boot/initrd-2.6.18-194.el5PAE.img
```

- *Kernal:* The kernal is the core of the operating system, including Linux. The kernal has control over everything in the system, including the hardware, memory, and processes. The kernal is responsible for the following tasks:

    - Memory management.
    - Process management.
    - Device management.
    - File system management.
    - Networking.
    - Security.

    In the stage of the boot process, the kernal which is selected by the GRUB gets mounted to the root file system, which is specified in the GRUB file or ```grub.conf```. After this, It executes the ```/sbin/init``` program, which is the first program which is executed by the system. You can check for its process id which should always be 1. The kernal then connects a temporary root file system using an initial RAM Disk (initrd) until the real root file system is mounted.

- *Init:* At this level the system executes the run-level programs, where it will look for the init file at ```/etc/inittab``` and to decide the linux run level. There are 7 running levels in linux, which are:

    - Run Level 0: System halt i.e. the system can e safely powered off with no activity. (poweroff.target)
    - Run Level 1: Single User Mode i.e. the system is booted into single user mode. (rescue.target)
    - Run Level 2: Multiple user mode with no NFS(Network File System) or network services. (multi-user.target)
    - Run Level 3: Multiple user mode under the CLI(Command Line Interface) and not under the Graphical User Interface (GUI). (multi-user.target)
    - Run Level 4: User defined (multi-user.target)
    - Run Level 5: Multiple user mode under the Graphical User Interface (GUI) and not under the CLI(Command Line Interface). This it the standard run level for most of the linux distributions. (graphical.target)
    - Run Level 6: System reboot i.e. the system can be safely rebooted with no activity. (reboot.target)

- *Runlevel Programs:* There are mutiple services which are started based on which distribution is installed and which run level is selected. Each of the runlevels described has its own directory.
    
    - Run Level 0: ```/etc/rc0.d```
    - Run Level 1: ```/etc/rc1.d```
    - Run Level 2: ```/etc/rc2.d```
    - Run Level 3: ```/etc/rc3.d```
    - Run Level 4: ```/etc/rc4.d```
    - Run Level 5: ```/etc/rc5.d```
    - Run Level 6: ```/etc/rc6.d```

    In the case of distribution to distribution, the exact location of these directories do change.

*init.d*

In linux or any other Operating System, there are services that can be started and stopped manually in the system, some of these services are ssh, HTTP, tor, apache, etc. To start and stop these services manually, you can use the following commands:

```
service |service name| start/stop/status/restart
```

There are multiple services which reside in the ```/etc/init.d/``` directory, which are stored in the form of scripts. These services are responsible for starting and stopping the services in the system. This ```init.d``` is a daemon which is the first process of the linux system, only after which the system starts the other processes, services, daemons and threads are started by the same. i.e ```init.d``` is the configuration database for the init process. The daemon script let's you start, stop, restart, and check the status of the services in the system. 

![Init.d](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/71fc600e71c7d6fab617bad20204ed1c36ab0ff3/Images/Screenshot%202023-04-09%20144006.png "Init.d")

You can use the commands like ```start``` or ```stop```.

```
/etc/init.d/|service name| start/stop/status/restart
```

![cron](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/f2b27a3cfd695dbb54166f4f12127514a6e17bcb/Images/Screenshot%202023-04-09%20145858.png "start/stop")


*Linux Daemon*

A daemon is a program with a unique purpose. They are the utility programs that run silently in the background to monitor and take care of certain subsystems to ensure that the operating system runs properly. For example, A printer daemon monitors amd takes care of the printing service or A network daemon monitors and maintains network communication and much more. Daemons perform some actions at regular intervals, or in response to some events. Example of the sound which comes from your system when you setup a alarm or a timer. The daemon is responsible for playing the sound at the specified time. There are many daemons that run on a linux system, each specially which is designed to look after the processes and services in the system. One more thing to mention here as these daemons are not under the direct control of a user, they are effectively invisible, but that doesn't mean that they are not there. The daemons keep doing the bulky work in the background.

There are numerous daemons which are running in the systems, To identify a daemon, look for a process that ends with a letter ```d```, Its a general rule in linux that the name of daemons ends this way. You can check for the running daemons in the system by checking the process listings in the system using ```ps```, ```top``` or ```htop``` commands.

You can also make use of the ```pstree``` command, which can be useful to show the processes currently running in the system, in a tree format.

*Spawning Daemons*

This seems to be a bit spooky like unleashing some beast or something like but it is not like that. A process is a running program in the system, at any given moment of time, where it can either be running, sleeping or zombie. Zombie is something where a process which completed its given task, but waiting its parent process to accept the return value, example You have made a request to the server to download some latest web-series and you are waiting for the server to accept the request and send you the data.

There are three types of processes in the system:

- *Interactive Processes,* are those which are run by a user at the command line.
- *Batch Processes,* are those which are not associated with the command line and are presented from a list of processes. Think of it as a groups of tasks which are run in the background. These kind of processes are best when the system usage is low for example the whatsapp backup process which happens everday when the load on the system is low and the system is idle.
- *Daemons,* are the programs that run in the background as a service to the system. When system boot is completed and the user logs in, the system initialization process starts spawning (Creating) daemons with a method called forking, eliminating the need of a terminal (which is meant by no controlling terminal). In linux there are many ways of creating a process traditionally it is done by creating a child process by making copy of an existing process

The process which creates daemon is called the initialization (called ```init```) process by forking its own processes to create new ones. Done this way the ```init``` process is the parent of all the daemons in the system.

There is another way to spawn a daemon and that is for another process to fork a child process and then die(A term which is mostly used in place of exit). When a parent process dies, the child process becomes an orphan. When a child process is orphaned, it is adopted by the ```init``` process.

*Example of Linux Daemon*

- *systemd:* The main purpose of this daemon is to check for the service configuration and behaviour of services or processes across linux distributions.

- *udisksd:* This daemon is responsible for carrying out operation like querying, mounting, unmounting, formatting, or detaching storage devices like hard drives, USB drives, etc.

- *logind:* A daemon which managed the user login sessions and the user sessions in the system.

- *httpd:* This is a HTTP service manager. This daemon is normally run with web server software like Apache or Nginx.

- *sshd:* This daemon is responsible for managing the SSH service. This is used on virtualy any servers or systems which accepts the SSH connections.

- *ftpd:* This daemon is responsible for managing the FTP service. This is commanly used for file transfer between the systems. Where one acts as a client and other one as a server.

- *crond:* This daemon is responsible for managing the cron jobs. This is scheduler daemon for time-based actions like software updates or system checks.

Above in all the daemons you can see they are ending with letter ```d``` which is a general rule in linux that the name of daemons ends this way.