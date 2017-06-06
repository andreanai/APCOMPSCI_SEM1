import java.util.*;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
            letsChat();
            //testFindKeyWord();
	}
        public static void letsChat()
        {
            Magpie2 maggie = new Magpie2();

            System.out.println (maggie.getGreeting());
            Scanner in = new Scanner (System.in);
            String statement = in.nextLine();

            while (!statement.toLowerCase().equals("bye"))
            {
                    System.out.println (maggie.getResponse(statement));
                    statement = in.nextLine();
            }
           
        }
        public static void testFindKeyWord()
        {
            Magpie2 mp2 = new Magpie2();
            ArrayList<String> tstStr = new ArrayList<>();
            System.out.println("Hello, please type your word");
            Scanner in = new Scanner(System.in);
            String strGoal = "";
            int psn = -1;
            
            
            /*
                Let's populate the test array with some strings
            */
            tstStr.add("This is a nice test string!");
            tstStr.add("Let's have some fun, ha?");
            tstStr.add("Nicenice misspelled nice nice");
            
            while (!(strGoal = in.nextLine().toLowerCase()).equals("bye"))
            {
                System.out.println("These are your test strings");
                for(String e : tstStr)
                {
                    System.out.println(e);
                }
                
                for(String e : tstStr)
                {
                    if((psn = mp2.findKeyword(e, strGoal)) >= 0)
                        System.out.println("Found standalone "+strGoal+" at position "
                        + psn + " in string "+ e);
                    else
                        System.out.println("Did not find standalone "+strGoal+" in string "+ e);
                    // lets test some other starting position 
                    if((psn = mp2.findKeyword(e, strGoal, 5)) > 0)
                        System.out.println("Found standalone "+strGoal+" at position "
                        + psn + " in string "+ e);
                    else
                        System.out.println("Did not find standalone "+strGoal+" in string "+ e);
                }
                System.out.println("What else do you want to search for?");
            }
            System.out.println("Good bye!");
            
        }
}
