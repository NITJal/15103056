package packge;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of Strings: ");
		int n=sc.nextInt();
		
		String s[]=new String[n];
		
		for(int i=0;i<n;i++)
		{ 
			System.out.println("Enter the String: ");
			s[i]=sc.nextLine();
		}
		
		for(int i=0;i<n-1;i++)
		{ 
			for(int j=0;j<n-1-i;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{ 
			System.out.println(s[i]);
		}
	}

}
