package org.ictacademy.sample;

import java.util.Scanner;

public class MainFuncFoundationTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FoundationTaskClass obj = new FoundationTaskClass();
int si = obj.CalculateSimpleInterest(1000, 1, 1);
System.out.println("Simple Interest "+si);
int ci = obj.CalculateCompoundInterest(100, 1, 1, 1);
System.out.println("Compount Interest "+ci);
int perimeter = obj.CalculatePerimeterOfRectangle(100, 200);
System.out.println("Perimeter "+ perimeter);
obj.SwapTwoNumbers(20,10);

System.out.println();
Scanner inp  = new Scanner(System.in);
System.out.println("Enter the number to be saved");
int val = inp.nextInt();
obj.setNumber(val);
System.out.println("Saved number obtained from getter method "+ obj.getNumber());

//Printing pattern
//*
//**
//***
//****
//*****
System.out.println();
System.out.println("Please enter the count for pattern printing");
int rowCount = inp.nextInt();
for(int i=0;i<=rowCount-1;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}

//Checking number is even or not
System.out.println();
System.out.println("Please enter number to check even or odd");
int num = inp.nextInt();

	}

}
