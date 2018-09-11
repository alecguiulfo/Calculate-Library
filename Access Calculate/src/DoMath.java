// This class is client code that uses the Calculate Library to perform various 
// mathematical tasks.
// @author Alec Guiulfo
// @ version September 6, 2019
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

	}

}
