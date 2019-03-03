package constructor;

public class User {

	public static void main(String[] args) 
	{
		//Car 1
		Car Car1= new Car("Verna",90,"Hyundai");
		Car1.drive();
		Car1.accelarate();		
		//Car 2
		Car Car2= new Car("City",120,"Honda");
		Car2.drive();
		Car2.accelarate();
		
		//Car 3
		Car Car3= new Car("Vento",140,"VW");
		Car3.drive();
		Car3.accelarate();

	}

}
