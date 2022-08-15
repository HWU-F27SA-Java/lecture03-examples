import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type in a number please?");
		int n = scan.nextInt();
		int a = 5, b=10, c=18, d=100;
		
		boolean negative = (n<0);
		System.out.println("negative? " + negative);
		
		boolean positive = (n>0);
		System.out.println("positive? " + positive);
		
		boolean interval1 = (n>=0 && n<b);
		System.out.println("In [0, 9[ " + interval1);
		
		boolean interval2 = (n >= a && n <b) || (n>c && n <=d);
		System.out.println("[5, 10[ or ]18, 100]? " + interval2);
		
		scan.close();
	}

}
