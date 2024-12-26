package com.creatio.crm.assignments.basics;

public class DataType_aasignmt {

	public static void main(String[] args) {
        // Temperature of a city in degrees Celsius: 25.5
		// 25.5 is a decimal number with a lesser precision ,so we can store it in a float.
		float temperature = 25.5f;
		System.out.println("Temperature of a city in degrees Celsius: " + temperature);
		
		//Whether a customer has placed an order: true or false
		// A boolean data type is appropriate for storing true/false condition
		
		boolean Order = true;
        System.out.println("Customer  placed an order: " + Order);
        
        // Person's phone number: "123-456-7890"
        // Phone numbers are best stored as strings to preserve formatting.
        
        String ph_Number = "123-456-7890";
        System.out.println("Person's phone number: " + ph_Number);
        	
        //Amount of money in a customer's bank account: 1000.50
        //double data type is used to store higher precision values
        

        double bankBalance = 1000.50;
        System.out.println("Amount of money in a customer's bank account: " + bankBalance);
        
        // Person's email address: "john.doe@example.com"
        // Email fields accept strings as they are in textual format.
        String emailAddress = "john.doe@example.com";
        System.out.println("Person's email address: " + emailAddress);
        
       // Coordinates of a location (latitude, longitude): 37.7749, -122.4194
       // Coordinates are stored as doubles to maintain precision.
        double latitude = 37.7749;
        double longitude = -122.4194 ;
        System.out.println("Coordinates of a location (latitude, longitude):" + latitude + longitude );
         
       // Person's marital status: true or false
       // A boolean type is ideal to store marital status .
        
        boolean married = false;
        System.out.println("Person's marital status: " + married);
        
        // Person's occupation: "Software Engineer"
        // Occupations are strings as they contain text.
        String occupation = "Software Engineer";
        System.out.println("Person's occupation: " + occupation);
        
        // Person's favColour: "Blue"
        // Colour value is in text,so stored as strings.
        String favColour = "Blue";
        System.out.println("Person's favourite colour: " + favColour);
        
        // Current year: 2023
        // year is an 	integer.
        int currentYear = 2023;
        System.out.println("Current year: " + currentYear);
        
        // Number of followers on a social media platform: 1,000,000
        // Large numbers are stored as integers.

        int followers = 1000000 ;
        System.out.println("Number of followers on a social media platform:" + followers);
        
        // Rating of a movie: 7.5
        // Decimal 7.5 has lesser precision so stored as float.
        float movieRating = 7.5f;
        System.out.println("Rating of a movie: " + movieRating);
        
        // Person's blood type: 'A'
        // Blood type is having a single character so stored as char.
        char bloodType = 'A' ;
        System.out.println("Person's blood type:" + bloodType );
        
        // Title of a book: "To Kill a Mockingbird"
        // Book titles are in text format, so its string datatype.
        String bookTitle = "To Kill a Mockingbird";
        System.out.println("Title of a book: " + bookTitle);
        
        // Number of employees in a company: 500
        // Number of employees is an integer .
        int numberOfEmployees = 500;
        System.out.println("Number of employees in a company: " + numberOfEmployees);
        
        // Time of an event: 2:30 PM
        // Time is stored as a string for simplicity.
        String eventTime = "2:30 PM";
        System.out.println("Time of an event: " + eventTime);
        
        // Name of a country: "United States"
        // Country name is in text, so use string.
        String countryName = "United States";
        System.out.println("Name of a country: " + countryName);

        // Person's eye color: "Brown"
        // Eye color is textual data, so use a string.
        String eyeColor = "Brown";
        System.out.println("Person's eye color: " + eyeColor);

        // Person's birthplace: "New York City"
        // Birthplace is textual data, so use a string.
        String birthplace = "New York City";
        System.out.println("Person's birthplace: " + birthplace);

        // Distance between two cities: 200.5
        // Distance is a decimal form, so can store as a float or double.
        float distanceBetweenCities = 200.5f;
        System.out.println("Distance between two cities: " + distanceBetweenCities);

        
        	
        
        

        
        
        
        
        
        
 
        
        

		
	}

}
