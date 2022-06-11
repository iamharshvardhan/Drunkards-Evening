import java.util.Scanner;
 
public class Game
{
    public final String INVALID_INPUT = "Invalid Input. Try again...";
    public Scanner mainScanner = new Scanner(System.in);
    private String play;
 
    public void setPlay()
    {
        System.out.println("Play? Y/N");
        play = mainScanner.nextLine().toUpperCase();
 
        while(true)
        {
            if(play.equals("Y") || play.equals("N"))
            {
                break;
            }
            else
            {
                System.out.println(INVALID_INPUT);
                play = mainScanner.nextLine().toUpperCase();
            }
        }
        if(play.equals("Y"))
        {
            play();
        }
        if(play.equals("N"))
        {
            endGame();
        }
    }
 
    private void play()
    {
        if(play.equals("Y"))
        {
            System.out.println("You are standing in front of the door to your room. You decide to:");
            System.out.println("A - Open the door and enter.");
            System.out.println("B - I don't like this game... (Quit Game).");
            System.out.println("    (Select A or B, then press Enter...)");
            String choice = mainScanner.nextLine().toUpperCase();
 
            while(true)
            {
                if(choice.equals("A") || choice.equals("B"))
                {
                    break;
                }
                else
                {
                    System.out.println(INVALID_INPUT);
                    choice = mainScanner.nextLine().toUpperCase();
                }
            }
 
            if(choice.equals("A"))
            {
                new Room().Continue();
            }
            if(choice.equals("B"))
            {
                endGame();
            }
        }
        else
        {
            endGame();
        }
    }
 
    public void endGame()
    {
        String END_GAME = "Goodbye!";
        System.out.println(END_GAME);
        mainScanner.close();
    }
}