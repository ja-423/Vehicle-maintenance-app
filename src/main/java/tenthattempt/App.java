package tenthattempt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sedan ToytoaCorolla = new Sedan();
        ToytoaCorolla.Odometer = 110000;

        if(ToytoaCorolla.Odometer >= 100000)
        {
            ToytoaCorolla.CarDiagnostics.CheckEngine = true;
            System.out.println( "Time to schedule maintenance!" );

        }

    }
}
