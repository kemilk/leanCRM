package com.ironhack.leancrm;

import com.ironhack.leancrm.common.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Scan {

    public static final String commandStart = "What do you want to do? Please type in one of the following commands:";
    public static final String commandEscCrm = "__________ Bye bye and thanks for using Tiefflieger-CRM __________";
    public static final String commandNextStep = ">>> Do you want to do anything else in the CRM? Please type in the corresponding Number <<<";
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


                String cmd = Utils.removeNumeric(i);    //devide parts of command (cms and id if provided)
                Integer id = Utils.removeAlphabetic(i);



                switch (cmd) {
                    case "NEW LEAD":

                        System.out.println("\n" + " >>> Please confirm every input by pressing Enter <<< " + "\n");

                        System.out.println("Please type in the name of the Lead: ");
                        String name = input.nextLine();
                        System.out.println("Please type in the phone Number of the Lead: ");
                        String number = input.nextLine();
                        System.out.println("Please type in the E-Mail address of the Lead: ");
                        String email = input.nextLine();
                        System.out.println("Please type in the Company Name of the Lead: ");
                        String companyName = input.nextLine();

                        Lead lead1 = new Lead (name, number, email, companyName);
                        System.out.println("Lead " + name + " is created with id: " + lead1.getId());


                        System.out.println(("\n" + (char) 27 + "[47m" + commandNextStep + "\033[0m" + "\n"));
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
                        break;

                    case "SHOW LEADS":
                        System.out.println(" --- All the Leads in our System: --- ");

                        try {
                            loading();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                        if(Lead.showLeads().size() != 0){
                            for(Lead lead:Lead.showLeads()){
                                System.out.println(lead.getId() + "/" + lead.getName());
                            }
                        }else {System.out.println("no Leads in LeadList"); }


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

                    case "LOOKUP LEAD":      //"ID" has to be the corresponding Lead ID

                        try {
                            loading();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        try {
                            System.out.println(Lead.lookUpLead(id).toString());
                        } catch (NullPointerException e) {
                            System.out.println("there is no Lead with this ID");
                        }


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

                    case "CONVERT":  //"ID" has to be the corresponding Lead ID


                        if(Lead.lookUpLead(id) != null){
                            Lead.convertToOpportunity(id);
                        }else {System.out.println("no Lead with this ID"); }


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

                    case "CLOSE-LOST":
                        Opportunity.opportunityMap.get(id).setStatus(Status.CLOSED_LOST);
                        System.out.println(" the Opportunity with ID " + id + "was set to 'LOST'");

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

                    case "CLOSE-WON":

                        Opportunity.opportunityMap.get(id).setStatus(Status.CLOSED_WON);
                        System.out.println(" the Opportunity with ID " + id + "was set to 'WON'");

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

    public static void loading() throws InterruptedException, IOException {
        for (int x = 0; x <= 100; x++) {
            System.out.print((char) 27 + "[31m");
            String data = "\r" + " >>>>>>> Loading " + x + " %";
            System.out.write(data.getBytes());
            Thread.sleep(9);
        }
        System.out.println("\033[0m" + " ");
    }

    // Integer oppInfoQuantity = Scan.getInfoForOpportunityQuantity();

    public static Integer getInfoForOpportunityQuantity() {
        String oppInfoQuantity;
        while (true) {
            System.out.println("please enter the quantity of Trucks the Lead want to buy");
            Scanner input = new Scanner(System.in);
            oppInfoQuantity = input.next();
            if (oppInfoQuantity.matches("\\d+") && Integer.valueOf(oppInfoQuantity) > 0) {
                break;
            } else {
                System.out.println("Enter an valid number!");
            }
        }
        Scanner input = new Scanner(System.in);
        return Integer.valueOf(oppInfoQuantity);
    }
    //Product oppInfoProduct = Scan.getInfoForOpportunityProduct();

    public static Product getInfoForOpportunityProduct() {
        while (true) {
            System.out.println("please choose the Producttype");
            System.out.println("HYBRID Truck (1)");
            System.out.println("FLATBED Truck (2)");
            System.out.println("BOX Truck (3)");
            Scanner input = new Scanner(System.in);
            String i = input.next();
            switch (i) {
                case "1":
                    return Product.HYBRID;
                case "2":
                    return Product.FLATBED;
                case "3":
                    return Product.BOX;
                default:
                    System.out.println("Enter a number between 1 and 3!");
            }
        }
    }

    //Industry accInfoIndustry = Scan.getInfoForAccountIndustry();

    public static Industry getInfoForAccountIndustry() {
        Industry accInfoIndustry;
        while (true) {
            System.out.println("please choose the type of industry");
            System.out.println("PRODUCE (1)");
            System.out.println("ECOMMERCE Truck (2)");
            System.out.println("MANUFACTURING (3)");
            System.out.println("MEDICAL (4)");
            System.out.println("OTHER (5)");
            Scanner input = new Scanner(System.in);
            String i = input.next();
            switch (i) {
                case "1":
                    return Industry.PRODUCE;
                case "2":
                    return Industry.ECOMMERCE;
                case "3":
                    return Industry.MANUFACTURING;
                case "4":
                    return Industry.MEDICAL;
                case "5":
                    return Industry.OTHER;
                default:
                    System.out.println("Enter a number between 1 and 5!");
            }
        }
    }

    //Integer accInfoEmployees = Scan.getInfoForAccountEmployees();

    public static Integer getInfoForAccountEmployees() {
        String accInfoEmployees;
        while (true) {
            System.out.println("please enter the number of employee");
            Scanner input = new Scanner(System.in);
            accInfoEmployees = input.next();
            if (accInfoEmployees.matches("\\d+") && Integer.valueOf(accInfoEmployees) > 0) {
                break;
            } else {
                System.out.println("Enter an valid number!");
            }
        }
        Scanner input = new Scanner(System.in);
        return Integer.valueOf(accInfoEmployees);
    }

    //String accInfoCity = Scan.getInfoForAccountCity();

    public static String getInfoForAccountCity() {
        String accInfoCity;
        while (true) {
            System.out.println("please enter the cityname");
            Scanner input = new Scanner(System.in);
            accInfoCity = input.next();
            if (accInfoCity.matches("\\D{2,16}")) {
                break;
            } else {
                System.out.println("Enter an valid name!");
            }
        }
        Scanner input = new Scanner(System.in);
        return accInfoCity;
    }

    //String accInfoCountry = Scan.getInfoForAccountCountry();

    public static String getInfoForAccountCountry() {
        String accInfoCountry;
        while (true) {
            System.out.println("please enter the countryname");
            Scanner input = new Scanner(System.in);
            accInfoCountry = input.next();
            if (accInfoCountry.matches("\\D{2,16}")) {
                break;
            } else {
                System.out.println("Enter an valid name!");
            }
        }
        Scanner input = new Scanner(System.in);
        return accInfoCountry;
    }

}

