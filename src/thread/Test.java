package thread;

public class Test {
	
	public static void main(String[] args) throws InterruptedException{
		
		MyThread t = new MyThread();
		t.start();
		
		synchronized (t) {
			
			System.out.println("Main thread trying to call wait() method");
			t.wait();
			System.out.println("Main Thread got notification");
			System.out.println("Result :" + t.total);
		}
	}

}
