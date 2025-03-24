package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StsticList {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Benn", "Den", "Ann");
		//ArrayList<Integer> li = (ArrayList<Integer>) Arrays.asList(4,7,1,9,5); 
		//Not allowed
		List<Integer> li = Arrays.asList(4,7,1,9,5);
		Collections.sort(ls);
		System.out.println("List of strings: "+ls);
		System.out.println("List of Inteers: "+li);

	}

}
