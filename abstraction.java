abstract class abstractions {
    abstract void start();
        void stop()
        {
            System.out.println("vehicle is stopping");
        }
}
class car extends abstractions
{
    @Override
    void start()
    {
        System.out.println("vehicle is start");
    }
}

public class abstraction
{
    public static void main(String[] args) {
        abstractions Car=new car();
        Car.start();
        Car.stop();
    }
}
