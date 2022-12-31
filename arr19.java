//SUM OF ALL ARRAY ELEMENT
public class arr19 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Array element");
        int [] a=new int[]{3,5,6,8,4,3};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of ARRAY = " +sum);
        

        

    }
    
}
