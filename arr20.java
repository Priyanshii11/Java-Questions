//PRINT EVEN AND ODD IN ARRAY
public class arr20 
{
    public static void main(String[] args) 
    {
        System.out.println("Element in Array");
        int [] a ={23,44,7,22,4};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Even number");
        for(int i=0;i<a.length;i++)
        { 
            if(a[i]%2==0)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd number");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
    }
}

        