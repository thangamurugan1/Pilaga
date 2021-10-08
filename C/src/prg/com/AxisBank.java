package prg.com;


public class AxisBank extends BankInfo 
				{
				public void deposit()
				{
				System.out.println("Amount deposited....");
        		}
				
	public static void main(String[] args)
	{
	AxisBank a = new AxisBank();
	a.Savings();
	a.fixed();
	a.deposit();

	}

}
