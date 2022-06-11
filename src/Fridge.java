public class Fridge extends Room
{
    public void grabDrink()
    {
        System.out.println("This fridge is full of cold, delicious bottles of your favourite beer... :)");
        System.out.println("How many of these would you like to drink?");
        System.out.println("Enter quantity in number...");
        boolean isValidInt = mainScanner.hasNextInt();
        int beers;
        while(true)
        {
            if (isValidInt)
            {
                beers = mainScanner.nextInt();
                break;
            }
            else
            {
                System.out.println(INVALID_INPUT);
                mainScanner.nextLine();
                isValidInt = mainScanner.hasNextInt();
            }
        }
        if(beers <=0)
        {
            System.out.println("Not thirsty huh..? Very well.");
            System.out.println("What now?");
            System.out.println("A - Just sit on the sofa.");
            System.out.println("B - Watch the TV");
            System.out.println("C - Go to sleep (Quit game)");
            System.out.println("    (Select A, B or C then press Enter...)");
            localChoice();
        }
        if(beers > 0 && beers <= 8)
        {
            System.out.println("(drinking....)");
            System.out.println("(hics..!) WhAt NoW?");
            System.out.println("A - SiT oN tHe ffofa.");
            System.out.println("B - WhAts On thE TV...");
            System.out.println("C - Go tO sshleEp -=recommended=- (Quit game)");
            System.out.println("    (Select A, B or C then press Enter...)");
            localChoice();
        }
        if(beers > 8 && beers <= 12)
        {
            System.out.println("(drinking....)");
            System.out.println("...");
            System.out.println("......");
            System.out.println("........bAd IdEa....");
            System.out.println("EEEWWWWWFFFFF!!!!");
            endGame();
        }
        if(beers > 13)
        {
            System.out.println("Talk to someone...");
            endGame();
        }
    }
 
    private void localChoice()
    {
        mainScanner.nextLine();
        String choice = mainScanner.nextLine().toUpperCase();
        while (true)
        {
            if (choice.equals("A") || choice.equals("B") || choice.equals("C"))
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
            new TV().tellyTime();
        }
        if(choice.equals("C"))
        {
            endGame();
        }
    }
}