package thread;

public class MyThread extends Thread {
	
	int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			System.out.println("Child Thread starts calculation.");
			for(int i = 1; i <=100; i++)
			{
				total = total + i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}

}
