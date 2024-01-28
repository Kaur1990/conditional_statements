package conditional_statements;
import java.util.*;
public class SumOfDigits {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any positive no");
	int i= sc.nextInt();
	int sum=0;
	int reverse=0;
	while(i!=0)
	{
		int j;
		j= i%10;
		i=i/10;
		sum=sum+j;
		reverse= reverse*10+j;
		
	}
	System.out.println("sum is:" + sum);
	System.out.println("reverse is:" + reverse);
}
}
