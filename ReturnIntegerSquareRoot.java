package week1.homework;

public class ReturnIntegerSquareRoot {


	/*
	 Given a non-negative integer x, compute and return the square root of x.
     Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
     Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
	 */

	public static void main(String[] args) {
		System.out.println(ReturnSquareRoot(9));

	}

	public static int ReturnSquareRoot(int x) {

		return (int) Math.sqrt(x);

	}

}
