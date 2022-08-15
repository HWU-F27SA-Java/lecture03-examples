import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		System.out.print("Please give a number?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		int var1 = n % 2;
		System.out.println(n + "% 2 =" + var1);
	
		int var2 = n % 3;
		System.out.println(n + "% 3 =" + var2);
		
		int var3 = n % 7;
		System.out.println(n + "% 7 =" + var3);

		scan.close();
	}

}
