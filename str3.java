//wap to fill in a letter template which look like "dear <name>, thanks a lot"//
import java.util.Scanner;
public class str3 {
    public static void main(String[] args) {
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String a=sc.next();
        //System.out.println("dear " +a+ ", thanks a lot");*/
        String sen="dear name ,thanks alot";
        System.out.println(sen.replaceAll("name" , "tina"));

    }
    
}
