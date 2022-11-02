package threads;

public class ErstesBeispiel extends Thread{

	private int id;
	
	public ErstesBeispiel(int id) {
		this.id=id;
		
		System.out.println("Thread "+id+" ist da.");
	}
	public static void main(String[] args) {
		
		Thread eins = new ErstesBeispiel(1);
		eins.start();
		System.out.println("Thread 1 wird gestartet.");
		
		Thread zwei = new ErstesBeispiel(2);
		zwei.start();
		System.out.println("Thread 2 wird gestartet.");
	}
	
	@Override
	public void run() {
		System.out.println("Thread "+id+" meldet sich.");
		System.out.println("Thread "+id+" ist "+getState());
	
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread "+id+" ist wieder wach.");
	}
}
