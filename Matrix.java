import java.util.Scanner;

public class Matrix 
{

   public static void main(String[] args)
 {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter number of rows: ");
       int rows = s.nextInt();
       System.out.print("Enter number of columns: ");
       int columns = s.nextInt();
       int[][] a = new int[n][n];
       int[][] b = new int[n][n];
       System.out.println("Enter the first matrix:");
       for (int i = 0; i < n; i++) 
{
           for (int j = 0; j < n; j++) 
{
               a[i][j] = s.nextInt();
           }
       }
       System.out.println("Enter the second matrix:");
       for (int i = 0; i < n; i++)
 {
           for (int j = 0; j < n; j++)
 {
               b[i][j] = s.nextInt();
           }
       }
       int[][] c = new int[n][n];
       for (int i = 0; i < n; i++)
 {
           for (int j = 0; j < n; j++) 
{
               c[i][j] = a[i][j] + b[i][j];
           }
       }
       System.out.println("The sum of the two matrices:");
       for (int i = 0; i < n; i++)
 {
           for (int j = 0; j < n; j++)
 {
               System.out.print(c[i][j] + " ");
           }
           System.out.println(" ");
}
       int[][] d = new int[n][n];
       for (int i = 0; i < n; i++)
 {
           for (int j = 0; j < n; j++) 
{
               d[i][j] = a[i][j] - b[i][j];
           }
       }
 
       System.out.println("The subtraction of the two matrices:");
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.print(d[i][j] + " ");
           }
  
           System.out.println(" ");
       }
int[][] e = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    e[i][j] = e[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The product of the two matrices:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
   }
}


OUTPUT:
/*
javac Matrix.java

java Matrix
Enter number of rows:2
Enter number of columns:2
Enter the first matrix:
1
1
1
1
Enter the second matrix:
1
1
1
1
The sum of the two matrices:
2 2
2 2
The subtraction of the two matrices:
0 0
0 0
The product of the two matrices:
2 2
2 2
*/