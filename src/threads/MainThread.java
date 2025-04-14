package threads;

public class MainThread {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setName("Main Thread");
		System.out.println("Name of thread is" +t1);
	}
	

}
