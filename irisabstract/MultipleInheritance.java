package irisabstract;
interface Sample19
{
    void test19();
}
interface Sample20
{
    void test19();
}
class Demo10 implements Sample19,Sample20
{
    @Override
    public void test19() {
        System.out.println("test19 is implemented");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {


        Demo10 demo10 = new Demo10();
        demo10.test19();
    }
}

