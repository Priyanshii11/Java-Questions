//find second largest number
import java.util.Arrays;
import java.util.Scanner;

public class arr8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[]{25,6,8,0,44};
      int n=a.length;
      Arrays.sort(a);
      System.out.println("largest element is:" + a[n-2]);
    }   
 }

    
    

