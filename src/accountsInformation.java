class accountsInformation {

    /*

        This class is the checking class, it's for the checking account you can select in the menu and has a base amount
                                            of 1000$ that can be changed.

     */

    int checkingAmount = 1000; //base amounts
    int savingsAmount = 5000;
    int rainyDayFund = 650;

//######################################################################################################################

    public void initiate()
    {
        AccountCredentials AccountCredentials = new AccountCredentials(); // initiate the AccountCredentials sequence
        try{
            AccountCredentials.acceptInput();
            AccountCredentials.verify();

        }catch(Exception e)
        {
            try{
                AccountCredentials.acceptInput();
                AccountCredentials.verify();

            }catch(Exception f)
            {

            }
        }
    }

//######################################################################################################################

    //Gets and returns balances for accounts. Used in the view accounts menu option.
    public int getCheckingBalance(){
        return checkingAmount;
    }

    public int getSavingsAmount(){
        return savingsAmount;
    }

    public int getRainyDayFund(){
        return rainyDayFund;
    }

//######################################################################################################################

    //This sets up depositing, takes base value and adds user input
    public void depositChecking(int amt){
        checkingAmount = checkingAmount + amt;
        System.out.println("Checking account balance is: " +checkingAmount + "!");
    }

    public void depositSavings(int amt){
        savingsAmount = savingsAmount + amt;
        System.out.println("Savings account balance is: " +savingsAmount + "!");
    }

    public void depositRainyDayFund(int amt){
        rainyDayFund = rainyDayFund + amt;
        System.out.println("Total Balance: " +rainyDayFund);
    }

//######################################################################################################################

    //This sets up withdrawing, takes base value and subtracts user input
    public void checkingWithdraw(int amt){
        if(checkingAmount < amt)
        {
            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            checkingAmount = (checkingAmount - amt);
            System.out.println(amt +" Dollars has been withdrawn from your checking account.");
            System.out.println("Remaining Balance: " + checkingAmount);
        }

    }

    public void savingsWithdraw(int amt){
        if(savingsAmount < amt)
        {
            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            savingsAmount = (savingsAmount - amt);
            System.out.println(amt +" Dollars has been withdrawn from your savings account.");
            System.out.println("Remaining Balance: " + savingsAmount);
        }

    }

    public void rainyDayWithdraw(int amt){
        System.out.println(" ");
        if(checkingAmount < amt)
        {
            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            rainyDayFund = (rainyDayFund - amt);
            System.out.println(amt +" Dollars has been withdrawn from your rainy day fund.");
            System.out.println("Remaining Balance: " + rainyDayFund);
        }

    }

}