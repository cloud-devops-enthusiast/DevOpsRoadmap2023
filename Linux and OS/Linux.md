**Linux**

The name linux is given to an operating system which is based on the linux kernel. Different OS that use the linux kernel are called as Linux Distros. Some of the popular linux distros are Ubuntu, Debian, Red Hat, CentOS, Fedora, etc. Linux is everywhere today from our cars to our smartphones, our day to day OS and much more. Linux can be paired with both hardware and software to unleash the power of that thing. Developers using linux allows them to create and deploy applications faster and more efficiently. Linux has a huge amount of open source software and forums available for developers to use and learn from. Linux is also a very secure OS and is used by many companies for their security needs.


**The Linux kernel**

- The core of all linux distributions is the linux kernel. The kernel is the core of the OS and is responsible for managing the hardware and software.

- As the Linux kernel is open source, with multiple developers around the world contributing to it, making it more secure and stable.

- The linux kernel is that which allows you to communicate with the computer hardware.

- The Linux kernel can run on its own, but it is not very useful in that way as it needs some softwares or programs to communicate with it and make it useful.

- Today the linux kernel can run on the wide range of hardware making it very versatile and useful. This linux supports the wide range of hardware like the small or micro computers to the large super computers. The kernel can be made specific too for example the car music system kernel that can be a modification of the linux kernel.

```
                 User Space
                     ^
                     |
                     V
                Linux kernel
                     ^
                     |
                     V
              Computer Hardware
```

In the above diagram we can see that the user space is the space where the user interacts with the OS, It is more on the side of the GUI and the applications similar to that. The linux kernel is the central core of the whole system which interacts with the User space and computer hardware to make the system calls. The computer hardware is the actual hardware that we use to interact with the computer like the memory, CPU, GPU, etc.

For example you can think about a file just like this which uses a code editor like VS Code which allows you to write the code and save it onto the system. The code editor is the user space and the linux kernel is the core which allows you to save the file on the local system, where the computer hardware is the actual memory which stores in the storage devices like the hard disk, SSD, etc. For most of the time the kernel does not interacts with the user, but it is the core of the whole system. kernel can also be edited to make changes to the system. The source code is available online and can be modified to make changes to the system.


**Linux System**

- This refers to a whole system which is based out on the linux kernel.

- The linux system uses the additional softwares to control the processes like boot and allows you to manage running programs.

- The linux system offers a large amount of customization for those who want to explore it.


**Interacting with the Linux System**

- Graphical User Interface (GUI) or desktop environment

- Command Line Interface (CLI) or Text based shell


**Linux Shell**

- The shell is software which allows you to type commands and get text as output.

- Some of the popular shells are bash, Zsh (Z shell), csh (C shell), fish and ksh (Korn shell).

- For starting with the shell you can use the bash shell which is the default shell for most of the linux distros.

- A shell can run on the top of the linux kernel inside the user space both in the GUI or just in the text mode running as a console.

- The shells can be used locally(inside the system) or remotely(over the network).

- Secure shell (SSH) enables the remote connections to a text based console or terminal.


**Software on Linux**

- Linux is a very versatile OS and can be used for a wide range of purposes.

- In the outermost layer of the linux system, The user space where the user interacts consists of the GNU Coreutilities and some other softwares.

- The GNU Coreutilities (cat, chmod, cp, ls, mkdir, mv, pwd, rm, tail, head, ln, etc) are the basic softwares which are necessary to perform any operation as an operating system, with some other softwares which support these core utilities.


**Linux File System**

- In linux the files and directories make up the whole file system.

- The Filesystem Hierarchy Standard (FHS) is used to define the structure and the location of the files. This also helps to ensure the consistent locations across distributions.

- The *root directory* is the most top level directory in the linux system and can be accessed by the / symbol.

- The drives connected to the system are mounted to the root directory and can be accessed by the /mnt directory.

- The *home directory* is the directory where the user files are stored and can be accessed by the /home directory.

- The *bin*, *sbin* and *usr* directories are the programs of different types are stored.

- The *etc* directory stores the system wide configuration files.

- The *var* directory is the directory where the changeable or variable data is stored. Under the var directory there are many subdirectories like the log, cache, lib, etc. You can find the logs of the system in the log directory and the cache of the system in the cache directory.

- The *dev*, *proc* and *sys* directories are created by the linux kernel and are used to store the information about the hardware and the system. It stores the processes that runs the programs or the settings in the kernel and so on.


**User Accounts on Linux**

- Standard users are the users who can use the system but cannot make any changes to the system which can be human users and programs or services.

- The Superuser or the root user is the user who has all the accesses and privileges to the system and can make changes to the whole system. In simple words the root user is the god of the system.

- Standard users can use the root user privileges by using the sudo or su commands which allows them to run the commands as the root user. It is just like using the god mode in the games.

- These power borrowing or using the root user privileges is a common practice in the linux system and is used by many users and programs to perform the tasks like installing the programs, updating the system, etc.

- The root user is not recommended to be used for the daily or normal tasks as it is not intended for that purpose and can cause some problems if used in the wrong way.

- There is a *single-user mode* which is available on most linux distros which allows you to use them for the troubleshooting and maintenance purposes. The single-user mode is the root user. Single-User mode is also available in some of the embeded systems and the containers.

- As a normal world the both privileged and unprivileged users exist on all major operating systems.

- The file permissions represent the access rights of the users and can be numeric (755) or symbolic (rwxr-xr-x). Here the first digit represents the access rights for the owner of the file, the second digit represents the access rights for the group of the file and the third digit represents the access rights for the other users and similar to that for the symbolic representation.

- The *chmod*, *chown* and *chgrp* commands are used to change the file permissions and work with them.


**Linux Distribution**

- A linux distribution is just like flavors of ice cream, as every flavor is different from the other and has its own taste the distributions are different from each other and have their own features and characteristics.

- These different distributions are maintained by the different organizations and the developers worldwide who make the choices that further defines the distribution and maintains it over the time.

- Distributions are the packages which are made by the developers worldwide consisting of different pre-installed softwares or tools.

- The distributions also decide how the system is configured and how the system works.

- The linux distributions also has a variation of linux kernel used in them.

- Linux distributions are designed in such a way that they can use the specific hardware and software for example the Raspbian is designed to work on the raspberry pi hardware and the android is designed to work on the android hardware and so on.

- As we all know different flavors have different looks like the chocolate ice cream with some chocolate chips in it, the different distributions have different kinds of core utilities like GNU Coreutils, BusyBox or other toolkits and purpose specific softwares like the web servers, desktop environments, etc. The purpose specific softwares mostly decide the use-case of that specific linux distribution.

- For instance you can consider the case Ubuntu uses a system called Netplan to configure the network whereas the fedora and redhat uses the network manager to configure the network.

- Debian or Ubuntu based distributions use the apt package manager to install the softwares whereas the redhat or fedora based distributions use the dnf package manager to install the softwares.

- Even for the privilege management the distributions use different methods but debian does not include sudo, so for using the root user you need to login as the root user and switch back to the normal user when you're done with your changes.

- The same software on different linux distributions can have different versions for example the apache web server on the ubuntu is called as Apache 2 while on redhat it is called as httpd.

- Many distros are based on their upstreams distros like redhat is based on fedora, ubuntu is based on debian, etc.
