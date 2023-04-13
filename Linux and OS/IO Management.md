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

