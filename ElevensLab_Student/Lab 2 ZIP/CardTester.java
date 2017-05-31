/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            Card c1 = new Card("Ace","Spades",11);
            Card c2 = new Card("King","Hearts",10);
            Card c3 = new Card("Eight","Diamonds",8);
            Card c4 = new Card("Ace","Spades",11);
            
            //test accessors
            System.out.println("Card 1 is the "+c1.rank()+" of "+ c1.suit()+". Point value: "+c1.pointValue());
            System.out.println("Card 1 toString ==> "+c1.toString());
            System.out.println("Card 2 is the "+c2.rank()+" of "+ c2.suit()+". Point value: "+c2.pointValue());
            System.out.println("Card 2 toString ==> "+c2.toString());
            System.out.println("Card 3 is the "+c3.rank()+" of "+ c3.suit()+". Point value: "+c3.pointValue());
            System.out.println("Card 3 toString ==> "+c1.toString());
            System.out.println("Card 4 is the "+c4.rank()+" of "+ c4.suit()+". Point value: "+c4.pointValue());
            System.out.println("Card 4 toString ==> "+c4.toString());
            //test equality
            if(c1.matches(c4))
                System.out.println("Cards match ("+c1.toString()+","+c4.toString()+")");
            else
                System.out.println("Cards DO NOT match ("+c1.toString()+","+c4.toString()+")");
            if (c3.matches(c2))
                System.out.println("Cards match ("+c3.toString()+","+c2.toString()+")");
            else
                System.out.println("Cards DO NOT match ("+c3.toString()+","+c2.toString()+")");
            
            testCardRank();
	}
        public static void testCardRank()
        {
            Card c1 = new Card("Ace", "Spades", 11);
            Card c2 = new Card("Ace", "Spades", 11);
            Card c3 = new Card("Ace", "Spades", 1);
            Card c4 = new Card("Ace", "Hearts", 11);
            Card c5 = new Card("Queen", "Spades", 11);
            Card c6 = new Card("King", "Diamonds", 10);
            
            assert c1.rank().equals("Ace") : "Wrong rank: " + c1.rank();
            assert c1.suit().equals("Spades") : "Wrong suit: " + c1.suit();
            assert c1.pointValue() == 10 : "Wrong point value: " + c1.pointValue();
            System.out.println("All tests passed");
        }
}
