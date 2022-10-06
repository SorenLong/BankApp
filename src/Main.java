public class Main {

    public static void main(String[] args) throws Exception {

        /*

            Hello, this is a small terminal based program that acts as a banking app. This is for my grade 12 computer
            science class. As with all my programs anyone is free to fork and edit it as they please. This program was
            written by Soren Long on 2022 - 10 - 01

         */

        //Creating simple introduction messages
        System.out.println("\nWelcome to my banking application. This will allow you to interact with the console and deposit" +
                "withdraw and apply for credit from an account.");

        System.out.println("An additional feature ive added is a password and login the default can be changed in the Login" +
                "class By default the acc number is 111 and password is 222");

        //initiating the program
        accountsInformation b = new accountsInformation();
        b.initiate();
    }

}