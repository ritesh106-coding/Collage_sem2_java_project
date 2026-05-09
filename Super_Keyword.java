class Animal
{
    String name = "Animal";
}

class Dog extends Animal
{
    String name = "Dog";

    void show()
    {
        System.out.println("Parent class name = " + super.name);
        System.out.println("Child class name = " + name);
    }
}

class Main
{
    public static void main(String args[])
    {
        Dog obj = new Dog();

        obj.show();
    }
}
