package overloadedmethod;

public class NorelationParentChildMethod {
	class Test {
		public void m1 (String s) {
			System.out.println("String Version");
		}
		
		public void m1 (StringBuffer sb) {
			System.out.println("StringBuffer Version");
		}
	}
	
	public static void main (String [] args) {
		Test t = new NorelationParentChildMethod().new Test();
		t.m1("Hossain");                       // String Version
		t.m1(new StringBuffer("Hossain"));      // StringBuffer Version
		// t.m1(null);                            // Ambiguity error
	}
}
