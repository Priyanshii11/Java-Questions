//wap a method to find averagee
import java.util.Scanner;
public class mtd4 {
    public static float avg(float a,float b) 
    { 
     
        return (a+b)/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        float avg=avg(a, b);
    
    System.out.println("average of 2 number = " +avg);
    }
}
