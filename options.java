package p1;
import java.util.*;
import java.io.IOException;
import java.text.DecimalFormat;
public class options extends account {
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	public void getlogin() throws Exception
	{
		int x=1;
		do
		{
			try
			{
				data.put(797979,12345);
				data.put(9113078,123456);
				System.out.println("WELCOME TO ATM ");
				System.out.println("Enter your customer number");
				int customernumber=sc.nextInt();
				setcustomernumber(customernumber);
				System.out.println("Enter your pin number");
				setpinnumber(sc.nextInt());	
			}
			catch(Exception e)
			{
				System.out.println("\n"+"invalid char(s).onlynumber"+"\n");
				x=2;
			}
			for(Map.Entry<Integer,Integer>entry:data.entrySet())
			{
				if(entry.getKey()==getcustomernumber()&&entry.getValue()==getpinnumber())
					getaccounttype();
				
			}
			System.out.println("wrong customer number or pin number");
		}while( x==1);
		
	}
	
	

	public void getaccounttype()
	{
		System.out.println("Select the account you want to access");
		System.out.println("TYPE-1 = CHECKING ACCOUNT");
		System.out.println("TYPE-2 = SAVING ACCOUNT");
		System.out.println("TYPE-3 = EXIT");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:getchecking();
				break;
		case 2:getsaving();
				break;
		case 3 :System.out.println("THANK YOU FOR USING THIS ATM,BYE");
				break;
		default:System.out.println("\n"+"invalid choice "+"\n");
		}
	}
	public void getchecking()
	{
		System.out.println("CHECKING USER ACCOUNT");
		System.out.println("TYPE-1 = VIEW BALANCE");
		System.out.println("TYPE-2 = WITHDRAW FUNDS");
		System.out.println("TYPE-3 = DEPOSIT  FUNDS");
		System.out.println("EXIT");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("checking account balance"+moneyFormat.format(getcheckingbalance()));
				getaccounttype();
				break;
		case 2:getcheckingwithdrawinput();
				getaccounttype();
				break;
		case 3:getcheckingdepositinput();
				getaccounttype();
				break;
		case 4 :System.out.println("THANK YOU FOR USING THIS ATM,BYE");
				break;		
		default:System.out.println("\n"+"invalid choice "+"\n");
				getchecking();
		}
	}
	public void getsaving()
	{
		System.out.println("SAVING ACCOUNTING");
		System.out.println("TYPE-1 = VIEW BALANCE");
		System.out.println("TYPE-2 = WITHDRAW FUNDS");
		System.out.println("TYPE-3 = DEPOSIT  FUNDS");
		System.out.println("EXIT");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("checking account balance"+moneyFormat.format(getsavingbalance()));
				getaccounttype();
				break;
		case 2:getsavingwithdrawinput();
				getaccounttype();
				break;
		case 3:getsavingdepositinput();
				getaccounttype();
				break;
		case 4 :System.out.println("THANK YOU FOR USING THIS ATM,BYE");
				break;		
		default:System.out.println("\n"+"invalid choice "+"\n");
				getchecking();
		}
	}
		
}
