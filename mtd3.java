//wap a function of sum of all n number 
import java.util.Scanner;
public class mtd3 
{   public static int sumOfNum(int num)
    {
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum+=i;
            System.out.println("numbers = " +i);
        }
        System.out.println("-----------------");
        return sum;

    }
    public static void main(String[] args) 
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int n = sumOfNum(a);
        System.out.println("sum of n " +a+ " is " +n);
    }
}
