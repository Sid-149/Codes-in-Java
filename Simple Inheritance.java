class A
{
int i,j;
void showij()
{
System.out.println("i&j:"+i+"&"+j);
}
}
class B extends A
{
int k;
void showk()
{
System.out.println("k:"+k);
}
void sum()
{
System.out.println("i+j+k="+(i+j+k));
}
}
class simpleinheritance
{
public static void main(String args[])
{
A a=new A();
B b=new B();
a.i=10;
a.j=20;
System.out.println("Content of superclass object");
a.showij();
b.i=7;
b.j=8;
b.k=9;
System.out.println("Content of subclass object");
b.showij();
b.showk();
System.out.println("Sum of i,j,k in subclass object:");
b.sum();
}
}
/*
OUTPUT:
javac simpleinheritance.java

java simpleinheritance
Content of superclass object
i&j:10&20
Content of subclass object
i&j:7&8
k:9
Sum of i,j,k in subclass object:
i+j+k=24
*/
