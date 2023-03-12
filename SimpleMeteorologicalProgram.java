// -------------------------------------------------------
// Assignment 1
// For COMP 248 Section 2222-R – Fall 2022
// --------------------------------------------------------
// Opening the scanner so that the user can input using his keyboard
import java.util.Scanner;

public class A1_Q2 {
	
	public static void main(String[] args) {
		// ********************************************************************
		// This project allows the user to convert temperatures from degrees
		// Celcius to Fahrenheit, and vice versa, and x and y values such
		// ********************************************************************
		Scanner keyIn = new Scanner (System.in);
		// Prompting a message to welcome the user and to input his/her values
		System.out.println("Hello user, welcome to the Simple Meteorological Program." );
		System.out.print("Please enter the values for 'Fahrenheit' and 'Celcius'"
				+ " scale, simultaneously: ");
		// Identifying what the values entered by the user represent, variable Fahrenheit and Celcius
		int Fahrenheit = keyIn.nextInt();
		int Celcius = keyIn.nextInt();
		// Identifying new variables and their formulas for conversion
		double newCelcius = (double) 10 / 18 * (Fahrenheit - 32);
		double newFahrenheit = (double) Celcius * 18 / 10 + 32;
		// Printing the results
		System.out.println("The corresponding tempeture in Celcius unit is: " + newCelcius );
		System.out.println("The corresponding tempeture in Fahrenheit unit is: " + newFahrenheit );
		// Identifying new variables to have rounded up values of both degrees,needed for finding the right remainder
		double roundFahrenheit = Math.round(newFahrenheit);
		double roundCelcius = Math.round(newCelcius);
		double x = (int) roundFahrenheit % (int) roundCelcius;
		double y = Math.pow(newFahrenheit,newCelcius);
		// Displaying the x and y values
		System.out.println("The corresponding for x is: " + x);
		System.out.println("The corresponding for y is: " + y);
		System.out.println("\nThank you for using my bespoke Meteorological program!");
		keyIn.close();
		}
	}
