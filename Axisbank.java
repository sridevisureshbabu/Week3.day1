package Week3.Day1;

public class Axisbank extends BankInfo{
	public void deposit()
	{
		System.out.println("this is a fixedaccount in axisbank");
		
	}
	public static void main(String args[])
	{
		Axisbank a=new Axisbank();
		a.deposit();
		BankInfo i=new BankInfo();
		i.deposit();
	}

}
