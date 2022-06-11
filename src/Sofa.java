public class Sofa extends Room
{
    public void sit()
    {
        System.out.println("Not very comfy...");
        System.out.println("What now?");
        System.out.println("A - Recline and relax...");
        System.out.println("B - Go to the fridge.");
        System.out.println("C - Watch the TV.");
        System.out.println("D - Go to sleep (Quit game).");
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
            relax();
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
 
    private void relax()
    {
            System.out.println("You extend the foot-rest, lean back and...");
            System.out.println("you were so tired that you fell asleep...zzzzz (Quit Game)");
            endGame();
    }
}