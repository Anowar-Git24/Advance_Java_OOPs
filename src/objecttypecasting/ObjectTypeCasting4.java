package objecttypecasting;

public class ObjectTypeCasting4 {

	public static void main(String[] args) {
		Integer i = new Integer(10); // Creating an Integer object with value 10
		Number n = (Number) i;       // Casting Integer to Number (no actual change in the object reference)
		Object o = (Object) n;       // Casting Number to Object (again, no change in reference)

		System.out.println(i == n);  // true, because both i and n point to the same Integer object
		System.out.println(n == o);  // true, because n and o refer to the same object (the Integer instance)
		System.out.println(o == i);  // true, as o and i both refer to the same Integer instance
	}

}

