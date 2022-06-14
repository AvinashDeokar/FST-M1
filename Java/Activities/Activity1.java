package Activites;

public class Activity1 {
    public static void main(String [] args)
    {
        Car Audi = new Car();
        Audi.make= 2022;
        Audi.color = "Steel Gray";
        Audi.Transmission = "Automated";

        Audi.displayCharacteristics();
        Audi.accelarate();
        Audi.brake();
    }
}
