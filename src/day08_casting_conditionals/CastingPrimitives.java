package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {

		int i = (int)3.4; // Explicit casting
		System.out.println(i);
		
		int count = 44;
		byte byteCount = (byte)count;
		
		System.out.println("ByteCount: " + byteCount);
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		
		int result = (int)(500.4 / 2.0);
		
		byte b = 123;
		int j = b; // Implicit casting
		
		
		// All int can be double, but not all double can be int
				

	}

}
