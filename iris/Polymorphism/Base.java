package iris.Polymorphism;
public class Base {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double y) {
        return a + y + 100;
    }

    public static void main(String args[]){

        Base b=new Base();
        b.add(100,200);
        b.add(55.6,999.9);
        b.add(45,75,95);

    }

}


