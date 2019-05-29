package day33_methods5;

public class PayCalculator {

	public static void main(String[] args) {

		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: " + pay);
		
	}
	
	public static int getHourlyPay(int hours, int rate) {
		
		if(hours <= 0) {
			
			System.out.println("Invalid hours");
			return 0;
			
		}
		
		if(rate <= 0) {
			
			System.out.println("Invalid rate");
			return 0;
			
		}
		
		int totalPay = hours * rate;
		return totalPay;
		
	}

}
