/*
==================================================================================================================================
Date: 26/Sep/2020
Author: Amal Shibu
Languages Used: Java
Session: Online Class
Subject: Oops lab
Error: Null
Warnings:Null
==================================================================================================================================
*/


import java.util.Scanner;	
class sum
{
	public static void main(String amal[])
	{
		Scanner input=new Scanner(System.in);	//system.in for accepting from keyboard

		System.out.println("Enter a number: ");
		int Var1=input.nextInt();
		
		System.out.println("Enter Another Number : ");
		int Var2=input.nextInt();
		
		System.out.println("Sum : "+Sum(Var1,Var2));
	}	
		
	public static int Sum(int Var1,int Var2)
	{
		int Add=Var1+Var2;
		return Add;
	}

}