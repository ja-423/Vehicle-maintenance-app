package tenthattempt;
import java.util.Scanner;

import tenthattempt.TypesOfVehicles.Sedan;

public class App 
{
    public static void main( String[] args )
    {
        Sedan ToytoaCorolla = new Sedan();
        Scanner scanner = new Scanner(System.in);

        System.out.println( "What are the crurrent miles on your dashboard?");       
        ToytoaCorolla.Dashboard.Odometer = scanner.nextInt();
        
        if(ToytoaCorolla.Dashboard.Odometer >= 100000){
            ToytoaCorolla.Diagnostics.CheckEngine = true;
            System.out.println( "Time to schedule maintenance!");
            System.out.println( ToytoaCorolla.Dashboard.Odometer);

        }
        else {
            System.out.println("Your vehicle should be good for now!");
        }

    }
}


/*
 * Things to do:
 * Begin the UI
 * Authorization and authentication for signin and login
 * How and what do use store the information of a user
 */