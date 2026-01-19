class College{
    void get(){
        System.out.println("College");
    }
    College(){
        System.out.println("Constructor");
    }
}
class Student extends College{
    void get(){
        System.out.println("Students");
    }
}
class Girls extends College{
    void get(){
        super.get();
        System.out.println("Girls");
    }
}
public class Inheritance
{
	public static void main(String[] args) {
	Girls ob=new Girls();
	ob.get();
	}
}