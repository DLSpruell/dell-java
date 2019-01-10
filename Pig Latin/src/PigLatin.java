
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		System.out.println("Hello!");

		System.out.println("Please give me an English word to translate...");
		Scanner reader = new Scanner(System.in);
		String newWord = reader.nextLine(); // created variable newWord to save the users word to
		String newWord2 = newWord.toLowerCase(); //change all letters to lower case for the word
		change(newWord2); // function name for checking if it starts with a consonant
		
		reader.close();

	}

	
	public static void change(String newWord2) {
		
		char first = newWord2.charAt(0);
				
		if (newWord2.startsWith("a") || newWord2.startsWith("e") || newWord2.startsWith("i") || newWord2.startsWith("o") || newWord2.startsWith("u")) { //if the word starts with a vowel, print out the following
			System.out.println("The translation in Pig Latin is "+ newWord2 +"yay!"); 
		} else if (newWord2.contains("a") || newWord2.contains("e") || newWord2.contains("i") || newWord2.contains("o") || newWord2.contains("u")) //if the word contains a vowel, print out the following
			{newWord2 = newWord2.substring(1);
			newWord2 += first + "ay";
			System.out.println("The translation in Pig Latin is " + newWord2+"."); 
		} else { System.out.println("The translation in Pig Latin is " + newWord2 + "ay."); }	//if the word doesn't start with or contain a vowel, print out the following		
		
	}
	
}

