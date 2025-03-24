package ComparableAndComparator;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		String name = null;
		Optional<String> s = Optional.ofNullable(name);
		if(s.isPresent()) {
			System.out.println(name);
		}else {
			System.out.println("Not found");
		}
		System.out.println("I am good");
	}

}
