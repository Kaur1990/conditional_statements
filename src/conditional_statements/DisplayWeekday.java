package conditional_statements;

import java.util.*;

public class DisplayWeekday {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number starting from 1 to 7");
	int a = sc.nextInt();
	switch(a)
	{
	case 1: 
		System.out.println("This is Sunday");
		break;
	case 2: 
		System.out.println("This is Monday");
		break;
	case 3: 
		System.out.println("This is Tuesday");
		break;
	case 4: 
		System.out.println("This is Wednesday");
		break;
	case 5: 
		System.out.println("This is Thursday");
		break;
	case 6: 
		System.out.println("This is Friday");
		break;
	case 7: 
		System.out.println("This is Saturday");
		break;
	}
}
}
