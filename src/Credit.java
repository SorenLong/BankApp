import java.util.Scanner;
class Credit{
    int desiredCredit= 0;
    int crdtscr=0;

    public int userInput()
    {
        //Takes user input
        Scanner scanner = new Scanner(System.in);

        //Asks user for credit score - Can be adjusted based on desired approval (is at 650 because google said that was a good score)
        System.out.println("Please enter current credit score: ");
        crdtscr = scanner.nextInt();
        if(crdtscr >=650){
            System.out.println("Congratulations, you have been approved for credit.");
            System.out.println("Enter desired credit: ");
            desiredCredit = scanner.nextInt();
        }

        if (crdtscr<=649){
            System.out.println("We cannot accept this request, please try again when you have a higher credit score.");
        }else{
            return desiredCredit;
        }
        return desiredCredit;

    }
}