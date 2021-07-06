package com.amar.simpleprogram;
// get input from user
import java.util.Scanner;
// Addition of multiple numbers
public class Addition
{
	public static void main(String[] args) 
	{
		int n, temp, sum = 0 ;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the total number of inputs : ");
		n = ip.nextInt();
		for (int i= 1; i <= n; i++)
		{
			System.out.println("Enter input " + i + ": ");
			temp = ip.nextInt();
			sum = sum + temp;
		}
		system.out.println("output");
		System.out.println(" The sum of all input numbers is : " + sum);
		ip.close();// necessary to avoid memory leaks
	}

}

