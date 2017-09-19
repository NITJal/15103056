package packge;

import java.util.Scanner;

public class Matrix 
{
	public static void main(String[] args) 
	{
		int r1,c1,r2,c2,i,j,k;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of matrices: ");
		r1=sc.nextInt();
		c1=sc.nextInt();
		r2=sc.nextInt();
		c2=sc.nextInt();
		int m1[][]=new int[r1][c1];
		int m2[][]=new int[r2][c2];
		System.out.println("Enter elements in matrix1: ");
		for(i=0;i<r1;i++)  
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements in matrix2: ");
		for(i=0;i<r2;i++)  
		{
			for(j=0;j<c2;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		int m[][]=new int[r1][c2];
		for(i=0;i<r1;i++)  
		{
			for(j=0;j<c2;j++)
			{
				int sum=0;
				for(k=0;k<r2;k++)
				{
					sum=sum+m1[i][k]*m2[k][j];
				}
				m[i][j]=sum;
			}
		}
		System.out.println("Multiplication result: ");
		for(i=0;i<r1;i++)  
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
