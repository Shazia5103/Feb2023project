package icici.loans.carloans;

public class Icici  implements Rbi
{

	public static void main(String[] args)
	{
    Icici i= new Icici();
    i.depost();
    i.withdraw();
	}

	@Override
	public void withdraw() {
		System.out.println("override icici");
	}

	@Override
	public void depost() {
		System.out.println("my deposit");
		
	}

}
