package com.ironhack.leancrm;

import java.util.Scanner;

public class Scan {

    public static void inputScan() {

        while (true) {

            Scanner input = new Scanner(System.in);
            String i;
            Boolean inProgram = true;

            while (inProgram == true) {

                System.out.println((char)27 + "[7m"+ "\n"+"     What do you want to do? Please type in one of the following commands:    "+ "\n" + "\033[0m" );

                System.out.println("     New Lead ");
                System.out.println("     Show Leads ");
                System.out.println("     Lookup Lead id ");
                System.out.println("     Convert id ");
                System.out.println("     close-lost id ");
                System.out.println("     close-won id " + "\n");
                System.out.println("To Leave the Program: ESC CRM ");
                i = input.nextLine().toUpperCase();


                switch (i) {
                    case "NEW LEAD":
                        System.out.println("Please type in the name, phone Number, Email address and the company Name of the Lead (in that order)");

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + "----Do you want to do anything else in the CRM?----" + "\033[0m" + "\n"));

                        System.out.println("Do something else in the Program: "+ (char)27 + "\033[1m"+ "(1)"+ "\033[0m");
                        System.out.println("Leave CRM: "+ (char)27 + "\033[1m"+ "(2)"+ "\033[0m");

                        String b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println("-------------");
                                break;
                            case "2":
                                System.out.println("\n" + (char) 27 + "[31m" + "\u001b[1m"+ "__________ Bye bye and thanks for updating the CRM __________"+ "\033[0m" +"\n");
                                System.exit(0);
                        }
//                            fileWriter to print in File
//                            createID();
//                            showLeads();
                        break;
                    case "SHOW LEADS":
                        System.out.println(" --- All the Leads in our System: --- ");

                        System.out.println(("\n" + (char) 27 + "\u001b[47m" + "----Do you want to do anything else in the CRM?----" + "\033[0m" + "\n"));

                        System.out.println("Do something else in the Program: "+ (char)27 + "\033[1m"+ "(1)"+ "\033[0m");
                        System.out.println("Leave CRM: "+ (char)27 + "\033[1m"+ "(2)"+ "\033[0m");


                        b = input.nextLine();
                        switch (b) {
                            case "1":
                                System.out.println("-------------");
                                break;
                            case "2":
                                System.out.println("\n" + (char) 27 + "[31m" + "\u001b[1m"+ "__________ Bye bye and thanks for updating the CRM __________"+ "\033[0m" +"\n");
                                System.exit(0);
                        }
                        break;

                    case "ESC CRM":
                        System.out.println("\n" + (char) 27 + "[31m" + "\u001b[1m"+ "__________ Bye bye and thanks for updating the CRM __________"+ "\033[0m" +"\n");
                        System.exit(0);
                    default:
                        System.out.println("Bitte gib einen passenden Befehl ein!");
                        break;
                }

            }
        }

    }
}


