
public class ThirdClass
{
	
	int a=50,b=20, result;
	
	 public void add() 
    { result = a+b;
      System.out.println("addition of a and b is :"+ result);
	}
		public void subs() 
	{ 
         result = a-b;
         System.out.println("subs of a and b is :"+ result);
    } 
		public static void main(String[] args) 
		{
			
			ThirdClass obj = new ThirdClass();
			obj.add();
			obj.subs();
			
			ThirdClass obj2 = new ThirdClass();
			obj.add();
			obj.subs();
		}
		}