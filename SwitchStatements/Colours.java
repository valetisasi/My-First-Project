package SwitchStatements;
import java.util.Scanner;
public class Colours {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the colour");
        String colour=sc.next();
        switch (colour)
        {
          case "Black": System.out.println("black colour");
                  break;
            case "red": System.out.println("red colour");
                break;
            default:System.out.println("any colour");
        }

    }
}
