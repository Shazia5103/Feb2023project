package icici.loans.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args)
	{
		Hdfc h = new Hdfc();
		h.deposit();
		h.withdraw();

	}

	@Override
	public void withdraw() 
	{
		System.out.println("new Withdrawl");		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

}
