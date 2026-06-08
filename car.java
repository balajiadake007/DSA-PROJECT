public class car 
{
    String name;
    String Model;
    String color;
    int speed;

    void drive()
    {
        System.out.println("Car is driving");
    }

    public static void main(String[] args)
    {
        car c1 = new car();

        c1.name = "BMW";
        c1.Model = "M5";
        c1.color = "Black carbon fibre";
        c1.speed = 169;

        System.out.println(c1.name);
        System.out.println(c1.Model);
        System.out.println(c1.color);
        System.out.println(c1.speed);
        
        c1.drive();

    }
}
