package ComparableAndComparator;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionInterface {
	public static String getHelloWorld() {
        return "hello world";
    }
	public static boolean isEven(Integer num) {
        return num % 2 == 0;
    }
	
	public static void main(String[] args) {
//		Function<String,Integer> f = (a)->{
//			return a.length();
//		};
		Function<String,Integer> f = String::length;
		System.out.println(f.apply("Samadhan Maske")); //14
		
//		Function<Integer, Double> sq = (x)->(double)x*x;
		Function<Integer, Double> sq = Math::sqrt;
		System.out.println("Sqareroot of number: "+sq.apply(25)); //5
		
		//Supplier
		//Supplier<String> s=()->"hello world";
		Supplier<String> s = BuiltInFunctionInterface::getHelloWorld;;
		System.out.println(s.get()); //hello world
		
		//Consumer 
//		Consumer<String> c = (carg)->{System.out.println(carg);};
		Consumer<String> c = System.out::println;
		c.accept("Samadhan"); //Samadhan
		//Predicate
		//Predicate<Integer> isEven = (num)->num%2==0;
		Predicate<Integer> isEven = BuiltInFunctionInterface::isEven;
		System.out.println(isEven.test(8)); //true
		System.out.println(isEven.test(11)); //false
	}

}
