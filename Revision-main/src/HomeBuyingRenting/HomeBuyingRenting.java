package HomeBuyingRenting;

import java.util.Scanner;

/* The objective of the program is to get the customer details, then list the locations where homes are available.
 * Then ask them if they are interested in buying or renting a home. 
 * Then ask the user more details about the home they are interested in, like total area, their budget, and maybe even the location.
 * Once all the details are given, the program should display the list of homes that closely matche the customer's requirements.
 * Then, ask the customer if they would like a home showing. If yes, then ask the customer for the date of the showing.
 * Then display to the customer a confirmation of the home they chose, the date of showing, and the agent that will help them with the showing.
*/

public class HomeBuyingRenting {

    Scanner input = new Scanner(System.in);

    private String homeDescription; /* Has details like ID, number of bedrooms, halls, kitchen, bathroom, galleries, 
                                    total area, type of property, price, build year, current status, etc.*/
    
    private String homeAddress;
    private double homePrice;
    private String agentDetails; /* Has details like name, email, phone, etc. */
    private String customerName;
    private String customerEmailAddress;
    private String homeShowingDate;

    public void homeShowing(){

        System.out.println("Welcome. Before we begin, please provide your full name:");

        String name = input.nextLine();

        System.out.println("\n" + "Please enter your email address:" + "\n");

        String email = input.nextLine();

        System.out.println("\n" + "Thank you for the information. Now, let's begin." + "\n");

        System.out.println("\n" + "Here are the locations where we currently have homes to sell or rent." + "\n");

        for(HomesEnum home: HomesEnum.values()){
            System.out.println(home.getLocation());
        }

        System.out.println("\n" + "Are you interested in buying or renting a home? Enter 'buy' or 'rent':" + "\n");

        String choice = input.nextLine();

        if(choice.equalsIgnoreCase("buy")){
            System.out.println("\n" + "Great!Let's proceed with the home buying process" + "\n");
        } else if(choice.equalsIgnoreCase("rent")){
            System.out.println("\n" + "Great!Let's proceed with the home renting process" + "\n");
        }else{
            System.out.println("\n" + "Invalid choice. Please try again." + "\n");
            return;
        }

        System.out.println("\n" + "Please provide more details about the home you are interested in: " + "\n");

        System.out.println("Enter the total are required (in sq. mt.);");
        double area = input.nextDouble();

        System.out.println("Enter your buget(dollars) : ");
        double budget = input.nextDouble();

        System.out.println("Enter your perferred location : ");
        String location = input.nextLine();

        System.out.println("\n" +"Here are the homes that closely match your reqyiremnets: " + "\n");
        System.out.println("\n" + "Would you like a home showing? Enter 'yes' or 'no':" + "\n");

        String showingChoice = input.nextLine();

        if(showingChoice.equalsIgnoreCase("yes")){
            System.out.println("\n" + "Please enter the date of the showing (YYYY-MM-DD):" + "\n");
            String showingDate = input.nextLine();
            System.out.println("\n" + "Thank you! Your home showing has been scheduled for " + showingDate + "." + "\n");
        }
        else if(showingChoice.equalsIgnoreCase("no")){
            System.out.println("\n" + "Thank you for your interest. If you change your mind, feel free to contact us." + "\n");
        }
        else{
            System.out.println("\n" + "Invalid choice. Please try again." + "\n");
        }


        // Complete the logic for the remainder of the program





    }

    
}
