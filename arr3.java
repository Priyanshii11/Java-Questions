//average from an array
import java.util.Scanner;
public class arr3 
{
    public static void main(String[] args) 
    {
        int i,sum=0;
        int []a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");//input array
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("displaying array ");//display array
        for ( i= 0 ; i < a.length ; i++ )
        { 
            System.out.print(a[i] + " ");
        }
        for(i=0;i<a.length;i++)
        {
          sum=sum+a[i];
        }
        System.out.println();
        System.out.println("Summ of array = " +sum);
        System.out.println("average of array = " +(sum/2));
   
   
    }
    
}
