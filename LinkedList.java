
public class LinkedList <T> { 

	private Node<T> head; // Declared head variable here 
	private int size;
	public LinkedList () {  // constructor 
		head = new Node<T> (null); 
		size = 0; 
	}
	public void print (){
		Node<T> current =head;  
		while (current.link != null){
			System.out.print( current.value + " ---> ");
			current =current.link; 
		}
		System.out.println(current.value);
		System.out.println(size);
		
	}
	public void add (T v){
		Node<T> end = new Node<T>(v); // this is the new node being added at the end
		Node<T> current = head; // head value is Null 
		if (current.value == null) {
			current.value = end.value;
			size++;
			return; 
		}
		while (current.link !=null){ // how we iterate through the link list, once it reaches null it will it will get of the while loop and point to null. 
			current = current.link;
		}
		current.link =end;
		size++;
	}
	public void addToFront( T v){ // in this we are adding node in the front. 
									// (int v) mean that the user is adding the value.  
		Node<T> front = new Node<T>(v);
		Node<T> current = head; 
		front.link = current;
				head = front;
		size++; 
	}
	public void add ( T v, int index){ //adding value in the middle of the cue
		Node<T> end = new Node<T>(v);
		Node<T> current = head; 
		int jump; 	

		if (index > size || index < 1){// this means it should be inbetween 1 and total size, and should come in 1-index size. 
			return; 
		}
		else{
			jump=0; 
			while (jump < index -1){
				current = current.link;
				jump++; 
			}
			end.link =current.link;
			current.link = end;
			size++;
		}
	}
	public void removeEnd(){ // removing the end value from the 
		int i =1; 
		Node<T> current =head; 
		while (i < size-1){
			current = current.link;
			i++;
		}
		current.link = null;
				size--;
	}
	public void removeFront(){// removing the node from front
		Node<T> current =head; 
		head = current.link;
		current.link= null;
		size--;
	}
	public void remove(int index){// n'th position is being removed. 
		Node<T> current = head;
		int jump; 	

		if (index > size || index < 1){
			System.out.println(" out of bounds ");
	}
	else {
		jump = 1;
		while (jump < index -1){ 
			current = current.link;
			jump++;
		}
		Node<T> temp = current.link;// this way we will be using temp the one we want it to be removed. 
		current.link = temp.link;
		temp.link =null; 
		size--;
		
//		Node<T> temp = current; // this way we will be making temp the one before to the one we want it to be deleted. 
//		current = current.link;
//		temp.link = current.link;
//		current.link = null;
//		size--;
		}
	} 
	
	public static void main (String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(8);
		list.addToFront(50);
		list.add(15,3);
		list.removeEnd();
		list.removeFront();
		list.remove(3);
		list.print();
	}
		
	
}
class Node <T> {     // initialized the the Node, 
				 // from this on we will start adding more node and do add and remove. 
	Node<T> link = null; 
	T value; 
	public Node (T value) {
	this.value = value;  
	}
}