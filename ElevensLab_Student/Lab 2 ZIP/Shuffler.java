/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 12;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
                int[] valOdd = {1,2,3,4,5};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
			perfectShuffle(valOdd);
			System.out.print("  " + j + ":");
			for (int k = 0; k < valOdd.length; k++) {
				System.out.print(" " + valOdd[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
                // test weighted flip
                for( int i = 0; i < SHUFFLE_COUNT; i++)
                {
                    int heads = 0, tails=0;
                    String outcome="";
                    for (int j = 1; j <= 10000; j++) {
                        if((outcome=flip()).equals("heads")) heads++;
                        else tails++;
                        //System.out.println("Toss " + j+" is "+ outcome);
                    }
                    System.out.println("On run "+i+" out of " + 10000 + " tosses " + heads + " are heads and " + tails + " are tails");
                }
                // test arePermutations()
                int[] test1={1, 2, 3, 4, 5, 6, 7, 8};
                int[] test2={3, 4, 1, 2, 5, 6, 7, 8};
                int[] test3={1, 2, 17, 4, 5, 6, 7, 8};
                if(arePermutations(test1, test2))
                    System.out.println("Arrays are permutations");
                else
                    System.out.println("Arrays are not permutations");
                if(arePermutations(test1, test3))
                    System.out.println("Arrays are permutations");
                else
                    System.out.println("Arrays are not permutations");
                
                
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
	/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
            int halfPoint = (values.length+1)/2;
            int [] shuffled = new int[values.length];
            int k=0;
            // make a local copy of the values
            System.arraycopy(values, 0, shuffled, 0, values.length);
            for(int j = 0; j < halfPoint;j++)
            {
                values[k]=shuffled[j];
                k+=2;
            }
            k = 1;
            for(int j = halfPoint; j < values.length;j++)
            {
                values[k]=shuffled[j];
                k+=2;
            }            
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
            int i = 0;
            
            for(int j = values.length-1; j>1; j--)
            {
                int r =  (int)((Math.random()+0.01)*j);
                i = values[j];
                values[j]=values[r];
                values[r]=i;
            }
	}
	/**
	 * Simulate the weighted coin flip.
	 * This function uses a random number generator to 
         * simulate the weighted coin flip ("heads:" are twice as likely as 
         * "tails". 
         * @return 
	 */
	public static String flip() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
            int r =  (int)((Math.random())*3);
            if(r<2)
                return "heads";
            else
                return "tails";
	}
	/**
	 * Find out if the two arrays of equal length are permutations of one another.
	 * This function compares array elements to ensure they're in different order. 
         * The order of elements in arr2 will be changed as the result of this function call.
        * @param arr1 array of integers, must of the same length as arr2 
        * @param arr2 array of integers, must of the same length as arr1
         * @return : true if the arrays are permutations of one another, false otherwise
	 */
	public static boolean arePermutations(int[] arr1, int[] arr2) {
	/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
            boolean retVal=false;
            int count = 0;
            // check if the arrays are the same length
            if (arr1.length != arr2.length)
                return false;
            
            for(int i = 0; i < arr1.length; i++)
            {
                int val = arr2[i];
                for( int j = i; j<arr2.length; j++)
                {
                    count++;
                    if(arr1[i] == arr2[j])
                    {
                        arr2[i]=arr2[j];
                        arr2[j]=val;
                        break;
                    }
                }
                if( !(retVal = arr1[i]==arr2[i]))
                    break;
            }
            System.out.println("Completed function in " + count + " iterations");
            return retVal;
	}
}
