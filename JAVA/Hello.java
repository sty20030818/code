import java.util.Scanner;

/**
 * 我的第一个JAVA程序
 * @author sty
 * @version 1.0
 */


// public class Main
// {
//     public static void main(String[] args) throws Exception
//     {
//         String x = "Hello World!";
//         System.out.println(x);
//     }
// }

// class Welcome
// {
//     public static void main(String[] args)
//     {
//         System.out.println("hello!");
//     }
// }

class Echo
{
    public static void main(String[] args)
    {
        System.out.println("你好");
        Scanner in = new Scanner(System.in);
        System.out.println("echo:" + in.nextLine());
        in.close();
    }
}
