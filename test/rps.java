import java.util.*;

class rps 
{
    void five() 
    {
        System.out.println("\u000c");
        System.out.println("Enter any one of the following inputs:  ");
        System.out.println("1) ROCK");
        System.out.println("2)PAPER");
        System.out.println("3)SCISSORS");
        System.out.println();

        String playerMove = getPlayerMove();
        String computerMove = getComputerMove(); 
        if (playerMove.equals(computerMove))
            System.out.println("Game is Tie !!");        
        else if(playerMove=="ROCK"&& computerMove=="PAPER")
        {
            System.out.println("Computer wins !!");
        }
        else if(playerMove=="ROCK"&& computerMove=="SCISSORS")
        {
            System.out.println("Players wins !!");
        }
        else if(playerMove=="SCISSORS"&& computerMove=="PAPER")
        {
            System.out.println("Player wins !!");
        }
        else if(playerMove=="SCISSORS"&& computerMove=="ROCK")
        {
            System.out.println("Computer wins !!");
        }
        else if(playerMove=="PAPER"&& computerMove=="ROCK")
        {
            System.out.println("Player wins !!");
        }
        else if(playerMove=="PAPER"&& computerMove=="SCISSORS")
        {
            System.out.println("Computer wins !!");
        }
    }

    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = "ROCK";
        else if(input == 2)
            computermove = "PAPER";
        else
            computermove = "SCISSORS";

        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;    
    }

    public static String getPlayerMove()
    {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String playermove="";
        switch(input)
        {
            case 1:playermove="ROCK";
                break;
            case 2:playermove="PAPER";
                break;
            case 3:playermove="SCISSORS";
                break;
            default:
        }
        return playermove;
    }    
}