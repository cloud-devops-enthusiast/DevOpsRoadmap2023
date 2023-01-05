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

**Constants in JS**

- To declare a constant (unchanging) variable, use ```const``` instead of ```let```:

Input:
```
const myBirthday = '04.05.1999';
alert(myBirthday);
```
Output:
```
04.05.1999
```

- Variables declared using ```const``` are called "constants". They cannot be changed. An attempt to do so would cause an error:

Input:
```
const myBirthday = '04.05.1999';
myBirthday = '01.01.2001'; // error, can't reassign the constant!
```
Output:
```
TypeError: Assignment to constant variable.
```

**Uppercase constants**

There is a widespread practice to use constants as aliases for difficult-to-remember values that are known prior to execution. Such constants are named using capital letters and underscores.

For instance, let's make constants for colors in so-called web “hex” format:

Example:
```
const COLOR_RED = "#F00";
const COLOR_GREEN = "#0F0";
const COLOR_BLUE = "#00F";
const COLOR_ORANGE = "#FF7F00";

// ...when we need to pick a color
let color = COLOR_ORANGE;
alert(color); // #FF7F00
```

Benefits:

- ```COLOR_ORANGE``` is much easier to remember than ```#FF7F00```.
- It is much easier to mistype ```#FF7F00``` than ```COLOR_ORANGE```.
- When reading the code, ```COLOR_ORANGE``` is much more meaningful than ```#FF7F00```.

Name Things Right:

- A variable name should have a clean, obvious meaning, describing the data it stores.
- Variable naming is one of the most important and complex skills in programming. A quick glance at variable names can reveal which code was written by a beginner versus an experienced developer.

- **Practise:**
- *Working with variables:*

1.  Declare two variables: admin and name.

2. Assign the value "John" to name.

3. Copy the value from name to admin.

4. Show the value of admin using alert (must output “John”).

Input:
```
<!DOCTYPE HTML>
<html>
<body>
  <p>Before the script...</p>
  <script>
   let  name = "John";
   let admin = name;
   alert("name: "+name);
  </script>  
  <p>...After the script.</p>
</body>
</html>
```

Output:
```
name: John
```

- *Giving the right name:*

1. Create a variable with the name of our planet. How would you name such a variable?

2. Create a variable to store the name of a current visitor to a website. How would you name that variable?

Input:
```
<!DOCTYPE HTML>
<html>
<body>
  <p>Before the script...</p>
  <script>
   var our_planet;
   our_planet = "Earth";
   var current_user;
   current_user = "John";
   alert("Our Planet is "+ our_planet +" and current user on our website is "+ current_user +"");
  </script>  
  <p>...After the script.</p>
</body>
</html>
```

Output:
```
Our Planet is Earth and current user on our website is John
```

- *Uppercase constants:*

Input:
```
<!DOCTYPE HTML>
<html>
<body>
  <p>Before the script...</p>
  <script>
   const BIRTHDAY = '04.05.1999'; // make uppercase?
   alert("My birthday is " + BIRTHDAY);
  </script>  
  <p>...After the script.</p>
</body>
</html>
```

Output:
```
My birthday is 04.05.1999
```

- **Data Types in JS**

- *Number*:

- The number type represents both integer and floating point numbers. There are many operations for number values:

*Infinity* represents the mathematical infinity ∞. It is a special value that’s greater than any number.

```
alert( 1 / 0 ); // Infinity
```

*NaN* represents a computational error. It is a result of an incorrect or an undefined mathematical operation, for instance:

```
alert( "not a number" / 2 ); // NaN, such division is erroneous
```

*NaN* is sticky. Any further operation on *NaN* returns *NaN*:

```
alert( "not a number" / 2 + 5 ); // NaN
```