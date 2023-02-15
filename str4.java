//wap to detect double n triple spaces
public class str4 { 
    public static void main(String[] args) {
        String sen="hello i m priyanshii i am a bca student";
        sen=sen.replaceAll(" ", "  ");
        System.out.println(sen);
        sen=sen.replaceAll(" ", "   ");
        System.out.println(sen);
    }
    
}
