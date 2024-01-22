package conditional_statements;

import java.util.*;
import java.lang.*;

public class TemperatureScale {
	public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter temperature in celsius");
	  float celsius_num= sc.nextFloat();
	  double fahren_num= 1.8 * celsius_num +(double)32;
	  double kelvin_num= celsius_num +273;
	  System.out.println(celsius_num + "celsius" + "=" + fahren_num + "Fahrenhite");
	   System.out.println(celsius_num + "celsius" + "=" + kelvin_num + "Kelvin");
	}
}
