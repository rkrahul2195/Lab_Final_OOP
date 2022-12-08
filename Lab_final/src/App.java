import java.util.Scanner;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        IFIC a = new IFIC();
        SB b = new SB();
        // a.GetIntrestRate(12);
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter The Intrest Rate: ");
            double rate = myObj.nextInt();
            System.out.println("Enter The  Month: ");
            double time = myObj.nextInt();
            
            a.GetIntrestRate(rate);
            b.GetIntrestRate(rate, time);
        }

    }
}
