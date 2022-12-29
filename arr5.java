//copy all element from one array to another
public class arr5 {
    public static void main(String[] args) {
        int[] a=new int[]{25,6,8,0,44};
        int i;
        System.out.println("array stored in a");
        for( i=0;i<a.length;i++)  
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] b=a;
        System.out.println("array stored in b");
        for(i=0;i<a.length;i++){
            System.out.print(b[i] + " ");

        }
    }
    
}
