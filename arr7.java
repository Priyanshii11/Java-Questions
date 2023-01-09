//find smallest number
public class arr7 {
    public static void main(String[] args) {
        int[] a=new int[]{25,6,8,0,44};
      int min = a[0];
      for(int i=0 ; i<a.length ; i++)
      {
        if(a[i]<min)
        min=a[i];
      }
      System.out.println("smallest element is:" + min);
    }
    
}

