class A extends Thread
{
	public void run()
	{
	 for(int i=1; i<=5; i++)
	 {
	  System.out.println("\t From Thread A : i = "+i);
	 }
	 System.out.println("Exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
	 for(int j=1; j<=5; j++)
	 {
	  System.out.println("\t From Thread B : j = "+j);
	 }
	 System.out.println("Exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
	 for(int k=1; k<=5; k++)
	 {
	  System.out.println("\t From Thread C : k = "+k);
	 }
	 System.out.println("Exit from C");
	}
}
class Threadtest
{
	public static void main(String args[])
	{
	 new A().start();
	 new B().start();
	 new C().start();
	}
}
/*
OUTPUT:

java Threadtest
         From Thread A : i = 1
         From Thread A : i = 2
         From Thread A : i = 3
         From Thread A : i = 4
         From Thread A : i = 5
Exit from A
         From Thread B : j = 1
         From Thread B : j = 2
         From Thread B : j = 3
         From Thread B : j = 4
         From Thread B : j = 5
Exit from B
         From Thread C : k = 1
         From Thread C : k = 2
         From Thread C : k = 3
         From Thread C : k = 4
         From Thread C : k = 5
Exit from C

java Threadtest
         From Thread A : i = 1
         From Thread A : i = 2
         From Thread A : i = 3
         From Thread A : i = 4
         From Thread A : i = 5
         From Thread B : j = 1
         From Thread B : j = 2
         From Thread B : j = 3
         From Thread B : j = 4
         From Thread B : j = 5
Exit from B
         From Thread C : k = 1
         From Thread C : k = 2
         From Thread C : k = 3
         From Thread C : k = 4
         From Thread C : k = 5
Exit from C
Exit from A
*/



