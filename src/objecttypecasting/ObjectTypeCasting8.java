package objecttypecasting;

public class ObjectTypeCasting8 {
	
	class A {
		int x = 777;
	}
	
	class B extends A {
		int x = 888;
	}

	class C extends B {
		int x = 999;
	}
	
	public static void main(String[] args) {
		ObjectTypeCasting8 outer = new ObjectTypeCasting8();
		C c = outer.new C();
		
		System.out.println(c.x);        // Accesses x in C, output: 999
		System.out.println(((B)c).x);   // Casts to B, accesses x in B, output: 888
		System.out.println(((A)c).x);   // Casts to A, accesses x in A, output: 777
	}
}
