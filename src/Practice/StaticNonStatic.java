package Practice;

public class StaticNonStatic {

	static int a = 10;
	
	int b = 20 ;
	
	public static void method1() {

		System.out.println("I am Static method in class one");

	}

	public void method2() {

		System.out.println("I am Non Static method in class one");

	}

	
	public static void main(String[] args) {
		
		
		StaticNonStatic.method1();
		
		StaticNonStatic obj = new StaticNonStatic();
		
		obj.method2();
		
		
		
		System.out.println(StaticNonStatic.a);
		
		System.out.println(obj.b);
		
		System.out.println(obj.a);
		
	}
}
