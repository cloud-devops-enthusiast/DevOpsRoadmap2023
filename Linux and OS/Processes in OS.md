**Process**

A process is an instance of program (e.g. a Python program or java program) which is under the process being executed, i.e. in execution. Process is more kind of an active entity other than a program which is more of like a passive entity. A single program can have multiple processes when the program is being run multiple times. The Operating system helps you to create, schedule and terminate the processes and also provides ways for the processes to communicate with each other and with the system memory which is being utilized by the CPU. Usually whenever a process runs, it is a copy of the original process which is stored in the secondary memory. The process is loaded into the main memory and then the execution takes place. This kind of process where the process is being created by the main process is called as a Child Process.

**Process Management**

Process Management is a technique which is used to control the processes i.e, involves in various tasks like creation, deletion, scheduling, termination of process and a dead lock. If the operating system supports multiple users, then it must have a process management system. As operating system is responsible for the execution of the processes, as it helps to protect the resources allocated to the multiple processes and maintaining synchronization between them. As it is more of the job of the operating to keep a check of the running processes in an operating system, for handeling operations like the process scheduling or allocation of the resources.

**Process Architecture**

The process architecture is a model which helps you to know how the process looks like in the memory.

|-------------------------|
|         Stack           |
|-------------------------|
|         Heap            |
|-------------------------|
|         Data            |
|-------------------------|
|         Text            |
|-------------------------|

Text Section: This section of a process, is sometimes known as text section which includes the current activity represented by the value of the Program Counter and the contents of the processor’s registers.

Data Section: This section of a process, is sometimes known as data section which includes the global and static variables.

Heap Section: This section of a process, is used to allocate memory dynamically to the process during its run time.

Stack Section: This section of a process, is used to store the temporary data like the function parameters, return addresses, local variables etc.

**Process Control Block**

The PCB stands for the Process Control structure, which is a data structure which is maintained by the OS for every single process. The PCB should be identified by an Integer Process ID (PID) and it is unique. This helps you to store all the information about the process running to keep the track of the process. The PCB is stored in the main memory.

It is also accountable for storing the contents of the process registers, These all are saved when the state of the process changes and then gets returned back to it. The information is updated very quickly in the PCB by the OS, as the process makes the transition from one state to another.

The main reason behind using PCB is to enable the operating system to manage multiple processes efficiently by taking track of the current state of the each process and allocating system resources for use accordingly. Whenever a process is created, the operating system creates a corresponding process control block which is used to process and store all the relevant information about the process in it. The Operating system uses that information in the process control block to oversee the performance of the process and to track it.

Process Control Block, is mainly used by the operating system to manage multiple processes, like process scheduling, process synchronization, process communication, process termination etc. The information which is stored in the PCB is utilized by the operating system to schedule the process for execution. The PCB is also known as the Task Control Block, as it is used to manage the tasks or the processes.

In context, The PCB is a crucial component required in the today's operating system which enables the efficient management of the processes. The PCB is also known as the process descriptor.

**Process States**

