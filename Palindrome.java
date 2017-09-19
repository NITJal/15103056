package packge;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String s=new String();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		s=sc.nextLine();
		char a[]=s.toCharArray();
		char b[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			b[i]=a[s.length()-1-i];
		}
		String s1=String.valueOf(b);
		if(s.equals(s1))
		{
			System.out.println(s+" is palindrome.");
		}
		else 
			System.out.println("Not palindrome");
	}

}
