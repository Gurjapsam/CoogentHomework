
public class SwapValues {

	public static void main(String[] args) {
		
        int X = 50; 
        int Y = 40; 
        	System.out.println("Before swap:"); 
        	System.out.println("X value: "+X); 
        	System.out.println("Y value: "+Y); 
        X = X+Y; 
        Y=X-Y; 
        X=X-Y; 
        	System.out.println("After swap:"); 
        	System.out.println("X value: "+X); 
        	System.out.println("Y value: "+Y); 
        
	}

}
