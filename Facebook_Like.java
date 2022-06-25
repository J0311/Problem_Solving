// You probably know the "like" system from Facebook and other pages. 
// People can "like" blog posts, pictures or other items. We want to create 
// the text that should be displayed next to such an item.Implement the function 
// which takes an array containing the names of people that like an item.


public class Facebook_Like {

	public static void main(String[] args) {
		
		String [] nameLike = {"Tom"};
		String [] nameLike2 = {"Tom", "Paul", "Amy", "Phyllis","Matt", "Reginald"};
		String [] nameLike3 = {"Pete", "Patricia"};
		
// Testing our function with 3 input String arrays:
		
		System.out.println(whoLikesIt(nameLike));
		System.out.println(whoLikesIt(nameLike2));
		System.out.println(whoLikesIt(nameLike3));

	}

// Using an ellipsis (...) to take in various String arguments
	
	public static String whoLikesIt(String...names  ) {
		
		if (names.length == 0) {
	        return "no one likes this";
		}
		else if (names.length == 1) {
	        return names[0] + " likes this";
	    }
		else if (names.length == 2) {
	        return names[0] + " and " + names[1] + " like this ";
		}
	    else if (names.length == 3) {
	        return names[0] + ", " + names[1] + " and " + names[2] + " like this ";
	    }
	    else if (names.length >= 4) {
	        return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this ";
	    }
		return null;
	}
}
