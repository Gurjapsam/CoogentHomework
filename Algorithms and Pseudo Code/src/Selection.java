
public class Selection {

	public static void Selection () {
		int arr[] = {5,7,3,2,57,98,74,61,1};
		int min = 0;
		int n= arr.length; 
		int index = 0;
		int temp = 0;
		
		while (index < n){
		min= index;
		
		for (int i=index; i < n; i++){
			if(arr[min] > arr[i]){ 
				min = i;
			}
			}
		temp = arr[min]; 
		arr[min] = arr [index];
		arr[index]= temp;
		index++;

		}
		for(int i=0; i<n; i++){
			 System.out.println(arr[i]);
	
		}
	}
		
	public static void main(String[] args) {
		Selection();
		
	}

}
