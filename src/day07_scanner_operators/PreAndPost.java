package day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		
		// n++ = run the line, then increment n by 1
		// ++n = increment n by 1, then run the line
		
		int num = 0;
		int num2 = num++; // Assigns value of num to num2, THEN increases value of num by 1
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2); // Since num was 0 when it was assigned to num2 this prints 0
		
		
		int n = 0;
		int n2 = ++n; // Increments the value of n by 1, THEN assigns that value to n2
		
		System.out.println("n: " + n);
		System.out.println("n2: " + n2); // Since n had its value incremented before it was assigned to n2 this prints 1
		
		
		int apples = 4;
		int pears = apples++;
		
		System.out.println(apples);
		System.out.println(pears);
		
		apples = 5;
		pears = ++apples;
		
		System.out.println(pears);
		System.out.println(pears);
		
		
		int friends = 10;
		System.out.println(friends++);
		
		int enemies = 10;
		System.out.println(++enemies);
		
		
		int p1 = 10;
		int sum = p1++ + 5;
		
		
		int f = 100;
		
		int g = f++;
		// int g = f
		// f = f + 1
		
		f = 100;
		
		g = ++f;
		// f = f + 1
		// g = f
		
		int count = 21;
		int myCount = count++ + ++count;
		
		System.out.println("count: " + count);
		System.out.println("myCount: " + myCount);
		
		
		
		
		
				
		
		
		
		
		

	}

}
