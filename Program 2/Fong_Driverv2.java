/***************************************************************
* file: Fong_Driver.java
* author: J. Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 2
* date last modified: 3/31/2016
*
* This is a program that holds the methods for calculating the area
* of geometric objects. This program is referred by Fong_Driver and
* executes whichever method it calls.
****************************************************************/
import java.util.Scanner;
import java.io.*;
public class Fong_Driverv2
{
	public static void main(String args[])
	{
	double getArea;
	double radius;
	double length;
	double width;
	double base;
	double height;
	double area;
	int selection;
	Scanner keyboard = new Scanner(System.in);

	//A do while loop to create the do the equations and exit out of the program.
	do
	{	
	
	System.out.println("----------------------------------");
	System.out.println("Geometry Calculator");
	System.out.println("----------------------------------");
	System.out.println("1. Calculate the Area of a Circle");
	System.out.println("2. Calculate the Area of a Rectangle");
	System.out.println("3. Calculate the Area of a Triangle");
	System.out.println("4. Quit");
	System.out.println(" ");
	System.out.println("Enter your choice (1-4):");
	selection = keyboard.nextInt();

	switch (selection){
		case 1:		
			System.out.println("Enter the radius of the circle:");
			radius = keyboard.nextDouble();
			
			if (radius < 0)
			{
			System.out.println("That is not a valid input. Please enter a positive number.");
			}
			else
			{
			area = Fong_Geometry.CircleArea(radius);
			System.out.println("The area of this particular circle is: " + area);
			}	
			break;
		case 2:
			System.out.println("Enter the length of the rectangle:");
			length = keyboard.nextDouble();
			System.out.println("Enter the width of the rectangle:");
			width = keyboard.nextDouble();
			if (length < 0.0 || width < 0.0)
				System.out.println(length + " and "+ width +" are not valid inputs. Please enter positive numbers.");
			else
			{
			
				area = Fong_Geometry.RectangleArea(length,width);
				System.out.println("The area of this particular rectangle is: " + area);
			
			}	
			break;
		case 3:
			System.out.println("Enter the base of the triangle:");
			base = keyboard.nextDouble();

				System.out.println("Enter the height of the triangle:");
				height = keyboard.nextDouble();

				if (height < 0.0 || base <0.0)
					{
					System.out.println(height + " and " + base +" is not a valid input. Please enter a positive number.");
					}	
				else
					{
					area = Fong_Geometry.TriangleArea(base,height);
					System.out.println("The area of this particular triangle is: " + area);
					}

			break;
		case 4:
			System.out.println("Exiting.");
			break;
		default:
			System.out.println("That is an unrecognized action. Please enter (1-4).");
			break;
	}
	while (selection != 4)
	System.exit(0);