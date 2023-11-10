package Oops;
/*
# Encapsulation :
- Encapsulation in Java is a mechanism in which we are Wrapping the data and method together into a single unit.

### In Java why it is required ?
- By default it is always there.
- To achieve encapsulation in java we make data member as private and provide getter setter to view and modify the data.
- if we don't make it private than anybody can add any value on it to restrict we made private.



 */
public class Encapsulation {
    public static void main(String[] args) {
        Car car=new Car();
        car.setSpeed(-45);
        System.out.println(car.getSpeed());
    }
}

class Car
{
    private int speed;
    public void setSpeed(int sp)
    {
        if (sp>500)
        {
            speed=sp;
        }
    }
    public int getSpeed()
    {
        return speed;
    }
}
