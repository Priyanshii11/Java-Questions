//find element in odd position
public class arr15 {
    public static void main(String[] args) {
        int[] a=new int[]{25,6,8,0,44};
        System.out.println("original array");
        for(int i=0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        System.out.println("element at odd position");
        for(int i =0;i<a.length;i=i+2)
        {
            System.out.print(a[i]+ "  ");
        }

    }
}
