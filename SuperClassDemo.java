// Java Program to Access Super Class in a Method 
// Overriding
class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    void sound()
    {
      
        super.sound();

        System.out.println("Dog barks");
    }
}

class SuperClassDemo
{
    public static void main(String args[])
    {
        Dog dog = new Dog();

        dog.sound();
    }
}
