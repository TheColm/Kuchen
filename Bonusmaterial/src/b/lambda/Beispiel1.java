package b.lambda;

public class Beispiel1 {

	public Beispiel1() {
		Thread t = new Thread(new Job());
	
		t.start();
	}
	
	public static void main(String[] args) {
		new Beispiel1();
		
	}

	class Job implements Runnable{
		public void run() {
			System.out.println("Ich werde ausgeführt!");
		}
	}
}
