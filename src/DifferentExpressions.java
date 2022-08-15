
public class DifferentExpressions {
	public static void main(String [] args) {
		double f;
		f = (9 * 100) / 5 + 32 ;
		
		System.out.println("f="+f);
		int n;
		n = (100 + 10)/2 ;
		System.out.println("n="+n);
		
		boolean fin;
		fin = (n < 60) ;
		System.out.println("fin="+fin);

		boolean interval = fin && (n > 20) ;
		System.out.println("interval="+interval);
		
		String  s;
		s = "Number "+ n + " is integer" ;

		System.out.println(s);
		
		char c = 80; //char is a 16 bits unsigned integer: from 0 to 2^16
		System.out.println(c);
		
		
	}
}
