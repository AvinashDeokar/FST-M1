package Activites;

public class Car {
    String color;
    String Transmission;
    int make;
    int tyre;
    int doors;

    Car()
    {
        tyre =4;
        doors =4;
    }
    public void displayCharacteristics()
    {
        System.out.println("Car color is "+ color);
        System.out.println("car Transmission is "+ Transmission);
        System.out.println("Car Make is "+make);
        System.out.println("Car Tyre is "+tyre);
        System.out.println("Car Doors is "+doors);
    }
    public void accelarate()
    {
        System.out.println("Car is moving forward.");
    }
    public void brake()
    {
        System.out.println("Car has stopped.");
    }
}
