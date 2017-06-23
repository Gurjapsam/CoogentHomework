
public class SmallestAndBiggest {

	public static void main(String[] args) {
	
            int numbers[] = new int[]{99,31,23,35,67,57,68,98,87,77,67}; 
            int Min = numbers[0]; 
            int Max = numbers[0]; 
            
            for(int i=0; i< numbers.length; i++) 
            { 
                    if(numbers[i] > Max) 
                            Max = numbers[i]; 
                    else if (numbers[i] < Min) 
                            Min = numbers[i]; 
                    
            } 
            
            System.out.println("Largest Number is : " + Max); 
            System.out.println("Smallest Number is : " + Min); 
    } 
} 
	