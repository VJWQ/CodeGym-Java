package Part1JavaSyntax.Exception;

public class ExceptionExample2
{
    public static void main(String[] args)
    {
        System.out.println("程序启动");

        try
        {
            System.out.println("调用 method1 之前");
            method1();
            System.out.println("调用 method1 之后。这将永远不会显示");
        }
        catch (NullPointerException e)
        {
            System.out.println("空引用。已捕获异常");
        }
        catch (ArithmeticException e)
        {
            System.out.println("除以零。已捕获异常");
        }
        catch (Exception e)
        {
            System.out.println("其他任何错误。已捕获异常");
        }

        System.out.println("程序仍在运行");
    }

    public static void method1()
    {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}