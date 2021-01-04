/*
 * CSC115 Spring2021
 * Lab1.java
 *
 * Java Fundamentals
 *
 */

public class IntroLab2 {

	public static void main(String args[])
	{
		System.out.println("In function: \"main\"");
		
		Student x;
		x = new Student();
		
		Student y = new Student("abc", 75);
		
		foo(x);
		foo(y);
		
		
		System.out.println("Leaving function: \"main\"");
	}
	public static void foo(Student st)
	{
		System.out.println("In function: \"foo\"");
		
		System.out.println("results of st.toString()= "+ st);
		
		System.out.println("Leaving function: \"foo\"");
		
	}
	

}
