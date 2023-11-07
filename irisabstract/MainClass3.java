package irisabstract;
abstract  class Exam
{
    abstract public  void result1();
    abstract public  void  result2();
}
class Test extends Exam
{
    @Override
    public void result1() {
        System.out.println("result are good");
    }

    @Override
    public void result2() {
        System.out.println("result are bad");
    }
}
public class MainClass3 {
    public static void main(String[] args) {
        Test test = new Test();
        test.result1();
        test.result2();
    }
}
