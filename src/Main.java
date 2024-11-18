import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String partyAffiliation = "";
        // Create a scanner and read in the party affiliation

        System.out.println("Enter your party affiliation[RDI]: ");
        if (console.hasNextLine())
        {
            partyAffiliation = console.nextLine();
            if (partyAffiliation.equalsIgnoreCase("R"))
            {
                System.out.println("You get a Republican Elephant");
            }
            else if (partyAffiliation.equalsIgnoreCase("D"))
            {
                System.out.println("You get the Democratic Donkey");
            }
            else if (partyAffiliation.equalsIgnoreCase("I"))
            {
                System.out.println("You get an Independent Man");
            }
            else
            {
                System.out.println("I don't know what party you belong to.");
            }

        }
    }
}