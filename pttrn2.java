//pattern printing
public class pttrn2 {
        public static void main(String[] args) {
            for (int i = 0; i <= 5; i++) {
                for (int s = (5 - i); s >= 0; s--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
    
            }
        }    
    }
