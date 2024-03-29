import java.util.Scanner;
import java.util.Random;
class NumberBlitz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int guess, score=0, randomNum, ch;
        randomNum = random.nextInt(100) + 1;
        
        System.out.println("----------------------------------------"+
            "------------------------\n-----------------------------"+
            "-----------------------------------"+
            "\nWelcome to 'Number Guess Blitz' - Test your intuition"+
            "and wit!"+
            "\nGuess the mystery number between 1 and 100 that the "+
            "computer "+
            "\nconjures up. With multiple tries at your disposal, "+
            "play smart "+
            "\nand bow out whenever you please. Achieve the coveted"+
            " score of 1 "+
            "\nand claim victory."+
            "\nLet the guessing games begin!"+
            "\n----------------------------------------------------"+
            "------------"+
            "\n\nA Number Has Been Generated!\n");
        do
        {
            System.out.print("\n-----------------------------------"+
                "-----------------------------"+
                "\nCHOOSE FROM BELOW: "+
                "\n1. Try Your Luck!"+
                "\n2. Generate A New Number."+
                "\n3. Exit."+
                "\n------------------------------------------------"+
                "----------------"+
                "\n\nEnter your choice(1-3): ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                ++score;
                if(randomNum==guess)
                    System.out.println("\nAwesome job! You Won, And "+
                        "Your Score Is "+score+". Great Work!"+
                        "\nThank You For Playing, Have A Great Day!");
                else
                {
                    System.out.print("Oops! Your guess is"+
                        ((guess>randomNum) ? " higher" : " lower")+
                        " than the secret number. Try again!");
                }
                break;
                
                case 2:
                randomNum = random.nextInt(100) + 1;
                System.out.println("\nA New Number Has Been "+
                    "Generated!\n");
                score=0;
                break;
                
                case 3:
                System.out.println("Thank You For Playing, Have A "+
                    "Great Day!\n---------------------------------"+
                    "-------------------------------");
                break;
                
                default: System.out.println("Wrong Choice Entered!"+
                    " Please Enter A Valid Choice(1-3).");
            }
        }while(ch!=3);
    }
}