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
class FindArea
{
	public static void main(String amal[])
	{
		Scanner input=new Scanner(System.in);	//system.in for accepting from keyboard
		
		System.out.println("Enter radius of the Cirlcle: ");
		float rad=input.nextFloat();

		System.out.println("Enter the base length of the Triangle: ");
		double blength=input.nextDouble();
	
		System.out.println("Enter the height of the triangle: ");
		double height=input.nextDouble();

		System.out.println("Enter the length of the rectangle: ");
		int length=input.nextInt();
		
		System.out.println("Enter the length of the rectangle: ");
		int breadth=input.nextInt();
		
		System.out.println("Area of the Circle: "+Area(rad));
		System.out.println("Area of triangle : "+AreaTri(blength,height));
		System.out.println("Area of the rectangle: "+Area(length,breadth));
	}
	
	public static float Area(float rad)
	{
		float ar=(3.14F*rad*rad);
		return ar;
	}
	
	public static double AreaTri(double blength,double height)
	{
		double ar=(double)(0.5*blength*height);
		return ar;
	}

	public static double Area(int length,int breadth)
	{
		double ar=(int)(length*breadth);
		return ar;
	}
	

}