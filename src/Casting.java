import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		System.out.print("Please provide a price?");
		Scanner scan = new Scanner(System.in);
		float vat = 0.196f;
		float price = scan.nextFloat();
		
		System.out.println("True value = " + (price*(vat+1)));
		System.out.println("Trancated price = " + ((int) price * (vat + 1)));
		
		int vip1 = (int) ( price * (vat + 1) );
		int vip2 = (int) ((int) price * (vat + 1));

		System.out.println("vip1 = " + vip1);
		System.out.println("vip2 = " + vip2);

		scan.close();
	}

}
