// @author Joseph Walker

// This problem solving program demonstrates how to capitalize String phrases

public class Capitalization {
	
public static void main(String[] args) {
	
// Create a String array which will hold the input String, which calls the 
// split method	

	String phrase = "this is to be title capitalized!";
    String[] splitPhrase = phrase.split(" ");
    String result = "";

// Use an enhanced for loop to traverse String array
// Increment result variable, while adding to it our "word" iterator
// which is passes as an argument through the toTitleCase method that
// does the grunt work of capitalizing each 0 index of our String.
    
    for(String word: splitPhrase){
        result += firstCap(word) + " ";
    }
    System.out.println(result.trim());
	
  }

// Method which passes a String as arg. Returns the first char as capitalized
// by calling the .toUpperCase method utilizing the char wrapper class Character

public static String firstCap(String word){
    return Character.toUpperCase(word.charAt(0)) + word.substring(1);
	
}

}