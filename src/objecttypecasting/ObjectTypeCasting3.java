package objecttypecasting;

public class ObjectTypeCasting3 {

	public static void main(String[] args) {
		String s = new String("MD");
		Object o = (Object) s;
		System.out.println(s == o); // true, as both s and o refer to the same object
	}

}

