//Imports
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

	//Variable Declarations
        Scanner in = new Scanner(System.in);
        String endChoice ="";
        String trash ="";
        String playerA ="";
        String playerB ="";
        String rock = "Rock";
        String paper = "Paper";
        String scissors = "Scissors";
        String r = "R";
        String p = "P";
        String s = "S";

        // Declaring the main game loop and only exiting if the game is over to offer a constant game with retries to the user.
        while (true)
        {
            // Declaring and using a loop until a valid move is made by player 1.
            while (true)
            {
                // Output instructions to the user for input.
                System.out.print("Player A enter your move - rock, paper or scissors: ");
                // Check if the user enters an integer value instead.
                if(in.hasNextInt() )
                {
                    trash = in.next();
                    System.out.println("You have input an incorrect value:"+trash+" please enter a valid input\n");
                    return;
                }
                // Check if the user enters a decimal value instead.
                else if(in.hasNextDouble() )
                {
                    trash = in.next();
                    System.out.println("You have input an incorrect value:"+trash+" please enter a valid input\n");
                    return;
                }
                // Check if the player gave the correct value, break the loop and store the value given by the user.
                else
                {
                    playerA = in.next();
                    break;
                }
            }

            // Declaring and using a loop until a valid move is made by player 2.
            while (true)
            {
                // Output instructions to the user for input
                System.out.print("Player B enter your move - rock, paper or scissors: ");
                // Check if the user enters an integer value instead of the needed data type.
                if(in.hasNextInt() )
                {
                    trash = in.next();
                    System.out.println("You have input an incorrect value:"+trash+" please enter a valid input\n");                    return;
                }
                // Check if the user enters a decimal value instead of the needed data type.
                else if(in.hasNextDouble() )
                {
                    trash = in.next();
                    System.out.println("You have input an incorrect value:"+trash+" please enter a valid input\n");                    return;
                }
                // Check if the player gave the correct value, break the loop and store the value given by the user.
                else if(in.hasNext() )
                {
                    playerB = in.next();
                    break;
                }
            }

            //Processing & Output - This block runs in the main game loop and is a sister to the loops directly
            // above and below.

            // Tie check logic -- always checks first
            if(playerA.equalsIgnoreCase(playerB))
            {
                System.out.println("------------------");
                System.out.print("\n\n"+"      Tie!\n");
                System.out.print(playerA+" .vs. "+playerB+"\n\n");
            }
            // Rock vs Paper logic
            else if(playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(paper))
            {
                System.out.println("------------------");
                System.out.print("  Player B Wins\n");
                System.out.print("Paper covers Rock\n");
            }
            // Rock vs Scissors logic
            else if(playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(scissors))
            {
                System.out.println("------------------");
                System.out.print("  Player A Wins\n");
                System.out.print("Rock breaks Scissors\n");
            }
            //Scissors vs Rock logic
            else if(playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(rock))
            {
                System.out.println("------------------");
                System.out.print("  Player B Wins\n");
                System.out.print("Rock breaks Scissors\n");
            }
            //Scissors vs Paper logic
            else if(playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(paper))
            {
                System.out.println("------------------");
                System.out.print("  Player A Wins\n");
                System.out.print("Scissors cuts Paper\n");
            }
            //Paper vs Rock logic
            else if(playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(rock))
            {
                System.out.println("------------------");
                System.out.print("  Player A Wins\n");
                System.out.print("Paper covers Rock\n");
            }
            //Paper vs Scissors logic
            else if(playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(scissors))
            {
                System.out.println("------------------");
                System.out.print("  Player B Wins\n");
                System.out.print("Scissors cuts Paper\n");
            }
            // Lower case logic
            else if(playerA.equalsIgnoreCase(r) && playerB.equalsIgnoreCase(p))
            {
                System.out.println("------------------");
                System.out.print("  Player B Wins\n");
                System.out.print("Paper covers Rock\n");
            }
            // Rock vs Scissors logic
            else if(playerA.equalsIgnoreCase(r) && playerB.equalsIgnoreCase(s))
            {
                System.out.println("------------------");
                System.out.print("  Player A Wins\n");
                System.out.print("Rock breaks Scissors\n");
            }
            //Scissors vs Rock logic
            else if(playerA.equalsIgnoreCase(s) && playerB.equalsIgnoreCase(r))
            {
                System.out.println("------------------");
                System.out.print("  Player B Wins\n");
                System.out.print("Rock breaks Scissors\n");
            }
            //Scissors vs Paper logic
            else if(playerA.equalsIgnoreCase(s) && playerB.equalsIgnoreCase(p))
            {
                System.out.println("------------------");
                System.out.print("  Player A Wins\n");
                System.out.print("Scissors cuts Paper\n");
            }
            //Paper vs Rock logic
            else if(playerA.equalsIgnoreCase(p) && playerB.equalsIgnoreCase(r))
            {
                System.out.println("------------------");
                System.out.print("  Player A Wins\n");
                System.out.print("Paper covers Rock\n");
            }
            //Paper vs Scissors logic
            else if(playerA.equalsIgnoreCase(p) && playerB.equalsIgnoreCase(s))
            {
                System.out.println("------------------");
                System.out.print("  Player B Wins\n");
                System.out.print("Scissors cuts Paper\n");
            }
            else {
                System.out.print("Unknown error -- returning.");
                return;
            }

            // Declaring and using a loop until valid input is received by the user to play again or not.
            while(true)
            {
                // Asks and filters the user input and asks if they would like to play the game again.
                System.out.print("Would you like to try again?  Y/N : ");

                // Check if the user inputs a decimal instead of a string.
                if( in.hasNextDouble() )
                {
                    trash = in.next();
                    System.out.println("You have input an incorrect value:"+trash+" please enter a valid input\n");
                    return;
                }
                // Check if the user inputs an integer instead of a string.
                else if (in.hasNextInt() )
                {
                    trash = in.next();
                    System.out.println("You have input an incorrect value:"+trash+" please enter a valid input\n");                    return;
                }
                // Check if the correct data type was received from the user, break the loop and store the value.
                else
                {
                    endChoice = in.next();
                    break;
                }
            }

            // Logic defining what message is displayed when prompting the user to play again.
            if(endChoice.equalsIgnoreCase("yes") || endChoice.equalsIgnoreCase("y"))
            {
                System.out.println("play again ! . Returning to Start .");
                continue;
            }
            // Thank the user for using our app if they wish to exit.
            else if(endChoice.equalsIgnoreCase("no") || endChoice.equalsIgnoreCase("n"))
            {
                System.out.println("Thank you and come again soon!");
                break;
            }
            // If the user inputs anything but the excepted values it will allow them to re-enter their choice.
            else
            {
                trash = in.next();
                System.out.print("Unknown value: "+trash+" Returning");
                return;
            }
        }
    }
}