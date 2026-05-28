package rockpaperscissorsgame;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissorsGame {
   public static String computer;
   public static String player;
   public static int playerScore;
   public static int computerScore;
   public static String playerChoice;
   public static String exist; 
   public static String result;
   
static final String[] CHOICES={"Rock","Paper","Scissors"};

public static String computerThink(){
    return CHOICES[new Random().nextInt(3)];
}
    public static String CaptureMoves(){
   if (player.equals(computer)) return "draw!";
   
            
       if (player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")){
       return "player wins!";
    }
     
       if (player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")){
       return "player wins!";
    }  
       
         if (player.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper")){
       return "player wins!";
    }
         return "computer wins!";
       
       
    }
   
    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        playerScore =0;      
        computerScore=0;
        System.out.println("=====RockPaperScissors=====");
        
        while(true){
            System.out.println("your move Rock/Paper/Scissors/exist");
            player=s.nextLine();
            
            if (player.equalsIgnoreCase(exist)){
                break;
            }
            
           computer= computerThink();
            System.out.println("computer chose"+computer);
            
            result =CaptureMoves();
            System.out.println("result");
            
            if (result.equals("player wins!"))
            {
                playerScore++;
            }
            
            else if (result.equals("computer wins!"))
            {
              computerScore++;  
            }
            
            System.out.println("playerScore: " +playerScore);
            System.out.println("computerScore: "+computerScore);
            System.out.println("End");  
            
            
        }
        
        
    }

}   
