**File System**

*File*

A file is a container in a computer system for storing information or data. Files can be considered just like the paper documents used in library or at offices. There are many types of files like text files, audio files, directory files, binary or audio files, which stores different types of data and information in it. These files can be stored onto the storage devices like hard disk, floppy disk, CD-ROM, DVD, etc. The files are stored in the storage devices with a name and an extension. The extension of the file is used to identify the type of file. For example, the extension .txt is used for text files, .mp3 for audio files, .doc for word files, etc.

*File Structure*

The file structure is the way in which the data should be stored in the required format so the operating system can understand it.

- A file can have several attributes like name, size, date, time, extension, etc according to the operating system and its type.

- A text file is a file that stores the text data or characters in the form of lines and paragraph.

- A binary file is a file that stores the data in the form of 0s and 1s.

- A directory file is a file that stores the information about the files and folders in the form of a tree structure.

- A source file is a file that stores the source code of a program with sequential instructions and functions.

- As Operating System defines the file structure, the file structure is different for different operating systems.

*File Type*

The file type is a major distinguishing factor for the different files. OS (Operating System) like Windows, Linux, Mac OS, etc. uses different file types to store the data. There can be different types of files in those OS:

- Ordinary Files
  
  - These are the usual files that comsists of the user information.
  - These may have the text, database and executable files.
  - The user can use the operations on such kind of files like add, modify, delete, etc.

- Directory Files

  - These files consists of the list of file names and the information about them.

- Special Files

  - These are the files also called as device files.
  - These files are used to access the hardware devices like printer, scanner, etc.
    
    These files can be of two types:

    - Character Special Files: These files are used to handle the data character by character in the case of terminals and printers.

    - Block Special Files: These files are used to handle the data in the form of blocks in the case of hard disks and tapes.

- File Access Mechanisms: This refers to the manner in which the records of the file are accessed.

  - Sequential Access: In this type of access, the records are accessed in the order in some sequence i.e. The information is accessed and processed in the order in which it is stored in one record after the other. This is the most common type of file access mechanism. For example, a text file is accessed in this manner.

  - Direct/Random Access:
    - Randomly accessing the records and the files, accessing the records in any order directly.
    - Each record is having its own address over the file by using which it can be accessed directly.
    - These records are not needed to be in sequence inside the file and they not need to be in any order on the storage device.

  - Indexed sequential access:
    - This whole model is based on the concept of sequential access.
    - A whole record of the indexes is created for every record in the file with the pointers to the records.
    - These indexed records are searched sequentially and the records uses the pointers to access the records directly.

- Space Allocation

Space allocation is the process of allocating the space to the files present in the storage devices like hard disk, floppy disk, etc by the operating system. The space allocation is done by the three main ways to allocate the space to the files:

  - Contiguous Allocation: In this method of space allocation, the space is allocated to files in the form of contiguous address on the disk. This method assigns the space in a linear order or in a sequential order. This method is easy to implement but external fragmentation is a major problem in this method.

  - Linked Allocation: In this method of space allocation, every file has its own list of links to the disk blocks. This link with every file present in the directory has a pointer or link to the next block of the file. This method has no external fragmentation. This method is effectively used in sequential access of files, but it is inefficient in the case of directly accesssing the files.

  - Indexed Allocation: In this method of space allocation, a index block is created for every file which contains the pointers to the files. This method is designed so overcome the problems of contiguous and linked allocation methods. Every file has its own index block which contains the pointers to the blocks of the file. In the process, each Directory contains the index block of the file. This method is used in the case of random access of files.