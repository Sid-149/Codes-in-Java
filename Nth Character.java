public class nthcharacter 
{
   public static void main(String args[])
 {
   
      String str = "Hi welcome to tutorialspoint";
      int n = 5;
      int initial = str.length()-5;
      for(int i=initial; i<str.length(); i++) 
{
         System.out.println(str.charAt(i));
      }
   }
}

/*
Output:
javac nthcharacter.java

java nthcharacter

p
o
i
n
t
