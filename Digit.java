class Digit
{
public static void main(String args[])
{
int n=123,d;
while(n!=0)
{d=n%10;
n=n/10;
System.out.println(d);
}
}
}
/*
OUTPUT:
javac Digit.java
java Digit
3
2
1
*/