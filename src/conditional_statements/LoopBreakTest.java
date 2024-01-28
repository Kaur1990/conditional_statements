package conditional_statements;
import java.util.*;
public class LoopBreakTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no.");
	int a = sc.nextInt();
	int i=a;
	while(true)
	{
		if(i<0)
			break;
		else
			System.out.println(i);
		
	}
}
}
