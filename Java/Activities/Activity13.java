package Activites;
//accept number inputs from the console using Scanner class and store them in an array
import java.util.*;

public class Activity13 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random Rad = new Random();

        System.out.println("Pls enter Integer and give Non integer to stop entering");

        //Get the list Integer elements  break at noninteger
        while (scan.hasNextInt())
        {
            list.add(scan.nextInt());
        }
// Display the list Elements
        for (Integer S:list)
        {
            System.out.println(S);
        }
        Integer num[] = list.toArray(new Integer[0]);
        int index = Rad.nextInt(num.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + num[index]);

        scan.close();
    }
}
