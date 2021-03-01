abstract class AbstractClass1
 {
   abstract void calculate(double x);
 }
class Square extends AbstractClass1
 {
  void calculate(double x)
  {
    System.out.println("Square is "+x*x);
  }
 }
class Sqrt extends AbstractClass1
 {
  void calculate(double x)
  {
    System.out.println("Square root is "+Math.sqrt(x));
  }
 }
class Cubic extends AbstractClass1
 {
  void calculate(double x)
  {
    System.out.println("Cube is "+x*x*x);
  }
 }
class MyClass
{
  public static void main(String arg[])
    {
      Square s=new Square();
      Sqrt sq=new Sqrt();
      Cubic c=new Cubic();
      s.calculate(5);
      sq.calculate(4);
      c.calculate(2);
    }
}


/*
OUTPUT:

javac MyClass.java
java MyClass
Square is 25.0
Square root is 2.0
Cube is 8.0
*/
