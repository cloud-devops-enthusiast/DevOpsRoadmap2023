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

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b620a6a27050b0977834f2f368780a4cafde7b17/Images/Screenshot%202023-04-11%20220807.png "--version")

*Extracting package*

Download a package from the internet and extract it.

```
wget https://www.freedesktop.org/software/systemd/systemd-216.tar.xz
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b620a6a27050b0977834f2f368780a4cafde7b17/Images/Screenshot%202023-04-11%20220840.png "Download")

Extract the package using the following command:

```
tar -xJf systemd-216.tar.xz
```

Installing some packages required for the build process:

```
sudo apt-get install gcc intltool gperf glib2-devel
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b620a6a27050b0977834f2f368780a4cafde7b17/Images/Screenshot%202023-04-11%20221004.png "Install packages")

Move to the extracted directory:

```
cd systemd-216
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b620a6a27050b0977834f2f368780a4cafde7b17/Images/Screenshot%202023-04-11%20220928.png "Move to the extracted directory")

*Configure*

```
./configure
```

*Install*

```
make install
```

*Managing services with systemd*

Some of the useful systemd utilities are:

- systemctl: Use to control the systemd system and services.
- journalctl: Use to manage the systemd journal, which is system logging service.
- hostnamectl: Use to manage the hostname.
- localectl: Use to manage the system locale and keymap.
- timedatectl: Use to set the system time and date.
- systemd-cgls: Use to list the control groups.
- systemadm: Use to manage the system configuration.

You can use the following command to get the status of the systemd service:

```
systemctl list-units --type=service --all
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b620a6a27050b0977834f2f368780a4cafde7b17/Images/Screenshot%202023-04-11%20221057.png "list-units")

This will be mentioning the status of all the services running on the system.

To Start a service:

```
systemctl start service_name
```

To Stop a service:

```
systemctl stop service_name
```

To Restart a service:

```
systemctl restart service_name
```

![systemctl](https://github.com/cloud-devops-enthusiast/DevOpsRoadmap2023/blob/b620a6a27050b0977834f2f368780a4cafde7b17/Images/Screenshot%202023-04-11%20221329.png "service_status")
