package day20_for_loops;

public class EvenOrOdd {

	public static void main(String[] args) {

		int sumOdd = 0, sumEven = 0;
		
		for(int n = 1; n <= 100; n++) {
			if(n % 2 == 0) { 
				System.out.print(n + " ");
				sumEven += n;
				}
		}
		
		System.out.println();
		
		for(int n = 1; n <= 100; n++) {
			if(n % 2 != 0) { 
				System.out.print(n + " ");
				sumOdd += n;
				}
		}
		
		System.out.println();
		System.out.println(sumOdd);
		System.out.println(sumEven);
		
		
	}

}
