package com.March13;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferanceDemo {

	public static void main(String[] args) {
		Function<String,Integer> f = (a)->{
			return a.length();
		};
		System.out.println(f.apply("Samadhan Maske"));
		
		Function<Integer, Double> sq = (x)->(double)x*x;
		System.out.println("Sqare of number: "+sq.apply(5));
		
		System.out.println("\nUsing method referace: ");
		Function<Integer, Double> sqrt = Math::sqrt;
		System.out.println("Sqareroot: "+sqrt.apply(9));
		
		//Supplier
//		Supplier<String> s=()->"hello wold";
//		System.out.println(s.get());
//		
//		//Consumer 
//		Consumer<String> c = (carg)->{System.out.println(carg);};
//		c.accept("Samadhan");
//		//Predicate
//		Predicate<Integer> isEven = (num)->num%2==0;
//		System.out.println(isEven.test(8));
//		System.out.println(isEven.test(11));
	}

}