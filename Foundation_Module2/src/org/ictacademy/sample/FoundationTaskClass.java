package org.ictacademy.sample;

public class FoundationTaskClass {
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
public int CalculateSimpleInterest(int p, int t, int r)
{
	return(p*t*r)/100;
}
public int CalculateCompoundInterest(int p, int t, int r, int n)
{
	return (p*(1+(r/n))^(n*t));
}
public int CalculatePerimeterOfRectangle(int l, int b)
{
	return (2*(l+b));
}
public void SwapTwoNumbers(int num1, int num2)
{
    System.out.println("Value before swapping num1 : " + num1+" num2 : "+num2);
	int temp = num1;
	num1=num2;
	num2=temp;
    System.out.println("Value after swapping num1 : " + num1+" num2 : "+num2);
}
public boolean CheckEven(int num)
{
	if(num%2 == 0)
	{
		return true;
	}
	return false;
}
}
