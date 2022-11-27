import java.util.Random;
import java.util.*;
  
public class NumberGuessing
{
    public static void main(String[] args)
    {
        int ans, guessNo;
	final int MAX = 100;
	Scanner sc = new Scanner(System.in);
  	Random rd = new Random();
  	boolean correct = false;
	ans = rd.nextInt(MAX) + 1;
  	while (!correct) 
	{
  	  System.out.println("Guess the number between 1 and 100: ");
	  guessNo = sc.nextInt();
            if (guessNo > ans)
		{
              System.out.println("You are entered a number to high ,please try again");
            }
  		else if (guessNo < ans)
		{
              System.out.println("You are entered a number to low ,please try againn");
            }


            else 
		{
              System.out.println("Yes,You guess the number!!.");
  		  correct = true;
            }
        }
        System.exit(0);
    }
}