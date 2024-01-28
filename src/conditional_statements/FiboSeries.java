package conditional_statements;
import java.util.*;
public class FiboSeries {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no of times you want to execute your block");
	int k= sc.nextInt();
	int i=1;
	int a=1;
	int b=1;
	int c;
	System.out.println(" " +a+" ");
	System.out.println(" " +b+" ");
	while(i<=k)
	{
		c=a+b;
		System.out.println(" " +c+" ");
		a=b;
		b=c;
		i++;
	}
}
}
