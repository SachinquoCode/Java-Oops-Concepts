public class Bicycle {
     /*
        Description:
            This class is writing for variable and attributes to set
      */
    protected int gear;
    protected int speed;
    public Bicycle(int startSpeed, int startGear) // constructor method use for initialize objects
    {
        gear = startGear;
        speed = startSpeed;
    }
    public void setGear(int newValue){

        gear = newValue;
    }
    public void applyBrake(int decrement){

        speed -= decrement;
    }
    public void speedUp(int increment){

        speed += increment;
    }
}
