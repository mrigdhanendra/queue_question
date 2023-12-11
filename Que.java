package PAck2;

public class Que {
	
	static private int queu[];
	static private int front,rear,capacity;
	
	Que(int c){
		front = 0 ;
		rear = 0 ;
		capacity = c;
		queu = new int[capacity];
	}
	
	static void addEQ(int data) {
		if(capacity == rear) {
			System.out.println("My queue is full");
			return;
		}else {
			queu[rear]=data;
			rear++;
		}
		return;
	}
	
	static void printme() {
		int i ;
		if(front == rear) {
			System.out.println("My queue is Epmty");
			return;
		}
		for(i=front;i<rear;i++) {
			System.out.print(queu[i] + "   ");
		}
		System.out.println();
	}
	
	
	static void removeEQ() {
		if(front == rear) {
			System.out.println("My queue is Epmty");
			return;
		}
		else {
			for(int i = 0 ; i<rear-1;i++) {
				queu[i] = queu[i+1];
			}
			if(rear <= capacity) {
				queu[--rear] = 0;
				
			}
		}
		return;
	}
	
	static void fronQ() {
		if(front == rear) {
			System.out.println("My queue is Epmty");
			return;
		}
		System.out.println("My front is : ");
		System.out.println(queu[front]);
	}
}
