package objecttypecasting;

public class ObjectTypeCasting2 {
	
    public static void main(String[] args) {
        Object o = new String("md");

        // Method 1: Using instanceof to check before casting
        if (o instanceof StringBuffer) {
            StringBuffer sb = (StringBuffer)o;
        } else {
            System.out.println("Cannot cast String to StringBuffer");
        }

        // Method 2: Safe casting using appropriate type
        if (o instanceof String) {
            String s = (String)o;
            System.out.println("Successfully cast to String: " + s);
        }
    }
}