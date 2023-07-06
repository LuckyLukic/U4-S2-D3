package Esercizio1;

public class Esercizio1 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new SimpleThread("$");
		Thread thread2 = new SimpleThread("£");
		
		thread1.start();
		thread2.start();
	}

}
