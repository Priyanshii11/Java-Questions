//write a method name gettotal and get sum of two digit number
import java.util.Scanner;
public class mtd1
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the first number");     
            int a=sc.nextInt();
            System.out.println("enter the second number");
            int b=sc.nextInt();
            int sum=getTotal(a,b);
            System.out.println("sum of two number are = "+sum);
   }
public static int getTotal( int x, int y)
{
       return x+y;
}

}
    