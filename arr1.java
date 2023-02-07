//sum of all array element
public class arr1
{
    public static void main(String[] args)
    {
        float sum=0;
        int i;
        float [] a=new float[5];
        a[0] = 70.7f;
        a[1] = 98.5f ;
        a[2] = 98.57f ;
        a[3] = 98.45f;
        a[4] = 68.54f;
        for(i=0;i<5;i++)
        {
            sum=sum+a[i];
    
        }
        System.out.println("sum of element"+sum);
  
    }
}
