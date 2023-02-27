//find the largest element in array

public class arr6 {
    public static void main(String[] args) { 
      int[] a=new int[]{25,6,8,0,44};
      int max = a[0];
      for(int i=0 ; i<a.length ; i++)
      {
        if(a[i]>max)
        max=a[i];
      }
      System.out.println("largest element is:" + max);
    }
}
