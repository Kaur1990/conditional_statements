package conditional_statements;
import java.util.*;
public class DisplayTime {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter value in seconds");
	int i = sc.nextInt();
	int hours = i / 3600;
	int minutes = (i % 3600) / 60;
	int seconds = i % 60;
	System.out.println("HH:MM:SS"+" "+" "+ hours+":"+minutes+":"+seconds);
}
}
