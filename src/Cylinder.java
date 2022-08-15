/*
 * This class calculates and prints the volume of
 * of a cylinder by asking the radius and the height
 */
//-------------------------------------------------------------

import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("This programme calculates for you the volume of a cylinder");
		
		System.out.print("What is the radius? ");
		double radius = scan.nextDouble();

		System.out.print("What is the height? ");
		double height = scan.nextDouble();

		//calculate the volume
		double volume = Math.PI * radius * radius * height;//compound expression

		System.out.print("The volume of cyclinder (Radius=" + radius + ", height= " + height +") = " + volume);

		scan.close();
	}
}
