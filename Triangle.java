class Area{
int radius=10;
int len=5;
int br=5;
int h=5;
void area(){
System.out.println(3.14*radius*radius);
}
}
class Rectangle extends Area{
void area(){
super.area();
System.out.println(len*br*h);
}}
class Triangle extends Area{
void area(){
super.area();
System.out.println(0.5*br*h);
}
public static void main(String [] args)
{
Triangle ob=new Triangle();
ob.area();
Rectangle ob1=new Rectangle();
ob1.area();
}
}