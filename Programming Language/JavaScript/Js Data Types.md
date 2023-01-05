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