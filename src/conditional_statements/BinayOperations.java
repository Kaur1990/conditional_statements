package conditional_statements;
import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
public class BinayOperations {
	public static void main(String args[]) throws ParseException
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter 2 no's");
	  

	if(sc.hasNextInt())
	{
	int num1= sc.nextInt();
	  int num2= sc.nextInt();
	  int sum= num1+num2;
	  int diff= num1-num2;
	  int prod= num1*num2;
	  int distance= diff;
	  int avg= (num1+num2)/2;
	  System.out.println("Sum =" + sum);
	  System.out.println("Differnce =" + diff);
	  System.out.println("Product =" + prod);
	  System.out.println("Distance =" + distance);
	  System.out.println("Average =" + avg);
	  if(num1>num2)
	  {
	   System.out.println("Maximum =" + num1);
	   System.out.println("Minimum =" + num2);
	  }
	  else
	  {
	    System.out.println("Maximum =" + num2);
	   System.out.println("Minimum =" + num1);
	  }
	}//end of int block

	else if(sc.hasNextDouble())
	{ 
	  double num1= sc.nextDouble();
	  double num2= sc.nextDouble();
	  double sum= num1+num2;
	  double diff= num1-num2;
	  double prod= num1*num2;
	  double distance= diff;
	  double avg= (num1+num2)/(double)2;
	  System.out.println("Sum =" + sum);
	  System.out.println("Differnce =" + diff);
	  System.out.println("Product =" + prod);
	  System.out.println("Distance =" + distance);
	  System.out.println("Average =" + avg);
	  if(num1>num2)
	  {
	   System.out.println("Maximum =" + num1);
	   System.out.println("Minimum =" + num2);
	  }
	  else
	  {
	    System.out.println("Maximum =" + num2);
	   System.out.println("Minimum =" + num1);
	  }
	}//end of double block

	/*else if(sc.hasNext())
	{
	  String num1= sc.next();
	  String num2= sc.next();
	  System.out.println("It means it is fraction" );
	  Double d1= fractiontoDouble(num1);
	  Double d2= fractiontoDouble(num2);
	//---------------------------------------method
	double fractiontoDouble(string f)
	    {
	       Double d= null;
	       if(f !=null)
	       {
	          if(f.contains("/"))
	          {
	              String numbers[]= f.split("/");
	              if(numbers.length==2)
	              {
	                  BigDecimal bd1=BigDecimal.valueOf(Double.valueOf(numbers[0]));
	                  BigDecimal bd2=BigDecimal.valueOf(Double.valueOf(numbers[1]));
	                  BigDecimal res= bd1.divide(bd2, MathContext.DECIMAL128);
	                  d = res.doubleValue();
	                  return d;
	               }
	           }
	         }
	    }
	  //Double d1= Double.parseDouble(num1);// returns double value of string 
	 // Double d2= Double.parseDouble(num2);
	  System.out.println(d1);
	  System.out.println(d2);
	  double sum= d1+d2;
	  double diff= d1-d2;
	  double prod= d1*d2;
	  double distance= diff;
	  double avg= (d1+d2)/2;
	  System.out.println("Sum =" + sum);
	  System.out.println("Differnce =" + diff);
	  System.out.println("Product =" + prod);
	  System.out.println("Distance =" + distance);
	  System.out.println("Average =" + avg);
	  if(d1>d2)
	  {
	   System.out.println("Maximum =" +d1);
	   System.out.println("Minimum =" +d2);
	  }
	  else
	  {
	    System.out.println("Maximum =" +d2);
	   System.out.println("Minimum =" + d1);
	  }


	}*///end of fraction block
	else
	System.out.println("oops! please give valid input");
	}

}
