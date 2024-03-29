import java.util.Scanner;
class ATMInterface
{
    private double accBal;
     
    ATMInterface()
    {
        accBal=0;
    }
    
    void withdraw(double amount)
    {
        if(accBal-amount >= 0)
        {
            accBal-= amount;
            System.out.println("\nWithdrawal successful! Your "+
                "account has been debited by "+amount);
        }
        else
            System.out.println("\nInsufficient Funds! Please "+
                "Add More Money.");
    }
    
    void deposit(double amount)
    {
        accBal+= amount;
        System.out.println("\nDeposit successful! Your account"+
            " has been credited with "+amount);
    }
    
    void checkBalance()
    {
        System.out.println("Account Balance: "+accBal);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        double balance, amount;
        
        ATMInterface obj = new ATMInterface();
        
        System.out.println("-------------------------------------"+
        "------------------------------"+
            "\nStep into the world of convenience! "+
            "Welcome to the ATM experience!"+
            "\n-------------------------------------------------"+
            "------------------");
            
        do
        {
            System.out.print("\n------------------------------"+
                "----------------------------------"+
                "\nCHOOSE FROM BELOW: "+
                "\n1. DEPOSIT"+
                "\n2. WITHDRAW"+
                "\n3. CHECK BALANCE"+
                "\n4. EXIT"+
                "\n-------------------------------------------"+
                "---------------------"+
                "\n\nEnter your choice(1-4): ");
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                System.out.print("Enter Amount To Deposit: ");
                amount = sc.nextDouble();
                obj.deposit(amount);
                break;
                
                case 2:
                System.out.print("Enter Amount To Withdraw: ");
                amount = sc.nextDouble();
                obj.withdraw(amount);
                break;
                
                case 3:
                System.out.println("\nACCOUNT SUMMARY-");
                obj.checkBalance();
                break;
                
                case 4:
                System.out.println("-------------------------------"+
                    "------------------------------------"+
                    "\nThank You For Banking With Us! Have A Great Day!"+
                    "\n-------------------------------------------------"+
                        "------------------");
                break;
                
                default: System.out.println("\nWrong Choice Entered!"+
                    " Please Enter A Valid Choice(1-4).");
            }
        }while(ch!=4);
    }
}
        