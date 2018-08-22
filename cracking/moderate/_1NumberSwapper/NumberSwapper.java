package _1NumberSwapper;

//swap two numbers without using temp
class NumberSwapper{
	
	static void swapper(int a, int b) {	
		System.out.println("value of a: "   + a);
		System.out.println("value of b: "  + b);
		a = a^b;
		b = a^b;
		a= a^b;
		
		System.out.println("value of a after swap : "   + a);
		System.out.println("value of b after swap : "  + b);
	}
}