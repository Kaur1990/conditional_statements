package conditional_statements;

public class PrintTable {
public static void main(String[] args) {
	for (int i=1;i<=20;i++) {
		if((i==6) | (i==12) |(i==17))
			continue;
		System.out.print(i +":");
		for(int j=1;j<=10;j++) {
			System.out.print(j*i +"  ");
		}
		System.out.println();
	}
}
}
