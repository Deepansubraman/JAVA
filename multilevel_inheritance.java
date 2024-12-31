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
class cat extends Dog{
    void cat_eat()
    {
        System.out.println("cat can't eat you.");
    }
}

public class multilevel_inheritance{
public static void main(String args[])
{
    cat c=new cat();
    c.dog_eat();
    c.eat();
}
}
