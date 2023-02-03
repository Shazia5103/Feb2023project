package icici.loans.carloans;

public class DummyClass {

	
	int a = 10, b = 20, result;
	public void multiply()							
	{
		result = a * b;
		System.out.println("multiplication of a and b = " + result);
	}
	
	
	public static void main(String[] args)
	{
		DummyClass d = new DummyClass();
		d.multiply();

	}

}
