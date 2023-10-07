package interviewPrograms;

import java.util.Scanner;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		int m, n, p, q, sum = 0, c, d, k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		m = in.nextInt();
		n = in.nextInt();
		int first[][] = new int[m][n];
		System.out.println("Enter the elements of first matrix");
		for ( c = 0 ; c < m ; c++ )
		{
			for ( d = 0 ; d < n ; d++ )
			{
				first[c][d] = in.nextInt();
			}
				
		}
		
		System.out.println("Enter the number of rows and columns of second matrix");
		p = in.nextInt();
		q = in.nextInt();
		
		if ( n != p )
		{
			System.out.println("Matrices with entered orders can't be multiplied with each other.");
		}
		
		else
		{
		int second[][] = new int[p][q];
		int multiply[][] = new int[m][q];
		System.out.println("Enter the elements of second matrix");
		for ( c = 0 ; c < p ; c++ )
		{
			for ( d = 0 ; d < q ; d++ )
			{
				second[c][d] = in.nextInt();
			}
				
		}
		
		for ( c = 0 ; c < m ; c++ )
		{
			
				for ( d = 0 ; d < q ; d++ )
				{
							
					for ( k = 0 ; k < p ; k++ )
					{
						sum = sum + first[c][k]*second[k][d];
		            }
					multiply[c][d] = sum;
					sum = 0;
				}
		}
		System.out.println("Product of entered matrices:-");
		for ( c = 0 ; c < m ; c++ )
		{
			for ( d = 0 ; d < q ; d++ )
			{
				System.out.print(multiply[c][d]+"\t");
				
			}
			System.out.print("\n");
			
		}
		
		
		
		}  
		
		//second logic
		
		int a[][] = {{1, 1}, {2, 2}};
		int b[][] = {{1, 1}, {2, 2}};
		//creating another matrix to store the multiplication of two matrices
		int d1[][] = new int[2][2];
		//multiplying and printing multiplication of 2 matrices
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++) 
			{
					d1[i][j] = 0;
						for(int h = 0; h < 2; h++) 
						{
							d1[i][j] += a[i][h] * b[h][j];
						}
		          System.out.print(d1[i][j] + " ");
           }
		System.out.println();
		
		}
		
		
		
	}

}
