package threads;

public class Synchronized {

	private static int c = 0;
	
	public synchronized void increment() {
		System.out.println("increment "+c);
		c = c + 1;
		System.out.println("c ist jetzt "+c);
	}
	
	public synchronized void decrement() {
		System.out.println("decrement "+c);
		c = c - 1;
		System.out.println("c ist jetzt "+c);
	}
	
	public static void main(String[] args) {
		Synchronized count = new Synchronized();
		
		Thread eins = new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					count.increment();
				}
			}
		};
		eins.start();
		
		Thread zwei = new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					count.decrement();
				}
			}
		};
		zwei.start();
	}
	public int value() {
		synchronized (this)
		{
		return c;	
		}
	}
}
