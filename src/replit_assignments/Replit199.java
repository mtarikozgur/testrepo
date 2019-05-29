package replit_assignments;

import java.util.ArrayList;

public class Replit199 {

	public static void main(String[] args) {

		ArrayList<Boolean> booleans = new ArrayList<>();

		booleans.add(true);
		booleans.add(false);
		booleans.add(false);

		repeatAL(booleans);

	}

	public static void repeatAL(ArrayList<Boolean> values) {

		int n = values.size();
		
		for(int i = 0; i < n; i++) {
			
			values.add(values.get(i));
			
		}

	//	System.out.println(values);

	}

}
