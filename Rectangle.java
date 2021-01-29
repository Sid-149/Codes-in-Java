class Rectangle
{
 int length, width;
 void getdata(int x, int y)
{
 length = x;
 width = y;
}
 int rectarea()
{
 int area = length*width;
 return(area);
}
}
 class Rectarea
{
 public static void main(String args[])
{
 int area1;
 int area2;
 int area3;
 Rectangle r1=new Rectangle();
 Rectangle r2=new Rectangle();
 Rectangle r3=new Rectangle();
 r1.length=100;
 r1.width=10;
 area1=r1.length*r1.width;
 r2.getdata(50,60);
 r3.getdata(10,20);
 area2=r2.rectarea();
 area3=r3.length*r3.width;
 System.out.println(area1);
 System.out.println(area2);
 System.out.println(area3);
}
}
