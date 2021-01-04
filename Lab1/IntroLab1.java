/*
 * CSC115 Spring2021
 * Lab1.java
 *
 * Functions in Java
 *
 */
public class IntroLab1 {

	public static void main(String args[])
	{
		System.out.println("In function: \"main\"");
		
		foo("Hello world!");
		
		System.out.println("Leaving function: \"main\"");
	}
	public static void foo(String str)
	{
		System.out.println("In function: \"foo\"");
		
		System.out.println("print string: " +str);
		
		System.out.println("Leaving function: \"foo\"");
		
	}
	

}
