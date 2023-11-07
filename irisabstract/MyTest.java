package irisabstract;
abstract class ATM
{
    //at least one abstract method
    public abstract void deposit(int amt);

    //concrete method
    void display(){
        System.out.println("This is concrete method");
    }
}

class Child extends ATM{

    @Override
    public void deposit(int amt) {
        System.out.println(amt+ " is deposited.");
    }
}


public class MyTest {
    public static void main(String args[]){
        Child c=new Child();
        c.deposit(10000);
    }
}


