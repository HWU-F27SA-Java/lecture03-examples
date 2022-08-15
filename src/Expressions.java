
public class Expressions {
	public static void main(String [] args) {
						   short e1=  78 - 12 / 4;
						   //any division of two integer values will be an integer
						   // 6/4 => 1
						   short e2= 2 + 6 / 4 - 9; 
						   
						   short e3= (2 + 6) / 4 - 9;
						   short e4= (2 + 6 )/ (4 - 9 );// 8/(-5) => -1
						   double e5= (2 + 6 )/ (4 - 9 );
						   double e6= (2 + 6 )/ (4 - 9.0 );
						   short e7= 2 - 7 + 3;
						   short e8= 55 / 3 / 2;
						   short e9= 55 / (3 / 2);
						   float e10= 55 / 3 / 2;
						   float e11= 55 / (3 / 2);
						   float e12= 55.0f / 3 / 2	;		// what happens if we remove f?
						   float e13= 55 / (3.0f / 2) ;		// what happens if we remove f?
						   float e14= 55 / 3 / 2.0f  ;		
						   float e15= 55 / (3 / 2.0f) ;		
						   double e16= 55.0 / 3 / 2;
						   double e17= 55 / (3.0 / 2);
						   short e18= (short)(55.0 / 3 / 2) ;	// what happens if we remove (short)? 
						   short e19= (short)(55 / (3.0 / 2)); 	// // what happens if we remove (short)?


	System.out.println("e1 = "+ e1);
	System.out.println("e2 = "+ e2);
	System.out.println("e3 = "+ e3);
	System.out.println("e4 = "+ e4);

	System.out.println("e5 = "+ e5);
	System.out.println("e6 = "+ e6);
	System.out.println("e7 = "+ e7);
	System.out.println("e8 = "+ e8);
	System.out.println("e9 = "+ e9);
	System.out.println("e10 = "+ e10);
	System.out.println("e11 = "+ e11);
	System.out.println("e12 = "+ e12);
	System.out.println("e13 = "+ e13);
	System.out.println("e14 = "+ e14);
	System.out.println("e15 = "+ e15);
	System.out.println("e16 = "+ e16);
	System.out.println("e17 = "+ e17);
	System.out.println("e18 = "+ e18);
	System.out.println("e19 = "+ e19);
	}
}
