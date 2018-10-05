/**
 * 
 * @author jeremy
 *
 */
public class ConditionalStuff
{

	public static void main(String[] args)
	{
		DiceClass die = new DiceClass();
		int[] rolls = new int[6];
		
		for(int i=1; i < 11; i++)
		{
			int roll = die.roll();
			System.out.println("Roll: " + roll);
			rolls[roll - 1] += 1;
		}
		
		for(int i=0; i < rolls.length; i++)
		{
			System.out.println((i + 1) + " was rolled " + rolls[i] + " times.");
		}

	}

}
