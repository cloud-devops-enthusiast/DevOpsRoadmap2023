**System Management (systemd)**

*Systemd*

Systemd is a system that is designed specifically for the kernal. It replaces the sysvinit process to become the first process with PID=1, which gets executed in user space during the Linux start-up process.
i.e,
*Systemd* is a system and service manager for Linux operating systems, compatible with SysV and LSB init scripts. Systemd provides:

- Aggressive parallelization capabilities.
- Uses socket and D-Bus activation for starting services.
- Offers on-demand starting of daemons, keeps tracks of processes using Linux control groups.
- Supports snapshotting and restoring of the system state.
- Maintains mount and automount points.
- Implements an elaborate transactional dependency-based service control logic.

You can check for the version of systemd by running the following command:

```
systemctl --version
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/7a09df1b29561320fb0695353d3c0d63341304cd/Images/Screenshot%202023-04-09%20175227.png "--version")

*Extracting package*

Download a package from the internet and extract it.

```
wget https://www.freedesktop.org/software/systemd/systemd-216.tar.xz
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/fb5a25d257e98415870ba863bb9d2cda5119ad41/Images/Screenshot%202023-04-11%20004506.png "Download")

Extract the package using the following command:

```
tar -xJf systemd-216.tar.xz
```

Installing some packages required for the build process:

```
sudo apt-get install gcc intltool gperf glib2-devel
```

Move to the extracted directory:

```
cd systemd-216
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/1feb8e3ddba0a3fd2143c0a62f025e56e2dd7306/Images/Screenshot%202023-04-11%20005627.png "Move to the extracted directory")

*Configure*

