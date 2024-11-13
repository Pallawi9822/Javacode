package basic_program;

class Polymorphism_program1
{
	void login()
	{
		
		System.out.println("login with mail id");
	}
}

class Polymorphism_program2 extends Polymorphism_program1
{
	void login()
	{
		super.login();
		System.out.println("login with mob no");
	}
}
public class Polymorphism_program extends Polymorphism_program2 {

	
	public static void main(String[] args) 
	{
		
		Polymorphism_program2 s=new Polymorphism_program2();
		s.login();
		
		
	}

}
