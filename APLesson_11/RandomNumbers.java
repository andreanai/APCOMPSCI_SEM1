import java.util.*;
public class RandomNumbers
{
	public static void main(String[]args)
	{
		int[][]nums = new int [4][4]; 
		int num = 1;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				num =(int)(Math.random()*100+1);
				nums[i][j] = num;
			}
			num++;
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}