package Activites;
//Create a HashSet
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("Mumbai");
        hs.add("Burma");
        hs.add("Chill");
        hs.add("Agra");
        hs.add("Egg");
        hs.add("Xmas");

        //Print HashSet
        System.out.println("Original HashSet: " + hs);
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());

        //Remove element
        System.out.println("Removing Agra from HashSet: " + hs.remove("Agra"));
        //Remove element that is not present
        if(hs.remove("Zoo")) {
            System.out.println("Zoo removed from the Set");
        } else {
            System.out.println("Zoo is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if Bug is present: " + hs.contains("Bug"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}