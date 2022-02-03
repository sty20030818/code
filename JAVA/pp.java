import java.util.Scanner;

public class pp
{
    public static void main(String[] args)
    {
        final int price = 10; // = const int
        int coin;
        System.out.println("请投币：");

        Scanner in = new Scanner(System.in);   //输入投币数
        coin = in.nextInt();

        if(coin >= price)
        {
            System.out.println("*******************");
            System.out.println("*    这是一张票    *");
            System.out.println("*     票价10元     *");
            System.out.println("*******************");

            System.out.println("找您："+(coin-10)+"元");
                    //printf("找您：%d元",10-coin);
        }
        else System.out.println("钱不够诶");
        in.close();
    }
}
