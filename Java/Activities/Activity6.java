package Activites;
//implementation of Encapsulation.
import java.util.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


    class Plane
    {
        private List<String> passengers;
        private int maxPassengers;
        private Date lastTimeTookOf;
        private Date lastTimeLanded;
//Add a constructor that initializes the values of maxPassengers and the array passengers to an empty array.
        public Plane(int maxPassengers)
        {
            this.maxPassengers = maxPassengers;
            this.passengers = new ArrayList<>();
        }

//Add the methods to the Plane class
    public void onboard(String passenger)
    {
    this.passengers.add(passenger);
    }

        public Date takeOff()
        {
            this.lastTimeTookOf = new Date();
            return lastTimeTookOf;
        }

        public void land()
        {
            this.lastTimeLanded = new Date();
            this.passengers.clear();
        }

        public Date getLastTimeLanded()
        {
            return lastTimeLanded;
        }

        public List<String> getPassengers()
        {
            return passengers;
        }
    }

public class Activity6
{
    public static void main(String[] args) throws InterruptedException
    {
//Create object and give Max Array Value
     Plane plane = new Plane(10);
// Add Passenger
     plane.onboard("Arush");
     plane.onboard("Brush");
     plane.onboard("Crush");
     plane.onboard("Drush");
     System.out.println("Plane took off at: " + plane.takeOff());
//Print list of people on board
     System.out.println("People on the plane: " + plane.getPassengers());
     Thread.sleep(5000);
//Plane has landed
    plane.land();
//Plane lands
    System.out.println("Plane landed at: " + plane.getLastTimeLanded());
    System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
//End of Class Activity6
}
