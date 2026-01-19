import java.util.*;
class Biggest
{
   static int a,b;
  public static void main(String a[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two int:");
    Biggest.a=s.nextInt();
    Biggest.b=s.nextInt();
    if(Biggest.a>Biggest.b)
    {
        System.out.println("The biggest num is"+Biggest.a);
  }
   else
   {
       System.out.println("The biggest num is"+Biggest.b);
  }
}
}