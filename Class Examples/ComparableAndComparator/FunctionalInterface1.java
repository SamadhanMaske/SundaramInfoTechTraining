package ComparableAndComparator;

interface I1{
	int addition(int a, int b);
}

public class FunctionalInterface1 {
	
	public static void main(String[] args) {
		I1 obj = (a,b)->{
			a++;
			b++;
			return (a+b);
		};
		
		System.out.println("Sum="+obj.addition(5, 5));
	}

}
