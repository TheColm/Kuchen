package threads;

public class Konto {
	private static int kontostand = 100;
	boolean inBearbeitung = false;

	public int geldAbheben(int betrag) {
		if(!inBearbeitung) {
			inBearbeitung = true;
			if(betrag <= kontostand) {
				kontostand = kontostand-betrag;
				System.out.println("Es wurden "+betrag+" abgehoben. Neuer Kontostand: "+kontostand);
			}
			else {
				System.out.println("Der Kontostand von "+kontostand+" ist zu wenig.");
				}
			inBearbeitung = false;
			}
		else{System.out.println("Ein Auftrag ist bereits in Bearbeitung");}
		return kontostand;
	}
	
	public static void main(String[] args) {
		
		Konto konto = new Konto();
		
		Thread monika = new Thread(){
			@Override
			public void run() {
				 {
				System.out.println("Monika versucht Geld abzuheben.");
				konto.geldAbheben(100);
			}}
		};
		Thread rainer = new Thread() {
		@Override
		public void run() {
			System.out.println("Rainer versucht Geld abzuheben.");
			konto.geldAbheben(50);
			
		}
	};
	
		rainer.start();
		monika.start();
	}
}