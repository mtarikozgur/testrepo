package day28_fast_food;

import java.util.*;

public class Loop2DArrays {

	public static void main(String[] args) {

		String[][] pizzas = {
					
				{"pineapple", "pepperoni"},
				{"anchovies", "mushrooms", "olives"}, 
				{"4 cheese"},
				{"cihcken", "tomatoes", "jalapenos", "onions"},
				{"peppers", "zuccini", "brocolli", "spinach", "shrimp"}
				
		};
		
		for(String[] pizza: pizzas) { // For every array "pizza" in the array "pizzas" do the following
			
			System.out.print(pizza.length + " - ");
			System.out.println(Arrays.toString(pizza));
			
		}
		
		int[][] students = {
				
				{4,5,6},
				{12,5,7},
				{23,56,12,55,3}
				
		};
		
		for(int[] group: students) { // Using nested "for each" loops to print the elements in "students"
			
			for(int student: group) {
				
				System.out.print(student + "  ");
				
			}
			
			System.out.println();
			
		}
		
		int[][] nums = { {10, 20}, {20, 30, 40, 50}, {100, 200, 400}, {555, 333, 111, 444, 666, 78} }; 
		
		for(int i = 0; i < nums.length; i++) { // Using nested "for" loops to print the elements in "nums"
			
			for(int j = 0; j < nums[i].length; j++) {
				
				System.out.print(nums[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
