package conditional_statements;
import java.util.*;

public class CheckPositiveNegative{
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int a= sc.nextInt();
		if(a>=0)
			System.out.println(a +" Is Positive");
		else
			System.out.println(a +"Is Negative");
		
	}
}