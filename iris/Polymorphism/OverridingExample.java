package iris.Polymorphism;
class Parent{
    void display(){
        System.out.println("Parent class method");
    }
}
class Child extends Parent{
    @Override //annotation
    void display()
    {
        System.out.println("Child class method");
    }

}
class Child2 extends Parent{
    @Override //annotation
    void display()
    {
        System.out.println("Child 2 class method");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Parent p;

        //create object for child class using parent class
        p=new Child();
        p.display();
        p=new Child2();
        p.display();



    }

}



