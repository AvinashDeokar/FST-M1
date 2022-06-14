package Activites;
//Create an ArrayList
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args)
    {
        ArrayList<String> MyList = new ArrayList<String>();
        MyList.add("JAVA");
        MyList.add("Python");
        MyList.add("Selinum");
        MyList.add(1, "Cake");
        MyList.add(3,"Cucumber");

        System.out.println("Printing all array elements");
        for (String S:MyList)
        {
            System.out.println(S);
        }

        System.out.println("3rd element in the list is: " + MyList.get(2));
        System.out.println("Is Mainframe is in list: " + MyList.contains("mainframe"));
        System.out.println("Is Cake is in list: " + MyList.contains("Cake"));
        System.out.println("Size of ArrayList: " + MyList.size());

        MyList.remove("Cake");

        System.out.println("New Size of ArrayList: " + MyList.size());


    }
}
