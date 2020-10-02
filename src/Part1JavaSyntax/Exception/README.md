# Exceptions in Java
Try, catch, throw and throws in Java

## Stack Trace
a report of the active stack frames at a certain point in time during the execution of a program. 
A stack trace allows tracking the sequence of nested functions called - up to the point where the stack trace is generated.  
In a post-mortem scenario this extends up to the function where the failure occurred (but was not necessarily caused).

## StackTraceElement
- An element in a stack trace, as returned by `Throwable.getStackTrace()`. Each element represents a single stack frame. 
  - All stack frames except for the one at the top of the stack represent a method invocation. 
  - The frame at the top of the stack represents the execution point at which the stack trace was generated. 
    - Typically, this is the point at which the throwable corresponding to the stack trace was created.
- When one method calls the other, a new StackTraceElement Object would be created and put on the top of the stack. It will be removed once the method has been terminated. 
- The stack stores the most updated status of the call stack. 
- Each `StackTraceElement` Object contains the information of the method containing the execution point represented by this stack trace element.
- Method and Description

|  Method   | Description  |
|  -------  | -----------  |
|**getMethodName()**|Returns the **name of the method** containing the execution point represented by this stack trace element.|
|**getClassName()**|Returns the **fully qualified name of the class** containing the execution point represented by this stack trace element.|
|**getLineNumber()**|Returns the **line number of the source line** containing the execution point represented by this stack trace element.|
|**getFileName()**|Returns the **name of the source file** containing the execution point represented by this stack trace element.|
|**toString()**|Returns a string representation of this stack trace element.|

## 