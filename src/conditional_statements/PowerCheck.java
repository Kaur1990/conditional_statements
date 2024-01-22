package conditional_statements;

import java.util.*;
import java.lang.*;

public class PowerCheck {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no");
	if(sc.hasNextInt())
	{
	int num = sc.nextInt();
	int Sq= (int)Math.pow(num,2);
	int cube= (int)Math.pow(num,3);
	int four_power= (int)Math.pow(num,4);
	System.out.println("Square =" +Sq);
	System.out.println("cube =" +cube);
	System.out.println("fourth power =" +four_power);
	}
	else if(sc.hasNextDouble())
	{
	double num = sc.nextDouble();
	double Sq= (double)Math.pow(num,2);
	double cube= (double)Math.pow(num,3);
	double four_power= (double)Math.pow(num,4);
	System.out.println("Square =" +Sq);
	System.out.println("cube =" +cube);
	System.out.println("fourth power =" +four_power);
	}
	else
	System.out.println("oops! please enter a valid value");
	}

}
