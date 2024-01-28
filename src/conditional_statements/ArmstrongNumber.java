package conditional_statements;
import java.util.*;
import java.lang.*;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any no");
	int a =sc.nextInt();
	int i=a;
	int cube;
	int sum=0;
	while(i!=0)
	{
		int j;
		j=i%10;
		i=i/10;
		cube= (int) Math.pow(j, 3);
		sum= sum+cube;	
	}
	if(a==sum)
		System.out.println(a+ "is Armstrong number");
	else
		System.out.println(a +"is not Armstrong number");
}
}
