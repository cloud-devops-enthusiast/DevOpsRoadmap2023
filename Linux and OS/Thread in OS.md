**Thread in OS**

Thread is a lightweight process that a operating can schedule and run concurrently with the other threads. You can say thread as just like the threads of our cloth which are woven together to make a cloth. Similarly, threads are woven together to make a process. Operating system is responsible for managing all the threads while sharing the memory with other resources and processes at the same time. As a single work can be divided among multiple peoples to make it more efficient and faster with collaboration, similarly a process can be broken down into multiple threads to make it more efficient and faster. Threads can be also termed as light weight processes, where each thread possess some of the properties of the parent process and some of its own.

**Necessity of Thread**

- As these threads run parallel to each other, so they improve the performance of the application by efficiently utilizing thne resources of the system.

- Threads have their own CPU states and stacks but they share their address space with the process that created them, which enables them to share the data with other threads of the same process.

- Threads also share some common data with other threads of the same process, which helps them to not make use of the interprocess communication to communicate each time when they need it. This also helps in reducing the overhead of the system.

- As menmtioned before threads also have states like ready, executing, blocked etc. So, they can be used to perform multiple tasks at the same time.

- Priorities can be also assigned to the threads, just like for the porcesses. So, the threads with higher priority can be executed first.

- Every threads has their own thread control block(TCB), like PCB of the process. So all of the information about the thread is stored in the TCB. This helps in context switching between the threads, as the threads usually share the same address space and resources synchronization becomes required for activities of the threads.

**Multithreading**

As thread is a lightweight process, which is a part of a process. So the process to achieve parallelism by dividing the process into multiple threads, for example consider a game where the player is playing and at the same time the background music is also playing while your score is also being updated with the actions you are making the character to perform, etc. So, all of these tasks are being performed by the threads to make the game more efficient and faster.

This process of dividing the process into multiple threads is called multithreading. Multithreading is a very important concept in the operating system as it helps in acvhieving parallelism and concurrency. In multithreading, This helps in Operating systems to improve the performance and responsiveness of the overall system. Mutithreading allows multiple running threads to share the same resources of the system like memory, CPU, etc. at the same time. So, the threads can be executed in parallel to each other.

**Gap Between Process and Thread**

The main cosiderable difference between a process and thread is that, Threads within the same process run in a shared memory space, while processes run in a separate memory space. Threads are not independent like processes, as a result threads shares their code sections, data sections and OS resources like open files and signals with other threads of the same process.

For ease process is whole cloth and thread is a single thread of the cloth which binds with other threads to make a cloth.

**Types of Threads**

There are three types of threads:

- User Level Threads

User level threads are kind of threads which are not created by using the system calls. These kind of threads has no interference of the kernel. In the cases where theses threads are single threaded processes, the kernal comes in between and manages them. As well as the user level threads are kind of inexpensive as they do not need to create their own address space. As the kernel is not managing the threads the OS is also not aware of the threads. There is less duration of context switching in the user level threads. User level threads are tend to be more efficient than the kernel level threads as they have presence of only the program counter, register set and the stack space. There is one big issue with the user level threads that if one thread performs a blocking system call or there is a page fault then the whole process will be blocked.

- Kernel Level Threads

A Kernal level Thread is a kind of thread which is recognized by the Operating system easily. These threads has its own thread table which keep the track of the system. The kernal of the operating system helps in taking care of the thread management in the back. Kernal level threads usually somehow have longer duration of context switching time. As we seen there is interaction of kernal with the thread, which makes it more up to date with all the information on all of th threads. In case any process requires more time to process the data, The kernal level thread provide time to it. The implementation of the kernal level threads is more complex than the user level threads, which makes them also slower than the user level threads.

**Components of Thread**

A thread consists of three components:

- Program Counter

- Register Set

- Stack Space

**Concurrency in Operating System**

Concurrency is the process of execution in which multiple instruction sequences are executed at the same time, this condition usually happens in the operating system when serveral process threads are running in parallel where the running process threads communicate with each other through a shared memory or message passing. Concurrency results in the sharing of the resource results in the condition like deadlocks and resource starvation. This also helps in conditions like coordinating execution of process, memory allocation and execution scheduling for maximizing the utilization of the system.

