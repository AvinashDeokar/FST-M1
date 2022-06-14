package Activites;

abstract class Book
{
    //Method
    String bktl;
    abstract void setTitle(String str);
    //Method
    String gettl()
    {
        return bktl;
    }

}

class MyBook extends Book {
    public void setTitle(String s) {
        bktl = s;
    }
}

public class Activity5 {

    public static void main(String []args) {
        String title = "Drummer the drum";
        Book newBook = new MyBook();
        newBook.setTitle(title);

        //Print result
        System.out.println("The title is: " + newBook.gettl());
    }
}


