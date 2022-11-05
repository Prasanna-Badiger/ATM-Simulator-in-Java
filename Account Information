package p1;
import java.util.*;
import java.text.DecimalFormat;
public class account {
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	private int customernumber;
	private int pinnumber;
	private double savingbalance=0;
	private double checkingbalance=0;
	public int setcustomernumber(int customernumber)
	{
		this.customernumber=customernumber;
		return customernumber;
	}
	public int getcustomernumber()
	{
		return customernumber;
	}
	public int setpinnumber(int pinnumber)
	{
		this.pinnumber=pinnumber;
		return pinnumber;
	}
	public int getpinnumber()
	{
		return pinnumber;
	}
	public double getcheckingbalance()
	{
		return checkingbalance;
	}
	public double getsavingbalance()
	{
		return savingbalance;
	}
	public double calccheckingwithdraw(double amount)
	{
		checkingbalance=(checkingbalance-amount);
		return checkingbalance;
	}
	public double calcsavingwithdraw(double amount)
	{
		savingbalance=(savingbalance-amount);
		return savingbalance;
	}
	public double calccheckingdeposit(double amount)
	{
		checkingbalance=(checkingbalance+amount);
		return checkingbalance;
	}
	public double calcsavingdeposit(double amount)
	{
		savingbalance=(savingbalance+amount);
		return savingbalance;
	}
	public void getcheckingwithdrawinput()
	{
		System.out.println("checking account balance"+moneyFormat.format(checkingbalance));
		System.out.println("amount you want to withdraw from checking account");
		double amount=sc.nextDouble();
		if((checkingbalance-amount)>=0)
		{
			calccheckingwithdraw(amount);
			System.out.println("new checking account balance"+moneyFormat.format(checkingbalance));
		}
		else
		{
			System.out.println("your balance is zero"+"\n");
		}
		
	}
	public void getcheckingdepositinput()
	{
		System.out.println("checking account balance"+moneyFormat.format(checkingbalance));
		System.out.println("amount you want to deposit from checking account");
		double amount=sc.nextDouble();
		if((checkingbalance+amount)>=0)
		{
			calccheckingdeposit(amount);
			System.out.println("new checking account balance"+moneyFormat.format(checkingbalance));
		}
		else
		{
			System.out.println("your balance is zero"+"\n");
		}
		
	}
	public void getsavingwithdrawinput()
	{
		System.out.println("Saving account balance"+moneyFormat.format(savingbalance));
		System.out.println("amount you want to withdraw from saving account");
		double amount=sc.nextDouble();
		if((savingbalance-amount)>=0)
		{
			calcsavingwithdraw(amount);
			System.out.println("new checking account balance"+moneyFormat.format(checkingbalance));
		}
		else
		{
			System.out.println("your balance is zero"+"\n");
		}
		
	}
	public void getsavingdepositinput()
	{
		System.out.println("saving account balance"+moneyFormat.format(savingbalance));
		System.out.println("amount you want to deposit from saving account");
		double amount=sc.nextDouble();
		if((savingbalance+amount)>=0)
		{
			calcsavingdeposit(amount);
			System.out.println("new checking account balance"+moneyFormat.format(savingbalance));
		}
		else
		{
			System.out.println("your balance is zero"+"\n");
		}
		
	}
	
	
	

}
