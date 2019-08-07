# Special Notation String Calculator
<b>Introduction</b>

This project is an attempt to solve the below problem. A test driven development approach was used in order to work towards a solution. There is a basic model within the project that was introduced to start modelling a solution. 

Finding the solution was time boxed to approx 3 hours and therefore not all aspects of the problem was solved, these include:- <br />
<br />
-Refactor the calculator to allow specifying the operators as words for example  5 6 + is passed to the program as 5 6 Add and 5 6 - 7 + is passed as 5 6 Subtract 7 Add.<br />
-The calculator should support the following operator Factorial (!) <br />
-More focus on the model


<b>Problem - Calculator special notation</b>

In the special notation the operators (+,-,x etc) follow their operands (numbers); for instance, to add 5 and 6, one would write 5 6 + rather than 5 + 6.

If there are multiple operations, operators are given immediately after their second operands; so the expression written 5 − 6 + 7 in conventional notation would be written 5 6 − 7 + in the special notation: 6 is first subtracted from 5, then 7 is added to it.

See more examples below

 

Examples

The examples below are in the following format,  special notation = conventional notation = result

1 1 +   =   1+1   =  2 <br />
2 1 1 + -   =  2 - (1 + 1)  =  0 <br />
3 4 5 x -  =  3 - (4 x 5)  =  -17 <br />
3 4 - 5 x  =  (3 - 4) x 5  =  -5 <br />
10 5 2 2 + - / 4 x 2 1 1 + + -   =   ((10 / (5 - (2 + 2))) x 4) - (2+(1+1))   =   36 <br />
 

- The calculator should support the following operators Add (+), Subtract (-), Multiply (x),  Divide (/) , Modulus (%) and Factorial (!)
- Write unit tests for the calculator
- Refactor the calculator to allow specifying the operators as words for example  5 6 + is passed to the program as 5 6 Add and 5 6 - 7 + is passed as 5 6 Subtract 7 Add.
