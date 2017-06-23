
public class BubbleSort {

	public static void bubble () {
		
	 int arr1[] = {1,10,27,87,69,21,15,5,2}; 
	 int temp = 0; 
	 int n = arr1.length;
			 
			 
	 for (int i=0; i<n ;i++) {
		 
		 for (int j=1; j<(n-i) ;j++){
			 
			 if (arr1[j-1] > arr1[j]){
				 
					temp=arr1[j-1];
				 	arr1[j-1]=arr1[j]; 
				 	arr1[j]= temp;
			 }
		 }
	 }	 
	 for(int i=0; i<arr1.length; i++){
		 System.out.println(arr1[i]);
	 }	 
	}
	
	public static void Merge () { // Merge Sort starts from here. 
		
		int arr[] = {90,65,74,14,32,1,55,41,80};
		int arr2[] = {90,65,1,74,14,32,55,41,80};
		int size1, size2; 
		
		if (arr.length%2 !=0){ 
		
			size1 = (arr.length/2) + 1;
			size2 = (arr.length/2);
		}
			else { 
				size1 = arr.length/2;
				size2 = size1; 
		}
		
		int [] temp1 = new int[size1];
		int [] temp2 = new int [size2];
		
		for (int i= 0; i< size1; i++){
			temp1 [i] = arr[i];
		}
		
		
		if (arr.length %2 != 0){
			for (int j= 0; j< size2; j++) {
				temp2 [j] = arr[size2 + j + 1 ];
			}	
		}	
		else {
			for (int j= 0; j< size2; j++) {
				temp2 [j] = arr[size2 + j ]; 
			}
		}	
		
		//sorting temp1 array 
		int swap = 0;
		int index = 0;
		
		while (index < size1){
			
			int min= index;
			
			for (int i=index; i < size1; i++){
				if(temp1[min] > temp1[i]){ 
					min = i;
				}
			}
				swap = temp1[min]; 
				temp1[min] = temp1[index];
				temp1[index]= swap;
				
				index++;
		}// end of sorting temp1 
		
		//sorting temp2 array
			int swap1 = 0;
			index = 0;
			
			while (index < size2){
				
				int min= index;
				
				for (int i = index; i < size2; i++){
					if(temp2[min] > temp2[i]){ 
						min = i;
						
						}
					}
				
					swap1 = temp2[min]; 
					temp2[min] = temp2[index];
					temp2[index]= swap1;
					
					index++;
			}// end of sorting temp2 
			
			int i=0, j=0, k=0;
			
			while (i < size1 && j < size2 ) {
				
				if (temp1[i] <= temp2[j]){
					arr[k] = temp1[i];
						i++;
				}
				else {
					arr [k] = temp2[j];
						j++;
				}
				k++;
			}
			while (i < size1) {
				arr[k] = temp1[i];
				i++;
				k++;
						
			}
			while (j < size2) {
				arr[k] = temp2[j];
				j++;
				k++;
			}
			System.out.println("Merge sort ");
			
	
		for(int c : arr )
			 System.out.print(c + " ");
		System.out.println();
		for (int c : temp1)
			System.out.print(c + " ");
		System.out.println();
		for (int c : temp2)
			System.out.print(c + " ");
		
		System.out.println();
		// end of merge method 
	}
	
	public static void main(String[] args) { 
		System.out.println();
		bubble(); 
		System.out.println();
		Merge(); 
	}
	}



