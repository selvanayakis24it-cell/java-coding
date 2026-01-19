 class Main{
       int area(int a){
System.out.println("Area of circle "+3.14*a*a);
      return a;     
       }
       int area(int b,int c){
           int d=b*c;
           System.out.println("Area of Rectangle "+d);
           return d;
       }
       int area(int len,int brd,int hig){
           int area=len*brd*hig;
           System.out.println("Area of Triangle "+area);
           return area;
       }
public static void main(String []ss){
Main obj=new Main();
obj.area(3);
obj.area(4,5);
obj.area(7,8,9);
}
 }