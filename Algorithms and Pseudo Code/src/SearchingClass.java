
public class SearchingClass {
	
	static Insertion sort = new Insertion(); 
	
	public static boolean linearSearch (int[]arr, int target){
		
		for (int i = 0; i < arr.length; i++){
			
			if (arr[i] == target){
				
				return true; 
			}
		}
		return false;	
	}// Linear method end 
	
	public static boolean binearySearch (int[] arr, int left, int right, int target){
		arr = sort.insertion(arr); 
		
		if (right >= left){
			int middle = left + ((right-left)/2);
			
			if (arr[middle]==target){
				return true;
			}
			if (arr [middle]>target){
				return binearySearch (arr, left, middle-1, target); 	
			}
			else {
				return binearySearch (arr, middle+1, right, target); 
			}
		}
		return false; 
	}
	
	
	public static void main(String[] args) {
		
		int targetValue = 45; 
		int[] arrSearch = {5,7,3,2,57,98,74,61,1,73,23,45,32,77,97};
		boolean check = false; 
		
		check = linearSearch (arrSearch, targetValue);
		System.out.println ("Linear Search");
		if (check) 
			System.out.println( "The Target value " + targetValue + " has been found in this array" );
		else 
			System.out.println( "The Target value " + targetValue + " has been not found in this array" );
	
		check = binearySearch (arrSearch,0, arrSearch.length, targetValue);
		System.out.println ("Bineary Search");
		if (check) 
			System.out.println( "The Target value " + targetValue + " has been found in this array" );
		else 
			System.out.println( "The Target value " + targetValue + " has been not found in this array" );
	}

}
