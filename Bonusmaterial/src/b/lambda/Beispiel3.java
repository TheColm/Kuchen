package b.lambda;
public class Beispiel3{public Beispiel3(){Thread t=new Thread(()->System.out.println("Ich werde ausgeführt!"));t.start();}public static void main(String[] args){new Beispiel3();}}