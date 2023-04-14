**I/O Management**

An I/O management system is required to manage the I/O requests and to provide the requests to the I/O devices. It is just like a mediater sitting in between your devices and the operating system (OS). These I/O devices are divided into two categories:

- Block Devices: A block device is a device that communicates by sending entire blocks of data. For example: Hard disk, CD-ROM, DVD-ROM, etc.

- Character Devices: A character device is one with which the driver communicates by sending and receiving single characters. For example: serial ports, parallel ports, etc.

- Network Devices: A network device is a device that communicates by sending and receiving packets of data. These network devices deliver more than a single character at a time and there is no fixed value of block size, as they more of stream data in chunks. For example: Ethernet, Wi-Fi, etc.
*Device Controllers*

Device drivers are the software that controls the hardware devices, as the name suggests it is a driver for your hardware devices. For example you have an RGB Keyboard and you want to control the RGB lights on your keyboard, you need a driver for your keyboard. That particular software will be called a driver.

These device drivers cant be directly installed on the OS, they need to be installed on the device controllers. The device controller can handle multiple devices at the same time, but as the name suggests it is a controller for your devices. Device controllers act as an interface whose job is to convert serial bit stream to blocks of bytes and perform other functions like error checking, etc.

When you plug any of your devices or hardware it gets connected via some port, plug or socket which is being connected to a device controller. The device controller then communicates with the device driver to perform the required task.

*Types of I/O Management*

There are two types of I/O management:

- Synchronous I/O: In this type of I/O management, the CPU is blocked (Execution Wait) until the I/O operation is completed. This is also called as blocking I/O.

- Asynchronous I/O: In this type of I/O management, the CPU is not blocked (Proceeds Concurrently) until the I/O operation is completed. This is also called as non-blocking I/O.

*CPU/Device Interactions*

The CPU seeks the device registers as memory locations which are mapped to their specific physical addresses. When the CPU writes to these registers or those physical addresses, the integrated PCI controller realizes that the CPU is trying to access a device and it then forwards the request to the appropriate device. Hence from the above interaction, we can say that the CPU is interacting with the device via the integrated PCI controller and has a portion of the physical memory mapped dedicated to the device interactions. The above interaction is called as *Memory Mapped I/O*.

The portion of the physical memory dedicated or reserved for the device interactions in controlled by the *Base Address Registers.*

There is a another method by which the CPU interacts with the device, this is called as *I/O Port Mapped I/O.* In this method, the CPU interacts with the device via the special instructions. Each instruction needs to specify the target device - the I/O port - as well as some of the values which will be passed to the device.

