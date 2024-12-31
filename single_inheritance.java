class Animal extends Object {
    void eat()
    {
        System.out.println("girivasan eats you.");
    }
}
class Dog extends Animal{
    void dog_eat()
    {
        System.out.println("dog can't eat you.");
    }
}

public class single_inheritance{
public static void main(String args[])
{
    Dog d=new Dog();
    d.eat();
}
}
