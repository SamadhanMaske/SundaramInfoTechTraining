package ComparableAndComparator;

interface I2{
	int maxAmongTwo(int a, int b);
}
public class LargeOfTwoLambda {

	public static void main(String[] args) {
		I2 ob = (a,b)->{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println("Max number: "+ob.maxAmongTwo(506, 302));

	}

}
