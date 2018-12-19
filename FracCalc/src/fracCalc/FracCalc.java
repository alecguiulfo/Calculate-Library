package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args)
    
    {
    	Scanner take = new Scanner (System.in);
    	String input = take.nextLine();
    	while(!input.equals("quit")) {
    		System.out.println(produceAnswer(input));
    		input = take.nextLine();
    	}
        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
    	String[] strArray = input.split(" ");
    	int[] op1 = parse(strArray[0]);
    	int[] op2 = parse(strArray[2]);
    	int[] ansArray = parse(doMath(op1, op2, operator));
    	//String op1 = strArray[0]; 
    	//String operator = strArray[1]; 
    	//String op2 = strArray[2]; 
    	//return op2;
    	
    	//return parse(op2);

        // TODO: Implement this function to produce the solution to the input
        
        //return strArray[2];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String parse(String operand) {
    	String whole;
    	
    	String num;
    	String den;
    	String[] splat = operand.split("_");
    	if(splat.length == 1) {
    		String number = splat[0];
    		String[] numbah = number.split("/");
    		if(numbah.length == 1) {
    			whole = numbah[0];
    			num = "0";
    			den = "1";
    		}else {
    			whole = "0";
    			num = numbah[0];
    			den = numbah[1];
    		}
    	}else {
    		whole = splat[0];
    		String frac = splat[1];
    		String[] numbah = frac.split("/");
    		num = numbah[0];
    		den = numbah[1];
    		}
    	
    	return "whole:" + whole + " numerator:" + num + " denominator:" + den;
    	
    }
}

