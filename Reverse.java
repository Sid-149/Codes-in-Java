class Reverse
{
public static void main(String args[])
{
int n=123,d,r=0;
while(n!=0)
{d=n%10;
r=r*10+d;
n=n/10;
}
System.out.println("Reverse of n:"+r);
}
}
/*
OUTPUT:
Reverse.java

java Reverse
Reverse of n:321
*/