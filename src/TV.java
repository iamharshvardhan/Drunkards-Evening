public class TV extends Room
{
    public void tellyTime()
    {
        System.out.println("What channel would you like to watch?");
        System.out.println("Select 1, 2 or 3.");
 
        boolean isValidInt = mainScanner.hasNextInt();
        int channel;
        while(true)
        {
            if (isValidInt)
            {
                channel = mainScanner.nextInt();
                break;
            }
            else
            {
                System.out.println(INVALID_INPUT);
                mainScanner.nextLine();
                isValidInt = mainScanner.hasNextInt();
            }
        }
        switch (channel)
        {
            case 1:
                System.out.println("You are watching TV...");
                System.out.println("This channel is showing news...");
                localChoice();
                break;
            case 2:
                System.out.println("You are watching TV...");
                System.out.println("This channel is showing old movies...");
                localChoice();
                break;
            case 3:
                System.out.println("You are watching TV...");
                System.out.println("This channel is showing music videos...");
                localChoice();
                break;
            default:
                System.out.println("Channel not available....");
                localChoice();
                break;
        }
    }
 
    private void localChoice()
    {
        System.out.println("What now?");
        System.out.println("A - Just sit on the sofa.");
        System.out.println("B - Go to the fridge.");
        System.out.println("C - Change channel.");
        System.out.println("D - Go to sleep (Quit game).");
        System.out.println("    (Select A, B, C or D then press Enter...)");
 
        mainScanner.nextLine();
        String choice = mainScanner.nextLine().toUpperCase();
        while (true)
        {
            if (choice.equals("A") || choice.equals("B") || choice.equals("C") ||choice.equals("D"))
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
            tellyTime();
        }
        if(choice.equals("D"))
        {
            endGame();
        }
    }
}