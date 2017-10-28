package local.snk;

import org.apache.commons.math3.fraction.*;

public class BigFractionDemo {

	/**
	 * This is main method.
	 * It uses BigFraction class from org.apache.commons.math3.fraction to show its use. 
	 * @param args Input argument for the program.
	 * @author Sandeep Kulkarni
	 */
	public static void main(String[] args) {
		BigFraction one = new BigFraction(1524, 1000);
        System.out.println("one   = " + one);

        BigFraction two = new BigFraction(251, 100);
        System.out.println("two   = " + two);

        BigFraction three = one.divide(two);
        System.out.println("three = " + three);
	}
}
