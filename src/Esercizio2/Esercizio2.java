package Esercizio2;

import java.util.Random;

public class Esercizio2 {
	
	public static void main(String[] args) {
		
		/*RandomArray myArray = new RandomArray(3000);
		myArray.randomNumber(3000);
		System.out.println(myArray);*/
		
		int[] myArray = new int[3000];
		int somma;
		
		Random random = new Random();
		
		SimpleThreads thread1 = new SimpleThreads(myArray, 0 , 999);
		SimpleThreads thread2 = new SimpleThreads(myArray, 1000 , 1999);
		SimpleThreads thread3 = new SimpleThreads(myArray, 2000 , 2999);
		
		for (int i=0; i <3000; i++) {
			myArray[i] = random.nextInt(101);
		}
		
		thread1.start();
		thread2.start();	
		thread3.start();
		
		somma = thread1.getSomma() + thread2.getSomma() + thread3.getSomma();
		
		System.out.println(somma);
	}
	
	

}

