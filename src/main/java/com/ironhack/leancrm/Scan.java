package com.ironhack.leancrm;

import java.util.Scanner;

public class Scan {

    public static final String commandStart = "What do you want to do? Please type in one of the following commands:";
    public static final String commandEscCrm = "__________ Bye bye and thanks for updating the CRM __________";
    public static final String commandNextStep = "---- Do you want to do anything else in the CRM? Please type in the corresponding Number ----";
    public static final String commandGoOn = "Do something else in the Program: ";
    public static final String commandLeave = "Leave CRM: ";
    public static final String commandClose = "Please type in the ID of the Opportunity you want to close";


    public static void inputScan() {

        while (true) {

            Scanner input = new Scanner(System.in);
            String i;
            Boolean inProgram = true;

            while (inProgram == true) {

                System.out.println((char) 27 + "[7m" + "\n" + commandStart + "\n" + "\033[0m");

                System.out.println("     New Lead ");
                System.out.println("     Show Leads ");
                System.out.println("     Lookup Lead id ");
                System.out.println("     Convert id ");
                System.out.println("     close-lost id ");
                System.out.println("     close-won id " + "\n");
                System.out.println("To Leave the Program: ESC CRM ");
                i = input.nextLine().toUpperCase();     //to make the user input case insensitive (all switch cases are UpperCase Letters)


                switch (i) {
                    case "NEW LEAD":

                        System.out.println("Please type in the name of the Lead: ");
                        System.out.println("Please type in the phone Number of the Lead: ");
                        System.out.println("Please type in the E-Mail address of the Lead: ");
                        System.out.println("Please type in the Company Name of the Lead: ");


                        //extra scanner-method for user Input?

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + commandNextStep + "\033[0m" + "\n"));
                        System.out.println(commandGoOn + (char) 27 + "\033[1m" + "(1)" + "\033[0m");
                        System.out.println(commandLeave + (char) 27 + "\033[1m" + "(2)" + "\033[0m");

                        String b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println(" ");
                                break;
                            case "2":
                                escProgram();
                        }
//                            fileWriter to print in File
//                            createID();
//                            showLeads();
                        break;
                    case "SHOW LEADS":
                        System.out.println(" --- All the Leads in our System: --- ");

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + commandNextStep + "\033[0m" + "\n"));
                        System.out.println(commandGoOn + (char) 27 + "\033[1m" + "(1)" + "\033[0m");
                        System.out.println(commandLeave + (char) 27 + "\033[1m" + "(2)" + "\033[0m");


                        b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println(" ");
                                break;
                            case "2":
                                escProgram();
                        }
                        break;

                    case "LOOKUP LEAD ID":
                        System.out.println(" --- Please type in the Lead ID to get the corresponding Information --- ");

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + commandNextStep + "\033[0m" + "\n"));
                        System.out.println(commandGoOn + (char) 27 + "\033[1m" + "(1)" + "\033[0m");
                        System.out.println(commandLeave + (char) 27 + "\033[1m" + "(2)" + "\033[0m");


                        b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println(" ");
                                break;
                            case "2":
                                escProgram();
                        }
                        break;

                    case "CONVERT ID":
                        System.out.println(" --- Please type in the ID to convert the corresponding Lead into Opportunity --- ");

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + commandNextStep + "\033[0m" + "\n"));
                        System.out.println(commandGoOn + (char) 27 + "\033[1m" + "(1)" + "\033[0m");
                        System.out.println(commandLeave + (char) 27 + "\033[1m" + "(2)" + "\033[0m");


                        b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println(" ");
                                break;
                            case "2":
                                escProgram();
                        }
                        break;

                    case "CLOSE-LOST ID":
                        System.out.println(commandClose + " (Lost):");

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + commandNextStep + "\033[0m" + "\n"));
                        System.out.println(commandGoOn + (char) 27 + "\033[1m" + "(1)" + "\033[0m");
                        System.out.println(commandLeave + (char) 27 + "\033[1m" + "(2)" + "\033[0m");

                        b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println(" ");
                                break;
                            case "2":
                                escProgram();
                        }
                        break;

                    case "CLOSE-WON ID":
                        System.out.println(commandClose + " (Won)");

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + commandNextStep + "\033[0m" + "\n"));
                        System.out.println(commandGoOn + (char) 27 + "\033[1m" + "(1)" + "\033[0m");
                        System.out.println(commandLeave + (char) 27 + "\033[1m" + "(2)" + "\033[0m");

                        b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println(" ");
                                break;
                            case "2":
                                escProgram();
                        }
                        break;

                    case "ESC CRM":
                        escProgram();

                    default:
                        System.out.println("Bitte gib einen passenden Befehl ein!");
                        break;
                }

            }
        }

    }

    public static void escProgram() {
        System.out.println("\n" + (char) 27 + "[31m" + "\u001b[1m" + commandEscCrm + "\033[0m" + "\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}


