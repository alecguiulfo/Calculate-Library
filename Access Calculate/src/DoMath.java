// This class is client code that uses the Calculate Library to perform various 
// mathematical tasks.
// @author Alec Guiulfo
// @ version September 6, 2018
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(55));
		System.out.println(Calculate.cube(55));
		System.out.println(Calculate.average(1.7, 1.5));
		System.out.println(Calculate.average(1.7, 1.5, 1.6));
		System.out.println(Calculate.toDegrees(10));
		System.out.println(Calculate.toRadians(100));
		System.out.println(Calculate.discriminant(3, 1, 2));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(21, 7));
		System.out.println(Calculate.absValue(-2.0));
		System.out.println(Calculate.max(2.0, 5.0));
		System.out.println(Calculate.max(2.0, 5.0, 7.0));
		System.out.println(Calculate.min(2, 5));
		System.out.println(Calculate.round2(2.5767));
		System.out.println(Calculate.exponent(3.0, 3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(26));
		System.out.println(Calculate.gcf(6, 27));
		System.out.println(Calculate.sqrt(64.0));
		System.out.println(Calculate.quadForm(1.0, 2.0, 3.0));
		System.out.println(Quadratic.quadrDescriber(2.0, 4.0, 6.0));


	}

}
