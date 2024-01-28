package conditional_statements;
import java.util.*;
public class CalculateFactor {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any positive no");
	int number= sc.nextInt();
	System.out.print("Factor of" + number +"are"+"  ");
	for(int i=1;i<=number;i++)
	{
		if(number%i==0)
		{
			System.out.print(i +",");
		}
		
	}
}
}
