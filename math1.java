import javax.swing.SortOrder;

//Generate the random number
public class math1 {
    public static void main(String[] args) {
        //System.out.println("random number " + Math.random());
        int a=200;
        int b=400;
        System.out.println("random number " +a +" and " +b);
        int c =(int)(Math.random()*(b-a+1)+a);
        System.out.println(c);

    

    }

    
}
