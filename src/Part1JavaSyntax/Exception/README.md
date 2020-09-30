#Try, catch, throw and throws in Java

## Stack Trace
a report of the active stack frames at a certain point in time during the execution of a program. 
A stack trace allows tracking the sequence of nested functions called - up to the point where the stack trace is generated.  
In a post-mortem scenario this extends up to the function where the failure occurred (but was not necessarily caused).
```java
public class ExceptionExample
{
  public static void main(String[] args)
  {
    method1();
  }

  public static void method1()
  {
    method2();
  }

  public static void method2()
  {
    method3();
  }

  public static void method3()
  {
     StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements)
    {
       System.out.println(element.getMethodName());
    }
  }
}
```