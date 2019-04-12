package codePractice;

import java.util.Scanner;

public class ReturnTwoPrimeNumbers {
	static int num,r,flag;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		if(t>=1&&t<=70)
		{
		while(t-->0)
		{
			num=scan.nextInt();
			if(num>=1&&num<=10000)
			{
				r=3;flag=0;
				process();
			}else
			{
				break;
			}
		}
		scan.close();
		}
	}
public static void process()
{
	int val=num-r;
	flag=1;
	if(checkPrime(val))
	{
		if(flag==1)
			
		{
			System.out.println(r+" "+val);
		}
		else
		{
			inc();
		}
	}
	else
	{
		inc();
	}
}
public static boolean checkPrime(int value)
{
	for(int i=3;i<((int)Math.sqrt(value)+1);i+=2)
	{
		if(value%i==0)
		{
			return false;
		}
	
	}
	return true;
}
public static void  inc()
{
	flag=0;
	r=r+2;
	if(checkPrime(r))
	{
		process();
	}
	else
	{
		inc();
	}
	
}

}
