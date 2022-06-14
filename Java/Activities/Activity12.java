package Activites;
//creating a functional interface and use it with a lambda expression. Scanner
import java.util.Scanner;
interface Addable
{
    int add(int a, int b);
}
public class Activity12
{
    public static void main(String[] args)
    {
        Addable ad1 = (a, b)->(a+b);
        System.out.println(ad1.add(11, 22));
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(122, 211));
    }
}
