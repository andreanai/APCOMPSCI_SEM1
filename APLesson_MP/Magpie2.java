public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
                int psn = -1;

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */
                
                if(statement.length()==0)
                    response = "Say something please";

		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
                else if (findKeyword(statement,"no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
                */
		else if (findKeyword(statement,"frog") >= 0
				|| findKeyword(statement,"dog") >= 0
				|| findKeyword(statement,"cat") >= 0
				|| findKeyword(statement,"hamster") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		 /*
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */
		else if (findKeyword(statement,"Robinette") >= 0)
		{
			response = "He sounds like a pretty dank teacher";
		}
                /*
                 Responses that require transformation
                */
                else if (findKeyword(statement, "I want to", 0) >= 0)
                {
                    response = transformIWantToStatement(statement);
                }
                else if ( findKeyword(statement, "you") >= 0 && findKeyword(statement, "me", psn) >= 0)
                {
                    response = transformYouMeStatement(statement);
                }
                else if ( findKeyword(statement, "I") >= 0 && findKeyword(statement, "you", psn) >= 0)
                {
                    response = transformIYouStatement(statement);
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	public int findKeyword(String statement, String goal, int startPos)
	{
            /* New String variable phrase = a more searchable version of statement.
                    -Use a combination of trim() and toLowerCase() modify statement.
            */
            String btrStmt = statement.toLowerCase().trim();
            String btrGoal = goal.toLowerCase().trim();
            /*

               New int variable psn = the location of goal in phrase after
               startPos
            */
            int psn = startPos;
            int psnA = -1, // position of the character after the position of the goal
                psnB = -1;// position of the character before the position of the goal
            /*
            -->Refinement: Make sure we find goal by itself, and not part
            of another word ("no" vs no in "know"). if you find an occurrence
            of goal, make sure before and after aren't letters.
            
            As long as psn >= 0...
                    Check if psn > 0 - there is no need to check for before at the
                    beginning of the word
                            set before = the slot in phrase before psn 
                    check if you can fit goal into the rest of phrase - no need to
                    proceed otherwise
            */
            if(btrStmt.length()<btrGoal.length())
            {
                return -1;
            }
            else
            {
                while((psn = btrStmt.indexOf(btrGoal, psn)) < btrStmt.length())
                {
                   if(psn == 0)
                   {
                       /*
                           The goal is found in the beginning of the string,
                           let's check the character after the goal, if it's 
                           not a letter then we return psn
                       */
                       psnA = btrGoal.length();
                       if(btrStmt.substring(psnA,psnA+1).compareTo("a")<0 || 
                          btrStmt.substring(psnA, psnA+1).compareTo("z") > 0)break;
                       else
                           psn++;
                   }
                   else if(psn > 0)
                   {
                   /*

                       //====>code here

                               set after = the slot in phrase after psn + length of goal */
                       psnB = psn - 1;
                       psnA = psn + btrGoal.length();

                       //=====> code here

                       /* if before and after are not letters (compare before to "a"
                               and after to "z")
                                       --return psn

                       Otherwise, search for goal in phrase from psn + 1 forward
                       Also need to check if psnA is greater than the length of
                       test string*/
                       if((psnA == btrStmt.length()) && 
                          (btrStmt.substring(psnB,psnB+1).compareTo("a")<0 || 
                           btrStmt.substring(psnB, psnB+1).compareTo("z") > 0))
                           break;
                       else if((btrStmt.substring(psnB,psnB+1).compareTo("a")<0 || 
                                btrStmt.substring(psnB, psnB+1).compareTo("z") > 0) &&
                               (btrStmt.substring(psnA,psnA+1).compareTo("a")<0 || 
                                btrStmt.substring(psnA, psnA+1).compareTo("z") > 0))
                           break;
                       else
                           psn++;
                    }
                    else
                       /*
                          Goal is not found
                       */
                        return -1;
                   
                }
           
            }
            return psn;
        }

	/** Override - this method is used if there are only 2 parameters...*/
	public int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
    /**
    * Take a statement with "I want to <something>." and transform it into
    * "What would it mean to <something>?"
    * @param statement the user statement, assumed to contain "I want to"
    * @return the transformed statement
    */
    private String transformIWantToStatement(String statement)
    {
    /**
    * trim the statement
    * variable lastChar = last character in statement
    * if lastChar is a period...
    * remove the last character from statement
    */
        String rstOfStmt = "";
        String goal = "I want to";
        String ret = "";
        
        statement.trim();
        if (statement.charAt(statement.length()-1) == '.')
            statement = statement.substring(0, statement.length()-2);
    /*
    * Set new int psn to the result from
    * findKeyword?? method @param statement, goal is "I want to "
    * Set new String restOfStatement to the rest of statement after the
    * "I want to ".
    */
        int psn = findKeyword(statement, goal);
        if( psn >= 0 )
        {
            rstOfStmt = statement.substring(psn + goal.length());
            ret = "What would it mean to"+rstOfStmt;
        }
        else
            ret = "I don't think you expressed your wish clearly";
    
        return ret;
    }
    /**
    * Take a statement with "you <something> me" and transform it into
    * "What makes you think that I <something> you?"
    * @param statement the user statement, assumed to contain "you" followed by "me"
    * @return the transformed statement
    */
    private String transformYouMeStatement(String statement)
    {
    /**
    * trim the statement
    * Set new String lastChar to the last character in statement
    * if lastChar is a period...
    * remove the period
    */
        String rstOfStmt = "";
        String ret = "";
        
        statement.trim();
        if (statement.charAt(statement.length()-1) == '.')
            statement = statement.substring(0, statement.length()-2);
    /*    
    * Set new int psnOfYou to the result of findKeyword
    * @param statement and "you"
    * Set new int psnOfMe to the result of findKeyword
    * @param statement, "me", and psnOfYou + 3
    */
        int psnYou = findKeyword(statement, "you");
        int psnMe = findKeyword(statement, "me", psnYou+3);
     /*    
    * Set new String restOfStatement to the rest of statement after "You" + 3,
    * and before "me".
    *
    * return "What makes you think that I " + restOfStatement + "you?"
    * */
       if( psnYou >= 0 && psnMe >= 0 )
        {
            rstOfStmt = statement.substring(psnYou+3, psnMe);
            ret = "What makes you think that I " + rstOfStmt + "you?";
        }
        else
            ret = "I thought you wanted to talk about us";
    
        return ret;
    }
    /**
    * Take a statement with "I <something> you" and transform it into
    * "Why do you <something> me?"
    * @param statement the user statement, assumed to contain "I" followed by "you"
    * @return the transformed statement
    */
    private String transformIYouStatement(String statement)
    {
    /**
    * trim the statement
    * Set new String lastChar to the last character in statement
    * if lastChar is a period...
    * remove the period
    */
        String rstOfStmt = "";
        String ret = "";
        
        statement.trim();
        if (statement.charAt(statement.length()-1) == '.')
            statement = statement.substring(0, statement.length()-2);
    /*    
    * Set new int psnOfYou to the result of findKeyword
    * @param statement and "you"
    * Set new int psnOfMe to the result of findKeyword
    * @param statement, "me", and psnOfYou + 3
    */
        int psnI = findKeyword(statement, "I");
        int psnYou = findKeyword(statement, "you", psnI+1);
     /*    
    * Set new String restOfStatement to the rest of statement after "I" + 1,
    * and before "you".
    *
    * return "Why do you " + restOfStatement + "me?"
    * */
       if( psnYou >= 0 && psnI >= 0 )
        {
            rstOfStmt = statement.substring(psnI + 1, psnYou);
            ret = "Why do you " + rstOfStmt + "me?";
        }
        else
            ret = "I thought you wanted to talk about you and I";
    
        return ret;
    }
}
