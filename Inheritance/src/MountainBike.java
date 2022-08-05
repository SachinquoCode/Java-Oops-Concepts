public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startSpeed, int startGear)// constructor method use for initialize objects
    {
        super(startSpeed,startGear); // super reference variable that is used to refer parent class constructors
        this.seatHeight = startHeight;
    }
}
