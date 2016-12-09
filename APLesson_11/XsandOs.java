import java.util.*;
public class XsandOs
{
	public static void main(String[]args)
	{
		String[][] xAndo = new String[4][4];
		int pick = 0;
		for(int i = 0; i < xAndo.length; i++)
		{
			for(int j = 0; j < xAndo[i].length; j++)
			{
				pick = (int)(Math.random()*2+1);
				
				if(pick==1)
				{
					xAndo[i][j] = "X";
				}
				else if(pick==2)
				{
					xAndo[i][j] = "O";
				}
				System.out.print(xAndo[i][j] + "	");
			}
			System.out.println();
		}
	}
}