import java.util.Scanner;

public class ConsoleAdventureGame {
    public static String GameSetup(){
        System.out.println("Are you ready to start on an adventure in the Game of Thrones Region of Westeros? If so, enter your name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public static void stats(long alliedTroopNumbers, long enemyTroopNumbers, long loyaltyLevel, long fearsomeReputation) {
        System.out.println("Your updated states are below. Enter the word stats on any decision from now on to view them again!");
        System.out.println("your current troop numbers are: "+alliedTroopNumbers);
        System.out.println("The enemy troop numbers are: "+enemyTroopNumbers);
        System.out.println("Your loyalty level is "+ loyaltyLevel+"%");
        System.out.println("Your fearsome reputation level is "+ fearsomeReputation+"%");
    }

    public static String GameBeginning(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The banners of the North have been called, and now an army 50,000 strong marches behind you on your way to King's Landing.\n It had been 100 years since an army of this size had crossed through the neck, but your hand was forced. There had been peace in Westeros ever since the \nStark-Targaryen alliance crushed the cruel reign of the Lannisters, and gave the north their independence. Alas, the latest ruler sitting on the iron throne \nis crueler than any before, and is set on ruling all of Westeros. After years of southern raids killing northern citizens, you've decided enough is enough. Is it \nthe right decision? Would your great-grandfather Ned Stark have done the same? Too late now, you've committed! Are you ready to begin? (y/n)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y")) {
            System.out.println("You are woken up out of a deep sleep by your most loyal advisor, Jon Umber. Wake up King " + name +" Stark! \nYour decision is needed most urgently! As we've been sleeping, my outer scouts found that a large southern force of 10,000 men has been sneaking upon us through the forest.\n I recommend we send our entire 20,000 strong calvary after them to crush them when they reach open ground. \nThis could give us the perfect chance to weaken their army! Will you send out your troops? (y/n)");


            String response1 = scanner.nextLine();
            System.out.println("Are you sure? While this may be a crushing blow to the enemy, it would leave our camp entirely exposed for a calvary attack. Think over your decision carefully....(y/n)");
            String response2 = scanner.nextLine();
            return response2;
        } else{
            System.out.println("Lame. Play some other time.");
            String gameOver = "Player opted out";
            return gameOver;
        }

    }
    public static String ForkOne(long alliedTroopNumbers, long enemyTroopNumbers, long loyaltyLevel, long fearsomeReputation){
        System.out.println("After a day of celebrating your victory, you meet with your war council, looking for advice on your next battle move. \nThe greatest warrior in your army, general Karstark, chimes in with his plan. \"We need to ride this victory momentum, I have found that the flank of the enemies camp is weak at night. \nA well planed attack could lead to another devastating blow! What is your battle plan?");
        System.out.println("1. We will attack at night!");
        System.out.println("2. We will attack at dawn instead. While they are waking up and changing shifts.");
        System.out.println("3. We will not attack, why expose our army again so soon?");
        Scanner scanner = new Scanner(System.in);
        String response1 = scanner.nextLine();
        if (response1.equalsIgnoreCase("1")) {
            System.out.println("King Stark, think this through carefully, privately chimes in your loyal advisor Jon Umber. \nNight attacks are cowardly and unchivalrous. This could harm your reputation.");
            System.out.println("Continue with this plan? (y/n)");
            String response2=scanner.nextLine();
            if (response2.equalsIgnoreCase("y")){

            } else{
                ForkOne();
            }

            String response2 = scanner.nextLine();
        } else if(response1.equalsIgnoreCase("2")){
            System.out.println("General Karstark and Jon Umber both nod, and agree that is a bold and smart plan.");
            //System.out.println("Continue with this plan? (y/n)");

        } else{
            System.out.println("General Karstark grabs your shoulder saying, \"Think carefully about this decision, as it could make you look weak in your enemies eyes.");
            //System.out.println("Continue with this plan? (y/n)");
        }
        return response2;
    }


    public static void main(String[] args) {
        long alliedTroopNumbers = 50000;
        long enemyTroopNumbers=60000;
        long loyaltyLevel=50;
        long fearsomeReputation=50;
        String name = GameSetup();
        String firstDecision= GameBeginning(name);
        String SecondDecision="";
        if(firstDecision.equalsIgnoreCase("y")){
            alliedTroopNumbers-=1000;
            enemyTroopNumbers-=10000;
            fearsomeReputation+=5;
            System.out.println("Your updated states are below. Enter the word stats on any decision from now on to view them again!");
            System.out.println("your current troop numbers are: "+alliedTroopNumbers);
            System.out.println("The enemy troop numbers are: "+enemyTroopNumbers);
            System.out.println("Your loyalty level is "+ loyaltyLevel+"%");
            System.out.println("Your fearsome reputation level is "+ fearsomeReputation+"%");
            SecondDecision+=ForkOne(alliedTroopNumbers, enemyTroopNumbers, loyaltyLevel, fearsomeReputation);
        } else if (firstDecision.equalsIgnoreCase("n")){
            fearsomeReputation-=5;
            System.out.println("Your updated states are below. Enter the word stats on any decision from now on to view them again!");
            System.out.println("your current troop numbers are: "+alliedTroopNumbers);
            System.out.println("The enemy troop numbers are: "+enemyTroopNumbers);
            System.out.println("Your loyalty level is "+ loyaltyLevel+"%");
            System.out.println("Your fearsome reputation level is "+ fearsomeReputation+"%");
            SecondDecision+=ForkOne(alliedTroopNumbers, enemyTroopNumbers, loyaltyLevel, fearsomeReputation);
        } else{
            System.out.println("GAME OVER");
        }

    }



}
