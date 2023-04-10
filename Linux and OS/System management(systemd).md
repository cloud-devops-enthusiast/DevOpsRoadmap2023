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

