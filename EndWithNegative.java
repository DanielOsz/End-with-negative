/**
Program should display entered integers, sum and terminate when negitive integer is entered.
Author: Daniel Oszczapinski	
Lab Assignment 5
Completed: October 06, 2016
*/
import java.util.Scanner;
public class EndWithNegative
{
	 public static void main (String[] args)
    {
		System.out.println ();
        double sum;
        int numbers;
        double next;
        String answer;
        Scanner keyboard = new Scanner (System.in);
        do
        {
			System.out.println ("This program computes the sum of integers");
            System.out.println ("Enter positve integers to calculate the sum.");
            System.out.print ("Enter a negative number after ");
            System.out.println ("you have entered all the integers.");
            sum = 0;
            numbers = 0;
			System.out.println ();
			System.out.print("Please enter an integer: ");
            next = keyboard.nextDouble ();
            while (next >= 0)
            {
                sum = sum + next;
                numbers++;
				System.out.print("Please enter an integer: ");
                next = keyboard.nextDouble ();
            }
			System.out.println ();
            if (numbers > 0)
                System.out.println ("The sum of the positive integers you entered is: " +
                        (sum / numbers));
            else
                System.out.println ("No integers to compute sum.");
			System.out.println ();
            System.out.println ("Want to compute the sum of another set of integers?");
            System.out.println ("Enter yes or no.");
            answer = keyboard.next ();
        }
        while (answer.equalsIgnoreCase ("yes"));
    }
}