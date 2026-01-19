
class Queue{
    int max;
    int [] array;
    int front,rear;
    Queue(int size){
        this.max=size;
        this.array=new int[max];
        this.front=-1;
        this.rear=-1;
    }
    public boolean isfull(){
        return (rear==max-1);
    }
    public boolean isempty(){
        return (front>rear);
    }
    void enqueue(int value){
        if(isfull()){
            System.out.println("Queue is full");
        }
        else{
            array[++rear]=value;
            System.out.println("Enqueue value is : "+value);
        }
    }
    void dequeue(int value){
    if(isfull()){
        System.out.println("Queue is full");
    }
    else{
        if(front == -1) front = 0; 
        array[++rear] = value;
        System.out.println("Enqueue value is : " + value);
    }
}
void display(){
    System.out.println("The Elements of the queue are : ");
    for(int i=front;i<=rear;i++){
        System.out.println(array[i]);
    }
}
   
}
public class Main
{
	public static void main(String [] args) {
		Queue myq=new Queue(10);
		myq.enqueue(2);
		myq.enqueue(5);
		myq.enqueue(7);
		//myq.enqueue(8);
		//myq.dequeue(5);
	myq.display();

	}
}