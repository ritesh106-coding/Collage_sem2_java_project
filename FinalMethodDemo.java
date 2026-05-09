class Parent
{
    final void show()
    {
        System.out.println("This is final method");
    }
}

class Child extends Parent
{

}

class FinalMethodDemo
{
    public static void main(String args[])
    {
        Child obj = new Child();

        obj.show();
        obj.display();
    }
}
