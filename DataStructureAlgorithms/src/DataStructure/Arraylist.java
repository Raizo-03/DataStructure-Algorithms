package DataStructure;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(9);
		
		
		arr.add("Ejay"); // Adds something to the arraylist
		arr.add("hi");
		arr.add("hii");
		
		boolean isTrue = arr.contains("hi"); //Checks if the system contains the value; returns true/false
		String i = arr.get(1); // returns the value on the specified index
		int j = arr.size(); // returns the size of the arraylist
		arr.clear(); // clears the elements inside the ArrayList
		System.out.println(j);
	}

}