There are multiple reasons allowing the concurrency in the operating system:

- Physical Resource Sharing: As there are multiple users since the hardware resources are limited, so the resources are shared among the users.

- Logical Resource Sharing: As there are shared files with multiple users.

- Computation Speedup: As there are multiple processes running at the same time, resulting into parallel execution.

- Modularity: Breaking down the system functions into separate processes.

There are some advatages of the concurrency as well:

- Concurrency allows multiple applications to run at the same time.

- It makes the better utilization of the resources of the system, like in case when the resources that are unused by the application can be used for other applications.

- Without the concurrency, the system needs to complete the execution of one process before starting the execution of another process.

**Principles of Concurrency**

As Interleaved and Overlapped processes can be said as examples of cocurrrent processes, as these both processes presents the same problem. Here, the execution time cannot be predicted, as it depends on multiple parameters like the activity of the other processes or the way operating system handles interruptions or the scheduling policies of the operating system. 

**Problems in Concurrency**

- Sharing global resources: As the resources are shared among the processes, If two concurrent processes try to access the same resource at the same time, then the result of the execution will be unpredictable. For instance, there is a global variable which is being used by two processes, and both make read and write operations on the variable, then the executed result will be critical.

- Optimal allocation of resources: As the resources are shared among the processes, so the resources should be allocated in such a way that the resources are utilized in the best possible way.

- Locating programming errors: As it is very difficult to locate the programming errors in the concurrent processes, as the result of the execution is unpredictable.

- Locking the channel: It may be inefficient for the operating system to lock the channel for the process, as the process may not be using the channel for a long time.

**Relationship between Processes**

The processes executing in the Operating System are of two types:

- Independent Process

This kind of process does not share its state with any other process running in the operating system, As the name suggests the termination of one such kind of process will not terminate any other process. In an independent process, the result of the execution entirely depends upon the input state of the process and will always be same for the same input.

- Cooperating System

This kind of process shares its state with the other processes running in the operating system. The result of the execution for such kind of procesess depends on the relative execution sequence and cannot be predicted in advance. The result of the execution will not be always be the same for the same input. Termination of the cooperating process may result in the termination of the other process.

**Operations on a Process**

There are multiple operations that can be performed on a process, out them some of the important operations are:

- Creation of a process

A parent process can create a child process when more than one process is required to perform a task. The parent process and a child process can execute concurrently. The parent process is required to wait until the child process are terminated. Just like our home, the parent and child both need to share all the resources of the system in common, but the child process only a subset of the parent resources. The child process can also create a child process of its own, resulting in a tree of processes.

- Process Termination

A parent can terminate the execution of one of its child process when a child has exceeded its usage of the reasources allocated to it or the task assigned to this child process is not required now. Also incase, If the parent has terminated than its child must also be terminated.

- **Process Synchronization**

Process synchronization is a way by which you can make coordination between multiple processes of a system while ensuring that they access the shared resources in a controlled way. The main aim of the process synchronization is to solve the race condition and other issues of synchronization in a concurrent system. The main reason of process synchronization is to make sure that multiple process access the shared resources in a controlled way without interfering, resulting in the unpredictable behavior of the system.

There are two types of process synchronization:

- Independent Process: In this kind of process, the execution of one or the multiple processes will not affect the execution of the other process which will be having minimal or no impact on the overall outcome.

- Cooperative Process: In this kind of process, the execution of one process affects the execution of the other process so processes must be synchronized in the order for the correct execution of the process. The best example of such kind of process is the two processes sharing the same data including memory, variables, files, etc at the same time.

**Race Condition**

Under this condition one process will be executing the same code or accessing the same resource at the same time. Due to which there is a race like condition, that is being evolved here resulting in the wrong value of the variable. This condition is also known as the critical section problem.

**Critical Section**

Critical Section is the segment of the code which can be accessed by only one process at a time. This critical section of the code which consists of the variable which needs to be synchronized to maintain the consistency of the data variables. 