import java.util.Scanner;
class Deposit{
    int amtSav= 0;
    int amtChq=0;
    int amtRDF=0;

    public int userInputSavings()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amtSav = scanner.nextInt();
        if(amtSav<=0)
        {
            InvalidBankTransaction depositnegativeError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInputSavings();

        }else{
            return amtSav;
        }
        return amtSav;

    }

    public int userInputChecking()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amtChq = scanner.nextInt();
        if(amtChq<=0)
        {
            InvalidBankTransaction depositnegativeError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInputChecking();

        }else{
            return amtChq;
        }
        return amtChq;

    }

    public int userInputRainyDayFund()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amtRDF = scanner.nextInt();
        if(amtRDF<=0)
        {
            InvalidBankTransaction depositnegativeError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInputRainyDayFund();

        }else{
            return amtRDF;
        }
        return amtRDF;

    }
}