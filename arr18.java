//product of two matrices
import java.util.Scanner;

public class arr18 {
    public static void main(String[] args) {
        int  row = 2,col = 2,i,j;
int mat1[][] = new int[row][col];
int mat2[][] = new int[row][col];
int res[][] = new int[row][col];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements of matric of 2x2");//input m1
for ( i= 0 ; i < row ; i++ )
{ 
    for ( j= 0 ; j < col ;j++ )
    mat1[i][j] = sc.nextInt();
    System.out.println();
}
System.out.println("displaying matric 1 ");//display m1
for ( i= 0 ; i < row ; i++ )
{ 
    for ( j= 0 ; j < col ;j++ )
    System.out.print(mat1[i][j]+"\t");
    System.out.println();
}

System.out.println("Enter the elements of matric of 2x2");//input m2
 for ( i= 0 ; i < row ; i++ )
{
    for ( j= 0 ; j < col ;j++ )
    mat2[i][j] = sc.nextInt();
    System.out.println();
}
System.out.println("displaying matric 2");//display m2
for ( i= 0 ; i < row ; i++ )
{ 
    for ( j= 0 ; j < col ;j++ )
    System.out.print(mat2[i][j]+"\t");
    System.out.println();
}
System.out.println();
    for ( i= 0 ; i < row ; i++ )//multiply
    for ( j= 0 ; j < col ;j++ )
    res[i][j] = mat1[i][j] * mat2[i][j] ; 
    System.out.println("product of matrices:");//display
    for ( i= 0 ; i < row ; i++ )
    { 
        for ( j= 0 ; j < col ;j++ )
        System.out.print(res[i][j]+"\t");
        System.out.println();
    }
}
}
