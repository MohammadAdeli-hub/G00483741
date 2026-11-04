package ie.atu.oop.week1;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println( "Enter Workshop details ");
        Workshop firstWorkshop = new Workshop("Java Programming", 12,"G00324321");
        Workshop secondWorkshop = new Workshop("Math for Software", 14,"G0036857");

        System.out.println(firstWorkshop.getCapacity());
    }




}