import java.util.Scanner;  
class scanner
{  
 public static void main(String args[])
{  
   Scanner sc=new Scanner(System.in);  
     
   System.out.print("Enter your Rollno:");  
   int Rollno=sc.nextInt();  
   System.out.print("Enter your Name:");  
   String Name=sc.next();  
   System.out.print("Enter your Fees:");  
   double Fees=sc.nextDouble();  
   System.out.println("Rollno:"+Rollno); 
   System.out.println("Name:"+Name);
   System.out.println("Fee:"+Fees); 
   sc.close();  
 }  
}
