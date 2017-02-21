import java.util.Scanner;
class WordMatch
{
	public static void main(String args[])
	{
		Scanner index1 = new Scanner(System.in);
		System.out.println("Enter your first word  :");
		String word1 = index1.next();

		Scanner index2 = new Scanner(System.in);
		System.out.println("Enter your second word  :");
		String word2 = index2.next();

		int amount1=0;
		int amount2=0;

		for (int i=0;i<word1.length();i++)
		{
			if(word1.charAt(i) != ' ')
			++amount1;
		}
		for (int j=0;j<word2.length();j++)
		{
			if(word2.charAt(j) != ' ')
			++amount2;
		}
	
		if (amount1==amount2)
		{
			for(int i=0;i<word1.length();i++)
			{
				if(word1.charAt(i) != word2.charAt(i))
				{
					//break;
					System.out.println("Word1 and word2 are not  matchng..!");	
					break;
				}			
				else
				{
					System.out.println("Word1 and word2 are matchng..!");
					break;
				}			
			}
			//System.out.println("Word1 and word2 are matchng..!");
		}
		else
		{
		System.out.println("Words are not matching");
		}
				
	}
}
