package Activites;
//implementing Hybrid Inheritance (Multiple and Simple)
//creating two interfaces - BicycleParts and BicycleOperations
interface BicycleParts
{
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations
{
    public void applyBrake(int dec);
    public void speedUp(int inc);
}

//Create Base class that implements interface
class Bicycle implements BicycleParts, BicycleOperations
{
    public int gears;
    public int currentSpeed;
    public Bicycle(int gears, int currentSpeed)
    {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
//Define the applyBrake() and speedUp()
    public void applyBrake(int dec)
    {
        currentSpeed -=dec;
        System.out.println("Current Speed is "+currentSpeed );
    }
    public void speedUp(int inc)
    {
        currentSpeed +=inc;
        System.out.println("Current Speed is "+currentSpeed);
    }
    public String bicycleDesc()
    {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

//Define Derived Class
class MountainBike extends Bicycle
{
    public int seatHeight;

// Constructor of Subclass MountainBike
    public MountainBike (int gears, int currentSpeed, int startHeight)
    {
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    public String bicycleDesc()
    {
        return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
    }
}
public class Activity7
{
    public static void main(String args[])
    {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
