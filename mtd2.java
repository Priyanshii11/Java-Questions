//write a method to find enter num is true or not if even return true and odd reurn false
import java.util.Scanner;
public class mtd2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        boolean b=isEven(a);
        if(b==true)
        {
        System.out.println("even number");
    }
    else 
    {
    System.out.println("odd number");
}
}
public static boolean isEven(int x)
{
 if (x%2==0)
 {
    return true;
 }
 else 
 {
    return false;
 }
}
    }
