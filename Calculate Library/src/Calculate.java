// This class contains methods that perform various math operations.
// @author Alec Guiulfo
// @ version September 6, 2018
public class Calculate {
	// returns the square of the input.
	public static int square(int number) {
		//returns the square value of a given integer
		int answer = number*number;
		return answer;
	}
	public static int cube(int number) {
		//returns the cube of a given integer
		int answer = number*number*number;
		return answer;
	}
	public static double average(double number1, double number2) {
		//returns the average of two double values
		double sum = number1 + number2;
		return sum/2;
	}
	public static double average(double number1, double number2, double number3) {
		//returns the average of three double values
		double sum = number1 + number2 + number3;
		return sum/3;
	}
	public static double toDegrees(double number) {
		//turns radians into degrees
		double angle = number*(180/3.14159);
		return angle;
	}
	public static double toRadians(double number) {
		//turns degrees into radians
		double radian = number*(3.14159/180);
		return radian;
	}
	public static double discriminant(double a, double b, double c) {
		//writes out the discriminant portion of the quadratic formula
		double discriminant = b*b-((4*a)*c);
		return discriminant;
	}
	public static String toImproperFrac(int a, int b, int c) {
		//takes a number with a fraction and makes it an improper fraction
		int improper = (a*c + b);
		return (improper+"/"+c);
	}
	public static String toMixedNum(int numerator, int denominator) {
		//turns an improper fraction into a mixed number (with a fraction)
		int mixed = numerator/denominator;
		int rest = (numerator%denominator);
		return (mixed+"_"+rest+"/"+denominator);
	}
	public static String foil(int a, int b, int c, int d, String n) {
		//this returns the result of performing FOIL in it's simplified form
		return (a*c + n + "^2" + " + " + (a*d + b*c) + n + " + " + b*d);
	}
	public static boolean isDivisibleBy(int num, int divisor) {
		//lets you know if a certain int is divisble by another certain int
		if(num <= 0) throw new IllegalArgumentException("Divident must be positive.");
		if(num%divisor==0) {
			return true;
		}else {
			return false;
		}
	}
	public static double absValue(double num) {
		//returns the absolute value--negative values turned to positive, positive remain the same
		if(num<0) {
			num = num*(-1);
		}else {
			num = num*1;
		}
		return num;
	}
	public static double max(double a, double b) {
		//returns the largest of two doubles
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static double max(double a, double b, double c) {
		//returns the largest number of three doubles
		if(a>b && a>c) {
			return a;
		}
		if(b>a && b>c) {
			return b;
		}else {
		//if(c>a && c>b) {
			return c;
		}
	}
	public static int min(int a, int b) {
		//returns the smaller number of two integers
		if(a>b) {
			return b;
		}else{
			return a;
		}
	}
	public static double round2(double num) {
		//rounds a double to the nearest hundreds place.
		double up = num+0.005;
		double decimalChange = up*100;
		int move = (int) decimalChange;
		return move/100.0;
	}
	public static double exponent(double base, int power) {
		// Finds the value of a number with a given exponent.
		if(power <= 0) throw new IllegalArgumentException("Exponent must be positive.");
		int n = 1;
		double raised = base;
		while(n<power) {
			raised = raised*base;
			n = n+1;
		}
		if(power==1) {
			return base;
		}else{
			return raised;
		}
	}
	public static int factorial(int num) {
		// Returns the factorial of a number passed.
		int answer = 1;
		if(num <= 0) throw new IllegalArgumentException("Factorial must be positive.");
		for(int i=1; i<=num; i++) { 
			answer=answer*=i;
		}
		return answer;
	}
	public static boolean isPrime(int num) {
		// Determines whether or not a number is prime.
		if(num==1) throw new IllegalArgumentException("1 is not prime nor composite.");
		for(int i=2; i*i<=num;i++) {
			if(num%i==0) { 
				return false;
			}
		}
		return true;
	}
	public static int gcf(int num1, int num2) {
		// Finds the greatest common factor between two numbers.
		int min=min(num1, num2);
		int max=0;
		for(int i=1; i<=min; i++) {
			if(isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
				if(i>0) {
					max=i;
				}
			}
		}
		return max;
	}
	public static double sqrt(double num) {
		// Finds the square root of a number.
		if(num<0) throw new IllegalArgumentException("Negative numbers do not have a square root.");
		int i=1;
		while(i*i<num) {
			i++;
		}
		return i;
	}
	public static String quadForm(double num1, double num2, double num3) {
		//Takes numbers and puts them in the form of the quadratic formula to approximate real roots, if any.
		if(discriminant(num1, num2, num3)<0) {
			return "No real roots.";
		}else if(discriminant(num1, num2, num3)==0) {
			return round2(-1*num2/(2*num1))+"";
		}else {
			double opt1 = (((-1*num2)+sqrt(discriminant(num1, num2, num3))));
			double opt2 = (((-1*num2)-sqrt(discriminant(num1, num2, num3))));
			return round2(opt1)+" and "+round2(opt2);
		}
	}
}
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String formula = a+"x^2+"+b+"x+"+c+"\n\n";
		String direction;
		if(a<0) {
			direction = "Down \n";
		}else if(a>0) {
			direction = "Up \n";
		}else{
			direction = "Not a parabola \n";
		}
		String face = "Opens:"+ direction;
		String symm = "Axis of Symmetry:" + (-1*b/(2*a))+"\n";
		double x = (-1*b/(2*a));
		String vert = "Vertex:("+x+","+(a*x*x+b*x+c)+")"+"\n";
		String xIntercept = "x-intercept:" + quadForm(a, b, c)+"\n";
		String yIntercept = "y-intercept:" + c;
		String stuff = formula + face + symm + vert + xIntercept + yIntercept;
		return stuff;
	}
	public static String symm(double a, double b, double c) {
		if(discriminant(a, b, c) >= 0) {
			double positive = round2((-b+sqrt(discriminant(a, b, c)))/-2/a);
			double negative = round2((-b-sqrt(discriminant(a, b, c)))/-2/a);
			double first;
			double second;
			if(positive != negative) {
				first = min(positive, negative);
			}else {
				first = positive;
			}
			if(first == positive) {
				second = negative;
			String root1 = Double.toString(-1*first);
			String root2 = Double.toString(-1*second);
			if(root1.equals(root2)) {
				return root1;
			}else {
				return root1 + "and" + root2;
			}
			}else {

				return "no x-intercept";
			}
		}
	}
	public static String quadForm(double num1, double num2, double num3) {
		//Takes numbers and puts them in the form of the quadratic formula to approximate real roots, if any.
		if(discriminant(num1, num2, num3)<0) {
			return "No real roots.";
		}else if(discriminant(num1, num2, num3)==0) {
			return round2(-1*num2/(2*num1))+"";
		}else {
			double opt1 = (((-1*num2)+sqrt(discriminant(num1, num2, num3))));
			double opt2 = (((-1*num2)-sqrt(discriminant(num1, num2, num3))));
			return round2(opt1)+" and "+round2(opt2);
		}
	}
	public static double min(double a, double b) {
		//returns the smaller number of two integers
		if(a>b) {
			return b;
		}else{
			return a;
		}
	}
	public static double round2(double num) {
		//rounds a double to the nearest hundreds place.
		double up = num+0.005;
		double decimalChange = up*100;
		int move = (int) decimalChange;
		return move/100.0;
	}
	public static double discriminant(double a, double b, double c) {
		//writes out the discriminant portion of the quadratic formula
		double discriminant = b*b-((4*a)*c);
		return discriminant;
	}
	public static double sqrt(double num) {
		// Finds the square root of a number.
		if(num<0) throw new IllegalArgumentException("Negative numbers do not have a square root.");
		int i=1;
		while(i*i<num) {
			i++;
		}
		return i;
	}
}
		
		


