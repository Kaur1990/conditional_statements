package conditional_statements;
import java.util.*;
public class DisplayMonthDays {
   public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number starting from 1 to 12 to display month days");
	System.out.println("Enter year also");
	int mm = sc.nextInt();
	int yy = sc.nextInt();
	switch(mm)
	{
	case 1:
		System.out.println("January has 31 days");
		break;
	case 2:
		if(yy%4 ==0)
		System.out.println("February has 29 days");
		else
		System.out.println("February has 28 days");
		break;
	case 3:
		System.out.println("March has 31 days");
		break;
	case 4:
		System.out.println("April has 30 days");
		break;
	case 5:
		System.out.println("May has 31 days");
		break;
	case 6:
		System.out.println("June has 30 days");
		break;
	case 7:
		System.out.println("July has 31 days");
		break;
	case 8:
		System.out.println("August has 31 days");
		break;
	case 9:
		System.out.println("September has 30 days");
		break;
	case 10:
		System.out.println("October has 31 days");
		break;
	case 11:
		System.out.println("November has 30 days");
		break;
	case 12:
		System.out.println("December has 31 days");
		break;
	default:
		System.out.println("You have value put else smaller than 1 or greater than 12");
	}
	
}
}
