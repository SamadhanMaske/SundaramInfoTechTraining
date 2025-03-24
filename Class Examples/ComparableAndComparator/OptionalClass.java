package ComparableAndComparator;

import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        // 1. Creating an empty Optional
        Optional<String> emptyOpt = Optional.empty();

        // 2. Creating an Optional with a non-null value
        Optional<String> nameOpt = Optional.of("John");
//        String name=null;
//        Optional<String> nullName = Optional.of(name);
        // 3. Creating an Optional that may contain null
        Optional<String> nullableOpt = Optional.ofNullable(null); // or Optional.ofNullable("John");

        System.out.println(emptyOpt);      // Output: Optional.empty
//        System.out.println(nullName);    //Null pointer exception
        System.out.println(nameOpt);       // Output: Optional[John]
        System.out.println(nullableOpt);   // Output: Optional.empty
        
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        Optional<Integer> first = nums.stream().findFirst();
        Optional<Integer> any = nums.stream().findAny();

        System.out.println(first.get()); // 1
        System.out.println(any.get());   // 1
    }
}

