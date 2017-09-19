package packge;

import java.util.Scanner;

public class Prime 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int i,j,m;
		for(i=2;i<=n;i++)
		{
			m=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					m=1;
					break;
				}
			}
			if(m==0)
				System.out.println(i);
		}
	}
}
