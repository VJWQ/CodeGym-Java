package Part1JavaSyntax.Exception;

public class ExceptionExample {
    public static void main(String[] args) throws Exception {
         System.out.println(method1().length);   //12
         System.out.println(method10().length);  //3
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();
    }

    public static StackTraceElement[] method3() {
        return method4();
    }

    public static StackTraceElement[] method4() {
        return method5();
    }

    public static StackTraceElement[] method5() {
        return method6();
    }

    public static StackTraceElement[] method6() {
        return method7();
    }

    public static StackTraceElement[] method7() {
        return method8();
    }

    public static StackTraceElement[] method8() {
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
//    public static void main(String[] args) throws Exception {
//        int deep = getStackTraceDepth();
//    }
//
//    public static int getStackTraceDepth() {
//        // 在此编写你的代码
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        System.out.println(stackTraceElements.length);
//        return stackTraceElements.length;
//    }
    ///////////////////////////////////
//    public static void main(String[] args)
//    {
//        method1();
//    }
//
//    public static void method1()
//    {
//        method2();
//    }
//
//    public static void method2()
//    {
//        method3();
//    }
//
//    public static void method3()
//    {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements)
//        {
//            System.out.println(element.toString());
//            System.out.println("Method Name: " + element.getMethodName());
//            System.out.println("Class Name: " + element.getClassName());
//            System.out.println("File Name: " + element.getFileName());
//            System.out.println("Line Number: " + element.getLineNumber());
//
//            System.out.println();
//        }
//        System.out.println(stackTraceElements[0]);
//
//        System.out.println(stackTraceElements.length);
//    }
//    Output:
//    Method Name: getStackTrace
//    Class Name: java.lang.Thread
//
//    Method Name: method3
//    Class Name: Part1JavaSyntax.Exception.ExceptionExample
//
//    Method Name: method2
//    Class Name: Part1JavaSyntax.Exception.ExceptionExample
//
//    Method Name: method1
//    Class Name: Part1JavaSyntax.Exception.ExceptionExample
//
//    Method Name: main
//    Class Name: Part1JavaSyntax.Exception.ExceptionExample


}
