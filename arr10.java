//find 2nd smallest number
import java.util.Arrays;
import java.util.Scanner;

public class arr10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int[] a=new int[]{25,6,8,0,44};
              Arrays.sort(a);
              System.out.println("smallest element is:" + a[1]);
            }
}