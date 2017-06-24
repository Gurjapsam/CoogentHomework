
public class Insertion {

	public static int[] insertion (int []arr) {
		
		for (int i=1; i < arr.length; i++){
			int value = arr[i]; 
			int j = i-1;
			
			while (j >=0 && value < arr[j]){ 
				
				arr[j + 1] = arr[j];
				j--; 
			}
			
			arr[j + 1] = value;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,7,3,2,57,98,74,61,1,73,23,45,32,77,97};
		
		insertion(arr); 
		
		for(int c : arr )
			System.out.print(c + " ");
	}

}
