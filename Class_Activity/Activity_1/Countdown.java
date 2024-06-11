package Class_Activity.Activity_1;

public class Countdown {

    public static void main(String[] args) {
    
        System.out.println("Countdown to Launch: ");
        
    	for (int i = 5; i >= 0; i--) {
    		System.out.print(i + " ");
    	}
        System.out.println("Blast Off!");
    	System.out.println(" ");

    	System.out.println("Count all even to 20");
        for(int i = 0; i <= 20; i++) {
        	
        	if(i%2==0) {
            System.out.print(i + " "); 
        	}
        }
    }
}
