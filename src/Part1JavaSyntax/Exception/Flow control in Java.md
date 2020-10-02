#  try catch finally 


In Java only throwable objects (Throwable objects are instances of any subclass of the Throwable class) can be thrown as exception. So basic data type can no be thrown at all. Following are errors in the above program

In Java, the finally is always executed after the try-catch block. This block can be used to do the common cleanup work. There is no such block in C++.

ArithmeticException is an unchecked exception, i.e., not checked by the compiler. So the program compiles fine. See following for more details. Checked vs Unchecked Exceptions in Java


On division of 20 by 0, divide by zero exception occurs and control goes inside the catch block. Also, the finally block is always executed whether an exception occurs or not.

'throw' keyword is used to explicitly throw an exception. finally block is always executed even when an exception occurs. Call to method C() throws an exception. Thus, control goes in catch block of method B() which again throws an exception. So, control goes in catch block of method A().


