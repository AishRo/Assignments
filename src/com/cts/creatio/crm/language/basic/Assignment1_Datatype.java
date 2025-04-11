package com.cts.creatio.crm.language.basic;

public class Assignment1_Datatype {

	public static void main(String[] args) {
		// 1. Temperature of a city in degrees Celsius: 25.5
		float temp = 25.5f;
		System.out.println("1. Temperature of a city in degrees Celsius: "+temp);
		
		//2. Whether a customer has placed an order: true or false
		boolean orderPlaced = true;
		System.out.println("2. Whether a customer has placed an order: "+orderPlaced);
		
		//3. Person's phone number: "123-456-7890"
		String phoneno = "123-456-7890";
		System.out.println("3. Person's phone number: "+phoneno);
		
		//4. Amount of money in a customer's bank account: 1000.50
		float money=1000.50f;
		//System.out.println("4. Amount of money in a customer's bank account: " +money);
		System.out.printf("4. Amount of money in a customer's bank account: %.2f",money);
		System.out.println();
		
		//5. Person's email address: "john.doe@example.com"
		String mailid = "john.doe@example.com";
		System.out.println("5. Person's email address: "+mailid);
		
		//6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double latitude = 37.7749;
		double longitude = -122.4194;
		System.out.println("6. Coordinates of a location (latitude, longitude): "+latitude +", " +longitude);
		
		//7. Person's marital status: true or false
		boolean married = true;
		System.out.println("7. Person's marital status: "+married);
		
		//8. Person's occupation: "Software Engineer"
		String occupation = "Software Engineer";
		System.out.println("8. Person's occupation: "+occupation);

		//9. Person's favourite colour: "Blue"
		String color = "Blue";
		System.out.println("9. Person's favourite colour: "+color);
		
		//10.Current year: 2023
		int year =2023;
		System.out.println("10.Current year: "+year);
		
		//11.Number of followers on a social media platform: 1,000,000
		String followers= "1,000,000";
		System.out.println("11.Number of followers on a social media platform: "+followers);
		//double followers1 = 1000000;
		
		//12.Rating of a movie: 7.5
		float rating =7.5f;
		System.out.println("12.Rating of a movie: "+rating);
		
		//13.Person's blood type: 'A'
		char bType = 'A';
		System.out.println("13.Person's blood type: "+bType);
		
		//14.Title of a book: "To Kill a Mockingbird"
		String book = "To Kill a Mockingbird";
		System.out.println("14.Title of a book: "+book);
		
		//15.Number of employees in a company: 500
		int emp =500;
		System.out.println("15.Number of employees in a company: "+emp);
		
		//16.Time of an event: 2:30 PM
		String time = "2:30 PM";
		System.out.println("16.Time of an event: "+time);
		
		//17.Name of a country: "United States"
		String country = "United States";
		System.out.println("17.Name of a country: "+country);
		
		//18.Person's eye color: "Brown"
		String color1 = "Brown";
		
		//19.Person's birthplace: "New York City"
		String birthPlace = "New York City";
		System.out.println("19.Person's birthplace: "+birthPlace);
		
		//20.Distance between two cities: 200.5
		float dist = 200.5f;
		System.out.println("20.Distance between two cities: "+dist);

	}

}
