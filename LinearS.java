//linear search in array
public class LinearS {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int [] a={1,2,3,4,5};
        int n=3;
        for(int i=0;i<a.length;i++)
        {
            if(n==a[i])
            {
                System.out.print("number found at " +i+ " indice and number to be search is " +a[i] );
            }
        }
        System.out.println();

 }
    
}


