import java.util.Scanner;
class Menu {

    /*

        As ironic as it is considering it's a console program this is the front end, it's most of what the user sees,
        and it calls all the backend functions created

     */

    int selectedOption;
    int depositOption;
    int withdrawOption;
    int creditOption;
    accountsInformation accountsInformation = new accountsInformation(); //instantiating

    public void showMenu() {

        System.out.println("*-----------------------------*");
        System.out.println("Please Select an option below:");
        System.out.println("1. Deposit ");
        System.out.println("2. Withdraw");
        System.out.println("3. View balance");
        System.out.println("4. Apply for credit");
        System.out.println("5. exit program");
        System.out.println("*-----------------------------*");

        Scanner scanner = new Scanner(System.in);
        selectedOption = scanner.nextInt();
        switch (selectedOption) {

            //what happens per option
            case 1:
                System.out.println("Select and account:");
                System.out.println("1. checking");
                System.out.println("2. savings");
                System.out.println("3. rainy day fund");
                depositOption = scanner.nextInt();

                if (depositOption == 1) {
                    Deposit d = new Deposit();
                    int depamt = d.userInputChecking();
                    accountsInformation.depositChecking(depamt);
                    showMenu();
                } else if (depositOption == 2) {
                    Deposit w = new Deposit();
                    int depamt2 = w.userInputSavings();
                    accountsInformation.depositSavings(depamt2);
                    showMenu();
                } else if (depositOption == 3) {
                    Deposit f = new Deposit();
                    int depamt3 = f.userInputRainyDayFund();
                    accountsInformation.depositRainyDayFund(depamt3);
                    showMenu();
                } else {
                    System.out.println("Invalid option");
                }

                break;


            case 2:
                System.out.println("Select and account:");
                System.out.println("1. checking");
                System.out.println("2. savings");
                System.out.println("3. rainy day fund");
                withdrawOption = scanner.nextInt();

                if (withdrawOption == 1) {
                    System.out.println("Please Enter the amount to withdraw:");
                    int withamt = scanner.nextInt();
                    accountsInformation.checkingWithdraw(withamt);
                    showMenu();

                } else if (withdrawOption == 1) {
                    System.out.println("Please Enter the amount to withdraw:");
                    int withamt2 = scanner.nextInt();
                    accountsInformation.savingsWithdraw(withamt2);
                    showMenu();

                } else if (withdrawOption == 1) {
                    System.out.println("Please Enter the amount to withdraw:");
                    int withamt3 = scanner.nextInt();
                    accountsInformation.rainyDayWithdraw(withamt3);
                    showMenu();

                }

                break;

            case 3:
                System.out.println("Your checking Balance is " + accountsInformation.getCheckingBalance() + " Dollars CAD$");
                System.out.println("Your savings Balance is " + accountsInformation.getSavingsAmount() + " Dollars CAD$");
                System.out.println("Your rainy day fund Balance is " + accountsInformation.getRainyDayFund() + " Dollars CAD$");
                showMenu();
                break;

            case 4:

                System.out.println("Select and account:");
                System.out.println("1. checking");
                System.out.println("2. savings");
                System.out.println("3. rainy day fund");
                creditOption = scanner.nextInt();

                if (creditOption == 1) {
                    Credit c = new Credit();
                    int requestCredit = c.userInput();
                    accountsInformation.depositChecking(requestCredit);
                    showMenu();
                    break;
                }

                if (creditOption == 2) {
                    Credit c1 = new Credit();
                    int requestCredit = c1.userInput();
                    accountsInformation.depositSavings(requestCredit);
                    showMenu();
                    break;
                }
                if (creditOption == 3) {
                    Credit c2 = new Credit();
                    int requestCredit = c2.userInput();
                    accountsInformation.depositRainyDayFund(requestCredit);
                    showMenu();
                    break;
                }
                break;

            case 5:
                System.exit(0); // exits program


        }
    }
}