package Esercizio1;


public class SimpleThread extends Thread{

	
	private String simbolo;
	
	public SimpleThread (String _simbolo) {
		
		this.simbolo = _simbolo;
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				
				System.out.println(simbolo);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}

}
	

