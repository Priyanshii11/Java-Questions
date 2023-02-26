import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
    int i;
    int a[] = new int[3];
    Scanner scan = new Scanner(System.in);
    for(i=0;i<a.length;i++)
    {
         a[i] = scan.nextInt();
    }
    for(i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }

   
    
}
}
