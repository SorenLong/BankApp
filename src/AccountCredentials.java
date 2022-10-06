import java.util.Scanner;

class AccountCredentials{

    /*

        This class is for the account security feature, if this were a real banking application its a given that it would
        require user passwords and account numbers, this simulates that. There is a default that can be changed.

     */
    int ac_number = 111; // default num
    int ac_pass = 222; // default password
    int ac;
    int pw;
    public void acceptInput(){
        //Creates scanner that asks for credentials
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the account number:");
        ac = scanner.nextInt();
        System.out.println("Enter the Password:");
        pw = scanner.nextInt();
    }
    public void verify() throws Exception{

        if(ac == ac_number && pw == ac_pass) // checks if the password and account numbers match the ones stored
        {

            System.out.println("Logged in Successfully!");
            accountsInformation accountsInformation = new accountsInformation();
            System.out.println(" ");

            System.out.println("Your checking Balance is: "+ accountsInformation.getCheckingBalance()+" Dollars");
            System.out.println("Your savings Balance is: "+ accountsInformation.getSavingsAmount()+" Dollars");
            System.out.println("Your rainy day Balance is: "+ accountsInformation.getRainyDayFund()+" Dollars");

            System.out.println(" ");

            Menu menu = new Menu(); // brings to the main menu that shows all user options
            menu.showMenu();


        }else{ //gives user an error that says the login failed

            InvalidBankTransaction loginfailed = new InvalidBankTransaction("Incorrect account number or password");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;

        }
    }
}