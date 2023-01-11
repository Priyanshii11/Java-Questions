//reverse the array
public class arr14 {
    public static void main(String[] args) {
        int[] a=new int[]{25,6,8,0,44};
        System.out.println("original array");
        for(int i=0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("reverse array");
        for(int i=a.length-1; i>=0;i--)
        {
            System.out.print(a[i] + " ");
        }
       
    }
    
    
}
