package tenthattempt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Sedan ToytoaCorolla = new Sedan();
        Scanner scanner = new Scanner(System.in);

        System.out.println( "What are the crurrent miles on your dashboard?");       
        ToytoaCorolla.Odometer = scanner.nextInt();

        if(ToytoaCorolla.Odometer >= 100000){
            ToytoaCorolla.CarDiagnostics.CheckEngine = true;
            System.out.println( "Time to schedule maintenance!");

        }
        else {
            System.out.println("Your vehicle should be good for now!");
        }

    }
}
