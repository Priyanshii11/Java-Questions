//subtract of two matrices
import java.util.Scanner;

public class arr21 {
    public static void main(String[] args) {
        int row=2, col=3,i,j;
        Scanner in = new Scanner(System.in);
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];
        System.out.println("Enter the elements of matric1");//input  m1
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            mat1[i][j] = in.nextInt();
        }
        System.out.println("displaying matric 1 ");//display m1
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            System.out.print(mat1[i][j]+"\t");
            System.out.println();
        }
        System.out.println("Enter the elements of matric2");//input m2
        for ( i= 0 ; i < row ; i++ )
        {
            for ( j= 0 ; j < col ;j++ )
            mat2[i][j] = in.nextInt();
        }
        System.out.println("displaying matric 1 ");//display m2
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            System.out.print(mat1[i][j]+"\t");
            System.out.println();
        }
        for ( i= 0 ; i < row ; i++ )
        {
            for ( j= 0 ; j < col ;j++ )
            res[i][j] = mat1[i][j] - mat2[i][j] ;
        } 
        System.out.println("Subtract of matrices:-");
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
            System.out.print(res[i][j]+"\t");
            System.out.println();
        }
    }
    
}
