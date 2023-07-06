package Esercizio2;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	
	private int[] myArray;
	
	
	public RandomArray ( int _size) {
		
		myArray = new int [_size];
		
	}

	
    public void randomNumber(int _size) {
    	
    	Random random = new Random();
    	
    	for (int i = 0; i < _size; i++) {
    		this.myArray[i] = random.nextInt(200);
    		
    	}
    }


	public int[] getMyArray() {
		return myArray;
	}


	public void setMyArray(int[] myArray) {
		this.myArray = myArray;
	}


	@Override
	public String toString() {
		return "RandomArray [myArray=" + Arrays.toString(myArray) + "]";
	}

 
}


