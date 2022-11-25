//wap to find out whether a given integer is present in array or not
public class arr2 {
    public static void main(String[] args) 
    {   int i,a1,flag=0;
        int [] a={ 1,4,5,7,9,0 };
        a1=5;
        for(i=0;i<=a.length;i++){
        if(a[i]==a1)
        {
            flag=1;
            break;
        }
        else 
        {
            flag=0;
            
        }
    }
        if (flag==1){
        System.out.println("element found at "+i);
        }
        else
        {
            System.out.println("not found");
        } 
    }
    
}
