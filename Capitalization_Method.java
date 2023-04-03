//@author Joseph 

// This is the same concept as our program which capitalizes a String phrase.
// However, this class is more concise and compresses functionality into a
// single method

public class Capitalization_Method {
	
	public static void main(String[] args) {
		
		System.out.println(toCapCase("I love this game!"));
		
	}
	
// Our toCapCase method is the heart of everything
// We pass the String "phrase", ensuring if String is null or
// empty, we return null. 
	
	public static String toCapCase(String phrase) {
      if (phrase == null || phrase.isEmpty()) {
        return null;
        }
      
// If String is not empty or null, we create a separate String
// variable. Second, we create a String array which holds our
// phrase being passed while simultaneously calling .split() 
      
    String result = "";
    String[] splitString = phrase.split(" ");
    
// Our enhanced for loop traverses through String array, calling the 
// built-in .toUpperCase method in conjunction with char wrapper class
// Character. 
    
    for(String target : splitString){
        result += Character.toUpperCase(target.charAt(0))
                + target.substring(1) + " ";
    }
    
// Trim any excess space with built-in trim method
    
    return result.trim();
}

    }
