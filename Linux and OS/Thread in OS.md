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