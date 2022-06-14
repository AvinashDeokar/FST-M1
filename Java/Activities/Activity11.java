package Activites;
//Create a HashMap named colours with integer keys and String values.

import java.util.HashMap;


public class Activity11 {
    public static void main(String[] args)
    {
        HashMap<Integer,String> myHMap = new HashMap<Integer,String>();
        myHMap.put(1, "Samsung");
        myHMap.put(2, "Moto");
        myHMap.put(3, "Nokia");
        myHMap.put(5,"Lenovo");
        myHMap.put(4,"Apple");

        System.out.println("The Hash Map is" +myHMap);

        // Remove one colour
        myHMap.remove(4);
        // Map after removing key position 4
        System.out.println("After removing key 4 position: " + myHMap);
        // Check if Rel exists
        if(myHMap.containsValue("Rel")) {
            System.out.println("Rel exists in the Map");
        } else {
            System.out.println("Rel does not exist in the Map");
        }

        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + myHMap.size());

    }

}
