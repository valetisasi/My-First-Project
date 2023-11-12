package irisabstract;
interface  Sample1 {
    void test1();
}
class Demo1 implements  Sample1 {
    public void test1() {
        System.out.println("test1 implemted");

    }
}
class S1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.test1();
    }
}


