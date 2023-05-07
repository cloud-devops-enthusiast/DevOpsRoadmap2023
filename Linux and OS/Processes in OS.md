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

**Attributes or Characteristics of a Process**

- *Process ID*: Each process in the operating system has a unique identifier given to it, which is known as the process ID.

- *Process State*: The process state is the current status of the process, which may be new, ready, running, waiting, halted, etc.

- *CPU Registers*: The CPU registers are the registers which are used to store the information which is required by the CPU to execute the process. The CPU registers are used to store the information like the address of the memory location, data to be processed, etc and restore the information back whenever a process is swapped in and out of the CPU. 

- *Accounts Information*: The accounts information is the information which is used for the execution of process, time limits, execution ID, etc.

- *I/O Status Information*: The I/O status information is the information which is used to store the I/O status of the process, like the list of I/O devices allocated to the process, a list of open files, etc.

- *CPU Scheduling Information*: The CPU scheduling information is the information which is used to store the information about the process priority, pointers to scheduling queues, etc. Different processes have different priorities, so this information can be further used by the CPU to schedule the processes. Like a shorter process is given a higher priority than the longer process in shortest job first scheduling.

- *Priority*: Every process has given its own priority, which is used by the CPU to schedule the processes. The higher the priority of the process, the higher is the preference given to the process by the CPU. This is also stored in the PCB.

- *General Purpose Registers*: Every process has its own set of registers which are used to store the information which is required by the CPU to execute the process. The CPU registers are used to store the information like the address of the memory location, data to be processed, etc and restore the information back whenever a process is swapped in and out of the CPU.

- *List of Open Files*: At the time of process execution, the process may need some files to be present in the main memory for its execution. So, the operating system needs to keep a track of all the files which are being used by the process. This information is stored in the PCB.

- *List of Open Devices*: At the time of process execution, the process may need some kind of devices to be present in the main memory and connected to the system for its execution. So, the operating system needs to keep a track of all the devices which are being used by the process. This information is stored in the PCB.

**Process States**

- *New*: The process is in the new state when the process is being created. The process stays in the new state until the process is being admitted to the ready state.

- *Ready*: The process is in the ready state when process is ready for execution. The process moves to this state after it has been created.

- *Run* or *Executing*: The process is in the running state when the process is currently running on the CPU. (For example if there is a single processor, only one process can be executed at the time)

- *Wait*: The process is in the waiting state when the process is waiting for an event or for a resource to be allocated. The process moves to this state when it is being interrupted by a process, when it requests for an I/O resource.

- *Complete*: When a process completes its execution, it moves to the complete state from the running state.

- *Suspend*: The process is considered to be in the suspended state when the process is ready for execution but is not currently has not been placed in the ready queue.

- *Terminate*: The process is considered to be in the terminated state when the process has finished its execution and has been removed from the main memory.

**Process Control Block**

The PCB stands for the Process Control structure, which is a data structure which is maintained by the OS for every single process. The PCB should be identified by an Integer Process ID (PID) and it is unique. This helps you to store all the information about the process running to keep the track of the process. The PCB is stored in the main memory.

It is also accountable for storing the contents of the process registers, These all are saved when the state of the process changes and then gets returned back to it. The information is updated very quickly in the PCB by the OS, as the process makes the transition from one state to another.

The main reason behind using PCB is to enable the operating system to manage multiple processes efficiently by taking track of the current state of the each process and allocating system resources for use accordingly. Whenever a process is created, the operating system creates a corresponding process control block which is used to process and store all the relevant information about the process in it. The Operating system uses that information in the process control block to oversee the performance of the process and to track it.

Process Control Block, is mainly used by the operating system to manage multiple processes, like process scheduling, process synchronization, process communication, process termination etc. The information which is stored in the PCB is utilized by the operating system to schedule the process for execution. The PCB is also known as the Task Control Block, as it is used to manage the tasks or the processes.

In context, The PCB is a crucial component required in the today's operating system which enables the efficient management of the processes. The PCB is also known as the process descriptor.

**Context Switching**

This is a technique used by the Operating System to switch between the processes i.e. to switch between the processe from one state to another to execute its task using CPU's in the system. Whenever it switches between the processes, the system stores the old running processes in the form of registers and assigns the CPU to the new processes to execute its tasks. As the new process is in execution the system, the other process must need to wait in the ready queue to be executed. The execution process of the older process is resumed from the point where it was left off. This also defines the characteristics of the multitasking operating system, in which the CPU is allocated to the multiple processes to execute multiple tasks without the need of addtional processors.

The need of context switching is for the following reasons:

- If any high priority tasks comes and gets into the ready queue, the present running process will be shut down or stopped by the high priority process to complete its execution.

- If any running process is waiting for the I/O operation, the current process will be swapped out by the another process to complete its executio, as the I/O request is completed the process will be swapped in again to complete its execution. Context switching helps here in storing the state of the process and resuming it back when the process is swapped out again.

- If any interruption occurs, while process is in execution, the current process status is stored as registers using the context switching. After resolving the interruption, the process switches from the wait state and switch to ready state to complete its execution.

**Mode Switching**

The mode switching changes the process privilege between the modes like the user mode and kernal mode while the process switch changes the process states between multiple states. Firstly there are two modes in which the programs execute, First is the User Mode and Another is Kernal Mode. When the process is being executed in the user domain, the mode is user mode. When the process is being executed in the kernal domain, the mode is kernal mode and this mode includes interrupt handlers, kernal processes, base kernal, kernal extensions, etc. A mode switch occurs when the process requests for a system resource. This happens by the system call interface or by an interrupt. System call allows user mode process to call a kernal function from user mode. Programming libraries allow accessing the functions that directly or indirectly invoke the system.

