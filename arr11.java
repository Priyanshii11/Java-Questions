//ascending an arrray

public class arr11 
{
        public static void main(String[] args) 
        {
            int[] a=new int[]{25,6,8,0,44};
            int temp=0;
            System.out.println("original array");
            for(int i=0; i<a.length;i++)
            {
                System.out.print(a[i] + " ");
            }
            for(int i=0; i<a.length;i++)
            {
                for(int j=i+1; j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    }
                }
            }
            System.out.println();
            System.out.println("ascending order array");
            for(int i=0; i<a.length;i++)
            {
                System.out.print(a[i]+ " ");
            }
        }
}

    

