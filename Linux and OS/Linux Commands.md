**The Shell**

The shell is a program that takes keyboard input as text and executes the commands that are typed which return the output to the screen. Shell is an environment in which we can run our commands, programs and shell scripts. Each flavor of shell has its own set of commands and features.

**Commands**

Commands are the basic building blocks of the shell.

<table>
<thead>
<tr>
<th>Command</th>
<th>Description</th>
<th>Use</th>
</tr>
</thead>
<tbody>
<tr>
<td>echo</td>
<td>This command is used to display a line of text/string that is specified by the user.</td>
<td>echo Hello World</td>
</tr>
<tr>
<td>date</td>
<td>This command is used to display the current date and time.</td>
<td>date</td>
</tr>
<tr>
<td>whoami</td>
<td>This command is used to display the username of the current user.</td>
<td>whoami</td>
</tr>
<tr>
<td>pwd</td>
<td>[Present Working Directory] This command is used to display the present working directory.</td>
<td>pwd</td>
</tr>
<tr>
<td>ls</td>
<td>[List] This command is used to display the contents of a directory.</td>
<td>ls</td>
</tr>
<tr>
<td>touch</td>
<td>This command is used to create an empty file.</td>
<td>touch |filename|</td>
</tr>
<tr>
<td>file</td>
<td>This command is used to determine the type of a file.</td>
<td>file |filename|</td>
</tr>
<tr>
<td>cat</td>
<td>This command is used to display the contents of a file.</td>
<td>cat |filename|</td>
</tr>
<tr>
<td>less</td>
<td>This command is used to display the contents of a file one screen at a time and read the file.

- q: Used to quit out of the less and return back to shell.

- Page Up, Page Down, Up and Down: Navigation using these keys.

- g: Move to the starting of the file.

- G: Move to the end of the file.

- /search: You can search for the specific texts with the /.

- h: Use this for help.</td>
<td>less |filename|</td>
</tr>
<tr>
<td>history</td>
<td>This command is used to display the history of the commands that have been executed.</td>
<td>history</td>
</tr>
<tr>
<td>clear</td>
<td>This command is used to clear the screen.</td>
<td>clear</td>
</tr>
<tr>
<td>cp</td>
<td>[Copy Command] This command is used to copy a file from one location to another.

- *cp -r |Source Directory| |Destination Directory|:*  For copying a whole directory.

- *cp -i |File Name| |Destination Directory|:* For prompting before you overide the same file.</td>
<td>cp |source| |destination|</td>
</tr>
<tr>
<td>mv</td>
<td>[Move Command] This command is used to move a file from one location to another.

- *mv |filename| |destination|:* For moving file to a different directory.

- *mv |file 1| |file 2| |file n| |destination|:* For moving multiple files to a different directory.

- *mv -i |file 1| |file 2| |file n| |destination|:* For prompting before you overide the same file.
</td>
<td>mv |source| |destination|</td>
</tr>
<tr>
<td>mkdir</td>
<td>[Make Directory] This command is used to create a new directory.

- *mkdir |directory 1| |directory 2| |directory n|:* For creating multiple directories at the same time.

- *mkdir -p |Parent Directory/ Sub-Directories|:* For creating sub-directories at the same time.</td>
<td>mkdir |directory name|</td>
</tr>
<tr>
<td>rm</td>
<td>[Remove] This command is used to remove a file.

- *rm -f |file 1| |file 2| |file n|:* For removing files, whether they are protected or not. Without prompting the user.

- *rm -i |file 1| |file 2| |file n|:* For removing files, while giving prompt on whether you want to remove it or not.

- *rm -r |directory|:* For removing multiple files and sub-directories. Here the -r represents the recursive flag.

- *rmdir |directory|:* For removing directory with rmdir commands.</td>
<td>rm |filename|</td>
</tr>
<tr>
<td>find</td>
<td>This command is used to find files and directories.

- find |directory| -name |filename|: For finding a file in a directory.

- find |directory| -type d -name |directory name|: For finding a directory in a directory.
</td>
<td>find |directory| -name |filename|</td>
</tr>
<tr>
<td>help</td>
<td>This command is used to displays the help for other bash commands.</td>
<td>help |command name|</td>
</tr>
<tr>
<td>man</td>
<td>This command is used to display the manual or documents for the bash commands.</td>
<td>man |command name|</td>
</tr>
<tr>
<td>exit</td>
<td>This command is used to exit the shell.</td>
<td>exit</td>
</tr>
</tbody>
</table>