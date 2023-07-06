package Esercizio2;

public class SimpleThreads extends Thread{
	
	private int[] myArray;
	private int inizio;
	private int fine;
	private int somma;
	
	public SimpleThreads (int[] _myArray, int _inizio, int _fine) {
		
	
		this.myArray = _myArray;
		this.inizio = _inizio;
		this.fine = _fine;
		
	}
	
	@Override
	
	public void run() {
		somma =  0;
		for (int i = inizio; i < fine; i++) {
		somma += myArray[i];	
		}
		}

	public int getSomma() {
		return somma;
	}
	}