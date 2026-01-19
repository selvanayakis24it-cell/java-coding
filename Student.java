class Student{
float a=10.0f;
Student()
{
System.out.println("hi");}
void get(int a){
System.out.println(a);
System.out.println(this.a);
}
public static void main(String []a){
Student obj=new Student();
obj.get(23);
obj.get(34);}}