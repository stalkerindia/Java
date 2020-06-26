
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortingExample {
	
	
	public static void main(String[] args) {
		
	// Sorting in Ascending  Order
		
	List<Integer> ls = Arrays.asList(5,58,36,9,25,74); 
	Collections.sort(ls); 
	System.out.println(ls);
	
	//Sorting in Descending Order
	
	Collections.sort(ls, Collections.reverseOrder());
	System.out.println(ls);
	
	
	
	
	String[] values = {"rahul","Sourav", "Mohan", "Arab"};
	
	// Sorting in Ascending  Order
	
	Arrays.sort(values);
	System.out.println(Arrays.toString(values));
	
	//Sorting in Descending Order
	
	Arrays.sort(values, Collections.reverseOrder());
	System.out.println(Arrays.toString(values));
	
	
	

}
}