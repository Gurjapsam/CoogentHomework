import java.util.Scanner; 

public class PrimeNumber {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x, primeNum, count=0; 
		
		System.out.println("Enter range to check prime number");
		
		x = input.nextInt(); 
		
		for (int i=1; i<=x; i++)
		{
			count =0; 
			for (int j=1; j<=i;j++){ 
				if(i% j==0)
					count++; 
					
			}
		
			if (count< 3)
					System.out.println(i + " ");
			
		}

	}

}
