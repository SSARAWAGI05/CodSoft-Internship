import java.util.Scanner;
class QuizApplication
{
    public String question[][];
    public int score, n;
    public char key[];

    QuizApplication(int n)
    {
        this.n = n;
        question = new String[n][5];
        key = new char[n];
        score=0;
    }

    void getQuestion()
    {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++)
        {
            System.out.print("\n-------------------------------------------"+
                "---------------------"+
                "\nEnter Question #"+(i+1)+":\n"+
                "-------------------------------------------"+
                "---------------------\n");
            question[i][0] = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the 4 choices(a,b,c,d): ");
            System.out.print("Enter a: ");
            question[i][1] = sc.nextLine();
            System.out.print("Enter b: ");
            question[i][2] = sc.nextLine();
            System.out.print("Enter c: ");
            question[i][3] = sc.nextLine();
            System.out.print("Enter d: ");
            question[i][4] = sc.nextLine();

            System.out.print("Enter the correct option: ");
            key[i] = sc.next().charAt(0);
        }
    }

    void check()
    {
        Scanner sc = new Scanner(System.in);
        int i, ch;

        for(i=0; i<n; i++)
        {
            System.out.println("\n-------------------------------------------"+
                "---------------------"+
                "\nQuestion #"+(i+1)+":\n"+question[i][0]+
                "\na) "+question[i][1]+
                "\nb) "+question[i][2]+
                "\nc) "+question[i][3]+
                "\nd) "+question[i][4]+
                "\n-------------------------------------------"+
                "---------------------\n");
            System.out.println("\nEnter your choice(a,b,c,d): ");
            ch = sc.next().charAt(0);
            if(ch==key[i])
                ++score;
        }
        
        System.out.println("Congratulations on completing the quiz! Your score is "+score+
            ". Well done!"); 
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch, n=0;
        QuizApplication obj = new QuizApplication(0);
        System.out.println("------------------------------------------------------------------------------------------------------"+
            "\nWelcome to the Ultimate Quiz Challenge! Test your knowledge and see if you can conquer our questions!"+
            "\n------------------------------------------------------------------------------------------------------");
            
        do
        {
            System.out.print("\n------------------------------"+
                "----------------------------------"+
                "\nCHOOSE FROM BELOW: "+
                "\n1. Add Questions"+
                "\n2. Take The Quiz"+
                "\n3. EXIT"+
                "\n-------------------------------------------"+
                "---------------------"+
                "\n\nEnter your choice(1-3): ");
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                System.out.print("Enter The Number Of Questions To Add: ");
                n = sc.nextInt();
                obj = new QuizApplication(n);
                obj.getQuestion();
                break;
                
                case 2:
                if(n==0)
                    System.out.println("\n------------------------------"+
                    "----------------------------------"+
                    "\nCannot start quiz: No questions entered."+
                    " Please add questions before attempting to take the quiz."+
                    "------------------------------"+
                    "----------------------------------");
                else
                    obj.check();
                break;
                
                case 3:
                System.out.println("\n----------------------------------------"+
                    "----------------------------------"+
                    "\nThank you for participating in the quiz! "+
                    "\nWe hope you enjoyed the challenge and look forward to seeing you again soon!"+
                    "\n-----------------------------------"+
                    "---------------------------------------");
                break;
                
                default: System.out.println("\nWrong Choice Entered!"+
                    " Please Enter A Valid Choice(1-3).");
            }
        }while(ch!=3);
    }
}
        