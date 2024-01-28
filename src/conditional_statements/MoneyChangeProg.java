package conditional_statements;
import java.util.*;
public class MoneyChangeProg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter money given ");
	System.out.println("Enter the spent money");
	int money_given= sc.nextInt();
	int spent_money= sc.nextInt();
	int ret_m= money_given-spent_money;
	System.out.println(ret_m);
	int r500=0,r200=0,r100=0,r50=0,r20=0,c10=0,c5=0,c2=0,c1=0,r2000;
	int count_notes=0;
	int count_coins=0;
	
	while(ret_m>=1) {
		System.out.println(ret_m);
		if(ret_m>=2000) {
			r2000=ret_m/2000;
			ret_m=ret_m%2000;
			System.out.println("no. of 2000rs notes"+ r2000);
		}
		if(ret_m >=500) {
			r500= ret_m/500;
			ret_m= ret_m%500;
			System.out.println("no. of 500 rs notes" + r500);
		}
		else if(ret_m >=200)
		{
			r200= ret_m/200;
			ret_m= ret_m%200;
			System.out.println("no. of 200 rs notes" + r200);	
		}
		else if(ret_m >=100) {
			r100= ret_m/100;
			ret_m= ret_m%100;
			System.out.println("no. of 100 rs notes" + r100);
		}
		else if(ret_m >=50) {
			r50= ret_m/50;
			ret_m= ret_m%50;
			System.out.println("no. of 50 rs notes" + r50);
		}
		else if(ret_m >=20) {
			r20= ret_m/20;
			ret_m= ret_m%20;
			System.out.println("no. of 20 rs notes" + r20);
		}
		else if(ret_m >=10) {
			c10= ret_m/10;
			ret_m= ret_m%10;
			System.out.println("no. of 10 rs coins" + c10);
		}
		else if(ret_m >=5) {
			c5= ret_m/5;
			ret_m= ret_m%5;
			System.out.println("no. of 5 rs coins" + c5);
		}
		else if(ret_m >=2) {
			c2= ret_m/2;
			ret_m= ret_m%2;
			System.out.println("no. of 2 rs coins" + c2);
		}
		else {
			c1= ret_m/1;
			ret_m= ret_m%1;
			System.out.println("no. of 1 rs coins" + c1);
		}		
	}
	count_notes= r500+r200+r100+r50+r20;
	count_coins=c10+c5+c2+c1;
	System.out.println("Total no of notes returned:" +count_notes+ "Total no.of coins returned"+count_coins);
	
}
}
