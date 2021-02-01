class a
{
int i=1,j=2;
a(int x,int y)
{
i=x;
j=y;
}
void display()
{
System.out.println(i);
System.out.println(j);
}
}
class constructor
{
public static void main(String args[])
{
int i,j;
a a1=new a(5,6);
a1.display();
}
}
