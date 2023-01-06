//wap tp sum all the natural number

import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,i;
        for (i=0;i<=a;i++)
        {
          sum +=i;
          System.out.println(sum);
            
        }
        System.out.println("sum of "+a+ "number is=" +sum);
    }

    
    
}
