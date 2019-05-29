package day24_arrays_continued;

import java.util.Calendar;

public class ToWords {

	public static void main(String[] args) {

		int year = 1919;
		int month =  12;
		int day = 31;
		

		String[] monthWords = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] numbersLessThanTen = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
				"Ten" };
		String[] numbersBetweenTenAndTwenty = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen" };
		String[] multiplesOfTen = { "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String[] yearWords = { "Hundred", "Thousand" };

		// TODO
		
		
		// This method should take a numerical date and return a date in words format
		
		String date = "";
		
		date = date + monthWords[month] + " ";
		
		if(day <= 10) {
			
			date = date + numbersLessThanTen[day] + " ";
			
		} else if(day > 10 && day < 20) {
			
			date = date + numbersBetweenTenAndTwenty[day - 10] + " ";
			
		} else {
			
			if (day < 30) date = date + multiplesOfTen[1] + " ";
			else date = date + multiplesOfTen[2] + " ";
			
			date = date + numbersLessThanTen[day % 10] + " ";
			
		}
		
		if (year - 2000 >=0) date = date + numbersLessThanTen[2] + " ";
		else date = date + numbersLessThanTen[1] + " ";
		
		date = date + yearWords[1] + " ";

		int temp = year;
	
		temp = temp % 1000;
				
		temp = temp / 100;
		
		date = date + numbersLessThanTen[temp] + " ";
		
		if(temp != 0) date = date + yearWords[0] + " ";
		
		temp = year;
		
		temp = temp % 100;
		
		temp = temp / 10;
		
		if(temp >= 2) {
			
			date = date + multiplesOfTen[temp-1] + " ";
			
			temp = year;
			
			temp = temp % 10;
			
			date = date + numbersLessThanTen[temp];
			
		} else if(temp == 1) {
			
			temp = year;
			
			temp = temp % 10;
			
			date = date + numbersBetweenTenAndTwenty[temp]; // wrong
			
		} else {
			
			temp = year;
			
			temp = temp % 10;
			
			date = date + numbersLessThanTen[temp];
			
		}

		System.out.println(date);
		
		
		
	}

	}


