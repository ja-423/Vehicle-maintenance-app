package tenthattempt;
import java.util.Scanner;
import tenthattempt.TypesOfVehicles.Sedan;

public class App 
{
    public static void main( String[] args )
    {
        Sedan ToytoaCorolla = new Sedan();
        Scanner scanner = new Scanner(System.in);
        int userOdometer;
        String userIssueSummary;
        String workToBeDone;
        String partsUserMentioned; //TODO: read this string input for keywords Ex Brakes, struts, axels, Caliper

        System.out.println( "What are the crurrent miles on your dashboard?");
        userOdometer = Integer.parseInt(scanner.nextLine());
        ToytoaCorolla.Dashboard.setOdometer(userOdometer);
        System.out.println("Current Millage: " + userOdometer);

        System.out.println( "Were you hearing or seeing any issues with the vehicle?");
        userIssueSummary = scanner.nextLine();
        System.out.println("User reported: " + userIssueSummary);

        System.out.println( "What work needs to be done to the vehicle?");
        workToBeDone = scanner.nextLine();
        System.out.println("Current Job includes: " + workToBeDone);

        System.out.println( "What parts are being changed?");
        partsUserMentioned = scanner.nextLine();
        System.out.println("Parts that are being changed: " + partsUserMentioned);
/*      TODO:System.out.println( "Did you have any receipts you wanted to add?"); */
        
        if(ToytoaCorolla.Dashboard.getOdometer() >= 100000){
            ToytoaCorolla.Diagnostics.setCheckEngine(true);
            System.out.println( "Time to schedule maintenance!");
            System.out.println( ToytoaCorolla.Dashboard.getOdometer());
            
        }
        else {
            System.out.println("Your vehicle should be good for now!");
        }
        
        scanner.close();
    }
}


/*
 * Things to do:
 * Begin the UI
 * Authorization and authentication for signin and login
 * How and what do use store the information of a user
 */