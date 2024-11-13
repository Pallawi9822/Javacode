package basic_program;

import java.util.Arrays;

public class Anagram_program {

	public static void main(String[] args) {
		
		String s= "ram";
		String s1="arm";
		char[] a=s.toCharArray();
		char[] a1=s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(a1);
		
		System.out.println(a);
		System.out.println(a1);
		
		
		
	boolean b=Arrays.equals(a, a1);
	
	if (b==true)
	{
		System.out.println("given string is anagram");
	}
	else
	{
		System.out.println("given string is not anagram");
	}
	
		

	}

}
