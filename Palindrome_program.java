package basic_program;

public class Palindrome_program {

	public static void main(String[] args) 
	{
		String s="radfccxr";
		char[] c=s.toCharArray();
		String output="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			output=output+c[i];
			
			
			
			
			
		}
		System.out.println(output);
		
		if(s.equals(output))
		{
			System.out.println("given string is palindrome");
		}
		
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}
