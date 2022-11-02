package threads;

public class RaceCondition implements Runnable{

	public static String text = "Ende";
	private String name;
	
	public static void main(String[] args) {
		
		RaceCondition eins = new RaceCondition();
		eins.name = "John";
		RaceCondition zwei = new RaceCondition();
		zwei.name = "George";
		RaceCondition drei = new RaceCondition();
		drei.name = "Ringo";
		RaceCondition vier = new RaceCondition();
		vier.name = "Paul";
		new Thread(eins).start();
		new Thread(zwei).start();
		new Thread(drei).start();
		new Thread(vier).start();
		
		System.out.println(RaceCondition.text);
	}



	@Override
	public void run() {
		text = name;
		
	}

}
