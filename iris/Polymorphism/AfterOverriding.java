package iris.Polymorphism;
class  Shape {
    public void fill() {
        System.out.println("fill with blue color");
    }

    public void Outline() {
        System.out.println("outline thickness is 1mm");
    }
}
class Pentagon extends  Shape {
    public void fill() {
        System.out.println("fill with Orange color");
    }

}
class Plus extends  Shape
{
    public void outline()
    {
        System.out.println("outline thickness is 3mm");
    }
}
public class AfterOverriding {
    public static void main(String[] args) {
        Shape s;
        s=new Pentagon();
        s.fill();
        s.Outline();
        s =new Plus();
        s.fill();
        s.Outline();
    }
}
