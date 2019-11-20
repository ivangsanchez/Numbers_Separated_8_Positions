package com.separacionocho.app;
import java.util.Scanner;
public class SeparaciondeOcho {

	public static void main(String[] args) {
		int number=0,sum=0,cont=0;
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Input a number lower than 500: ");
		number=input.nextInt();
		
		}while(number>500);
		
		
		
		for(int i=number;i<=500;i+=8)
		{
			System.out.println("Number: "+i);
			sum+=i;
			cont++;
		}
		
		System.out.println("The add is: "+sum);
		System.out.println("The numbers are: "+cont);
		
	}

}
