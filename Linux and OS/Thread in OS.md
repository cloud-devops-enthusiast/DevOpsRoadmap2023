**Thread in OS**

Thread is a lightweight process that a operating can schedule and run concurrently with the other threads. You can say thread as just like the threads of our cloth which are woven together to make a cloth. Similarly, threads are woven together to make a process. Operating system is responsible for managing all the threads while sharing the memory with other resources and processes at the same time. As a single work can be divided among multiple peoples to make it more efficient and faster with collaboration, similarly a process can be broken down into multiple threads to make it more efficient and faster. Threads can be also termed as light weight processes, where each thread possess some of the properties of the parent process and some of its own.

**Necessity of Thread**

- As these threads run parallel to each other, so they improve the performance of the application by efficiently utilizing thne resources of the system.

- Threads have their own CPU states and stacks but they share their address space with the process that created them, which enables them to share the data with other threads of the same process.

- Threads also share some common data with other threads of the same process, which helps them to not make use of the interprocess communication to communicate each time when they need it. This also helps in reducing the overhead of the system.

- As menmtioned before threads also have states like ready, executing, blocked etc. So, they can be used to perform multiple tasks at the same time.

- Priorities can be also assigned to the threads, just like for the porcesses. So, the threads with higher priority can be executed first.

- Every threads has their own thread control block(TCB), like PCB of the process. So all of the information about the thread is stored in the TCB. This helps in context switching between the threads, as the threads usually share the same address space and resources synchronization becomes required for activities of the threads.

