//Owen Lovett
//Cs1400
//Assignment 4
//11/4/2021

import java.util.Scanner;
public class TriviaGame 
{
    public static void main(String[] args)
    {
        int player1 = 0;
        int player2 = 0;
        Scanner k = new Scanner(System.in);
        int playerinput;
        int ca;
        
        Question[] question = new Question[10];
        //player 1 questions
        question[0] = new Question("Which NFL player has the most Super Bowl wins?", "1 Joe Montana", "2 Tom Brady", "3 Dan Marino", "4 Terry Bradshaw", 2);
        question[1] = new Question("Which Active NFL team is the oldest?", "1 Arizona Cardinals", "2 Chicago Bears", "3 Green Bay Packers", "4 Cleveland Browns", 1);
        question[2] = new Question("How many Super Bowl wins does the New England Patriots have?", "1 ten", "2 zero", "3 six", "4 two", 3);
        question[3] = new Question("Which NFL team has completed a perfect season (undefeated + Super Bowl win)?", "1 New England Patriots", "2 Green Bay Packers", "3 Pittsburgh Steelers", "4 Miami Dolphins", 4);
        question[4] = new Question("How many teams are in each conference?", "1 sixteen", "2 four", "3 thirty two", "4 six", 1);
        //player 2 questions
        question[5] = new Question("Which NFL Coach has the most Super Bowl wins?", "1 Bill Wash", "2 Vince Lombardi", "3 Andy Reid", "4 Bill Belichick", 4);
        question[6] = new Question("Which Active NFL team is the newest?", "1 Baltimore Ravens", "2 Houston Texans", "3 Jacksonville Jaguars", "4 Atlanta Falcons", 2);
        question[7] = new Question("How many Super Bowl wins does the Green Bay Packers have?", "1 four", "2 zero", "3 two", "4 thirteen", 1);
        question[8] = new Question("Which of these NFL teams has never won a Super Bowl?", "1 New York Jets", "2 Chicago Bears", "3 Detroit Lions", "4 Philadelphia Eagles", 3);
        question[9] = new Question("How many teams are in each division?", "1 two", "2 four", "3 ten", "4 five", 2);

        System.out.println("This trivia game's topic is the NFL (National Football League).");
        System.out.println("Each player will answer 5 questions. 1 point will be awarded for each correct answer.");
        System.out.println("The player who earns the most points wins!");
        System.out.println();

        System.out.println("It is now Player 1's turn.");

        for(int i=0; i<5; i++)
        {
            System.out.println(question[i].getQuestion());
            System.out.println(question[i].getAnswer1());
            System.out.println(question[i].getAnswer2());
            System.out.println(question[i].getAnswer3());
            System.out.println(question[i].getAnswer4());
            System.out.println("Please enter the number of the correct answer.");
            playerinput = k.nextInt();
            ca = question[i].getCorrect();
            if(playerinput == ca)
            {
                System.out.println("You are correct! You get 1 point.");
                player1++;
                System.out.println("Your current score is " + player1);
                System.out.println();
            }
            else
            {
                System.out.println("You are wrong.");
                System.out.println("The correct answer is " + ca);
                System.out.println("Your current score is " + player1);
                System.out.println();
            }
        }
        
        System.out.println("It is now Player 2's turn.");

        for(int i=5; i<10; i++)
        {
            System.out.println(question[i].getQuestion());
            System.out.println(question[i].getAnswer1());
            System.out.println(question[i].getAnswer2());
            System.out.println(question[i].getAnswer3());
            System.out.println(question[i].getAnswer4());
            System.out.println("Please enter the number of the correct answer.");
            playerinput = k.nextInt();
            ca = question[i].getCorrect();
            if(playerinput == ca)
            {
                System.out.println("You are correct! You get 1 point.");
                player2++;
                System.out.println("Your current score is " + player2);
                System.out.println();
            }
            else
            {
                System.out.println("You are wrong.");
                System.out.println("The correct answer is " + ca);
                System.out.println("Your current score is " + player2);
                System.out.println();
            }
        }

        System.out.println("Player 1's final score is " + player1);
        System.out.println("Player 2's final score is " + player2);

        if(player1 > player2)
        {
            System.out.println("Player 1 wins! Thank you for playing!");
        }
        else if(player1 < player2)
        {
            System.out.println("Player 2 wins! Thank you for playing!");
        }
        else //tie
        {
            System.out.println("We have a tie! Thank you for playing!");
        }
    }
}
