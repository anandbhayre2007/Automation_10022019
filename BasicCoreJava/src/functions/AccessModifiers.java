package functions;

public class AccessModifiers {

	public static void main(String[] args) 
	{
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicMethod();
		obj.privateMethod();
		obj.noAccessModMethod();
		obj.protectedMethod();
	}
	
	public void publicMethod()
	{
		System.out.println("Public method");
	}	
	private void privateMethod()
	{
		System.out.println("Private Method");
	}	
	void noAccessModMethod()
	{
		System.out.println("noAccessModMethod");
	}	
	protected void protectedMethod()
	{
		System.out.println("protectedMethod");
	}
	

}
