import java.util.Calendar;
import java.util.Date;

public class RandomNumberAndLimit {
	static Date date= new Date(); 
	static Calendar calendar = Calendar.getInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float randomNumber = (float)  date.getTime();
		
		int max=377000099, min=0; 
		
		while(randomNumber < min || randomNumber > max){
			if (randomNumber< min)
				randomNumber *= (float) calendar.get(Calendar.SECOND); 
			if (randomNumber > max)
				randomNumber /= calendar.get(Calendar.SECOND); 

		}	
		
		System.out.println(randomNumber);
		
	}
}
