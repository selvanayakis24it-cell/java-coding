class Stack {
    int max;
    int []array;
    int top;
    Stack(int size){
        this.max=size;
        this.array=new int [max];
        this.top=-1;
       
    }
    void push(int value){
        if(isfull()){
            System.out.print("Stack is full");
        }
        else{
            array[++top]=value;
            System.out.println("Pushed elements "+value);
        }
    }
    public boolean isfull(){
        return (top==max-1);
    }
    void display(){
        System.out.print("Elements of the stack: ");
        for(int i=top;i>=0;i--){
       
        System.out.print(array[i]+" ");
    }
        System.out.println();
    }
    void pop(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            System.out.println("Poped element is : "+top);
        }
    }
    public boolean isempty(){
        return (top==-1);
    }
}
public class Main
{
public static void main(String[] args) {
Stack mystack=new Stack(5);
mystack.push(50);
mystack.push(40);
mystack.push(30);
mystack.push(20);
mystack.push(10);
mystack.display();
mystack.pop();

}
}
