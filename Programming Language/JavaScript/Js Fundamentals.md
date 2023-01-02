**JavaScript**

- Javascript is a lightweight, interpreted or just-in-time compiled programming language with first-class functions.
- Javascript's dynamic capabilities include runtime object construction, variable parameters lists, function variables, dynamic script creation, object introspection and source code recovery.
- Do not confuse with the java programming language- Javascript is not "Interpreted Java". However, the two programming languages have very different syntax, semantics and use.

**Javascript Code**

- Here you can see the ``` <script> ``` tag in action which can be used to integrate JavaScript code into a HTML document.

Input:

```
<!DOCTYPE HTML>
<html>
<body>
  <p>Before the script...</p>
  <script>
    alert( 'Hello, world!' );
  </script>
  <p>...After the script.</p>
</body>
</html>
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