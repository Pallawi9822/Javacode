package basic_program;

public class Palindrome_1 {

	public static void main(String[] args) {
		
		String name="mom";
		char[] a=name.toCharArray();
		String output = "";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			output=output+a[i];
		}
		
		if(name.equals(output))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
		
	}

}
