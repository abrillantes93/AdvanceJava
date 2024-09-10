/*
Anthony Brillantes
COP 2805C-91339
D7 Exploring Threads Programming
Date: 06/30/2024
*/
public class TwoThreads {
    public static void main(String []args){ //run threads
		CharLoop letters = new CharLoop();
		IntLoop numbers = new IntLoop();	
		letters.start();
		numbers.start();
	
	}
}
// letter thread
class CharLoop extends Thread {
	public void run(){ 
		for (char ch = 'A'; ch <= 'Z'; ch++){
			System.out.print(ch + ",");
		}
	}
}

// int thread
class IntLoop extends Thread {
	public void run(){
		for (int i = 1; i <= 26; i++){
			System.out.print(i + ",");
		}
	}
}
