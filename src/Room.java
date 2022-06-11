public class Room extends Game
{
    public void Continue()
    {
        System.out.println("You enter the room and close the door behind you.");
        System.out.println("There is a sofa, a fridge and a TV.");
        System.out.println("What would you like to do?");
        System.out.println("A - Just sit on the sofa.");
        System.out.println("B - Go to the fridge.");
        System.out.println("C - Watch the TV.");
        System.out.println("D - Go to sleep (Quit Game).");
        System.out.println("    (Select A, B, C or D then press Enter...)");
        String choice = mainScanner.nextLine().toUpperCase();
 
        while (true)
        {
            if (choice.equals("A") || choice.equals("B") || choice.equals("C") || choice.equals("D"))
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
            new Sofa().sit();
        }
        if(choice.equals("B"))
        {
            new Fridge().grabDrink();
        }
        if(choice.equals("C"))
        {
            new TV().tellyTime();
        }
        if(choice.equals("D"))
        {
            endGame();
        }
    }
}