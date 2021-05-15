package Thread;

public class SimpleThread extends Thread{

	public SimpleThread(String str) {  
		super(str);  
	}
	
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.format("%d %s%n", i, getName());
		}
		try {
			sleep((long)(Math.random()*1000));
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.format("DONE! %s%n", getName());
	}
	public static void main(String[] args) {
		new SimpleThread("Katy").start();
		new SimpleThread("Britney").start();
		new SimpleThread("Taylor").start();
	}
}
