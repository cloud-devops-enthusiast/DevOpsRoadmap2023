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
