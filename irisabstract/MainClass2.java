package irisabstract;
abstract  class  Father
{
    abstract  public  void  house();
}
class Son extends Father
{
    public  void house()
    {
        System.out.println("house is completed");
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Father father =new Son();
        father.house();

            }
        }


