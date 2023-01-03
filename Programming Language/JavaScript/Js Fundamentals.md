**JavaScript**

- Javascript is a lightweight, interpreted or just-in-time compiled programming language with first-class functions.
- Javascript's dynamic capabilities include runtime object construction, variable parameters lists, function variables, dynamic script creation, object introspection and source code recovery.
- Do not confuse with the java programming language- Javascript is not "Interpreted Java". However, the two programming languages have very different syntax, semantics and use.

**Javascript Code**

- **Script Tag in JS**

- Here you can see the ``` <script> ``` tag in action which can be used to integrate JavaScript code into a HTML document.

Input:
```
0
```

Output:
```
Before the script...
...After the script.
```

- As seen before you specified the ``` <script language> ``` or ``` <type="text/javascript"> attribute to specify the language of the script.

Example:
```
<script type="text/javascript">
<!--//-->
</script>
```

- If you have lot of javascript code we can use multiple files to store the code. This is done by using the ``` <script src> ``` tag.

Example:
```
<script scr="/js/script1.js"></script>
<script scr="/js/script2.js"></script>
```

Note: You cannot use a single ``` <script> ``` tag can't have both the src and code attributes inside same.
Example:
```
//This code will not work
<script src="file.js">
  alert(1);
</script>
```

You need to specify a separate ``` <script> ``` tag for the code.

```
//This is the right way to do it
<script src="file.js"></script>
<script>
  alert(1);
</script>
```

- **Statements in JS**

- Statements are syntax constructs and commands that perform actions. We can add as many as statements in program as we want. Each statement should end with a semicolon(;).

Example:
```
alert('Hello World');
```

- Semicolons can be omitted in most cases when a line break exists.

Example:
```
alert('Hello World')
alert('Learn Javascript')
```

- **Comments in JS**

- Comments are used to explain Javascript code and as program becomes more and more complex it becomes necessary to add comments to code. As, Comments are ignored by the JavaScript interpreter.

Example:
```
///This is a single line comment
/*This is a multi-line comment
This is the another line of comment*/
```

- **Javascript Variables**

- A variable is a "named storage" for data. we can use variables to store data and reuse it later. 

- To create a variable in JavaScript, use the ``` let ``` keyword.

Input:
```
let message="Hello World";
let age=25;
alert(message);
alert(age);
```

Output:
```
Hello World
25
```

- For instance, the variable ```message``` can be imagined as a box lablled **message** with the value *Hello World* in it. We can put any value in the box. We can also change it as many times as we want. When the value is changed, the old data is removed from the variable with the new value.

Input:
```
let message="Hello World";
message="Hello World 2";
alert(message);
```

Output:
```
Hello World 2
```

- You can also declare two variables and copy data from one into the other.

Input:
```
let message="Hello World";
//Copy 'Hello World' from message into message2
let message2=message;
alert(message);
alert(message2);
```

Output:
```
Hello World
Hello World
```

- **Variable Naming in JS**

- There are two limitations on variable names in JavaScript:

1. The name must contain only letters, digits, or the symbols ```$``` and ```_```.

2. The first character must not be a digit.

Example:
```
let $ = 1; // declared a variable with the name "$"
let _ = 2; // and now a variable with the name "_"
alert($ + _); // 3
```

