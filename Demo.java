package PAck2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que q = new Que(4);
		
		q.addEQ(10);
		q.addEQ(20);
		q.addEQ(30);
		q.addEQ(40);
		q.addEQ(50);
		q.printme();
		System.out.println("================");
		q.removeEQ();
		q.printme();
		
		
		q.addEQ(10);
		q.printme();
		
		q.removeEQ();
		q.printme();
		
		System.out.println("========the front is ======");
		q.fronQ();
	}

}
