//print table
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
         System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("table of " +a+ " is here");
        for (int i=1;i<=10;i++)
        {
             System.out.println(+a+" * " +i+ "=" +(i*a));
        }
    }
    
}
