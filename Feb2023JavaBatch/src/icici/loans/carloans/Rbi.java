package icici.loans.carloans;

public interface Rbi
{
 int x = 100;
 public void withdraw();
 public void depost();
 
 public static void main(String[] args)
 {
	//i = new Rbi();
	 
	 Rbi i;
	 i = new Icici();
	 i.deposit();
	 i.withdraw();
	 
	 i = new Hdfc();
	 i.deposit();
	 i.withdraw();
}
public void deposit();
 
}
