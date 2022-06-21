// Program which will reverse a String that is greater than or equal 
// to 5 chars in length. Utilizes the StringBuilder method for reverse

public class Reverse_Words {
	
	public static void main(String[] args) {
		
	System.out.println(spinWords("I'm the absolute best throughout the land!"));
	}
	public static String spinWords(String sentence) {
	    String[] words = sentence.split(" ");
	    for (int i=0; i<words.length; i++) {
	      if (words[i].length() >= 5) {
	        words[i] = new StringBuilder(words[i]).reverse().toString();
	      }
	    }
	    return String.join(" ",words);
	  }
	}
