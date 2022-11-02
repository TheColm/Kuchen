package b.lambda;

public class Beispiel2 {
	
	public Beispiel2() {
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Ich werde ausgeführt!");}
		});
	
		t.start();
	}
	
	public static void main(String[] args) {
		new Beispiel2();
		
	}

}
