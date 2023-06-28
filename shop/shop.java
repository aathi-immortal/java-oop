package shop;

import java.util.Scanner;

public class shop extends Delux_Pizza {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        // Pizza ob = null;
        while (true) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println(" 1.Base_Pizza \n " +
                    "2. Delux_Pizza \n" +
                    "3. Cancel The Order...\n\n");

            System.out.print("enter the Choice:");
            choice = scan.nextInt();
            if (choice == 1) {

                Base_Pizza ob = new Base_Pizza();
                ob.pizza_Type_List();
                System.out.print("enter the choice:");
                choice = scan.nextInt();
                if (choice == 1) {
                    ob.cheese_Type("Veg");
                } else if (choice == 2) {
                    ob.cheese_Type("Non_Veg");
                } else {
                    break;
                }
                while (true) {
                    ob.addOn_List();
                    System.out.print("enter the choice:");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        ob.extra_Cheese();
                    } else if (choice == 2) {
                        ob.extra_toppings();
                    } else if (choice == 3) {
                        ob.take_Away();
                    } else {
                        break;
                    }
                }
                System.out.println(ob.total);
            } else if (choice == 2) {
                Delux_Pizza ob = new Delux_Pizza();

                ob.pizza_Type_List();
                System.out.print("enter the choice:");
                choice = scan.nextInt();
                if (choice == 1) {
                    ob.cheese_Type("Veg");
                } else if (choice == 2) {
                    ob.cheese_Type("Non_Veg");
                } else {
                    break;
                }

                while (true) {
                    ob.addOn_List();
                    System.out.print("enter the choice:");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        ob.take_Away();
                    } else {
                        break;
                    }
                }

                System.out.println(ob.total);
            } else if (choice == 3) {
                System.out.println("Thank you");
                break;
            } else {
                System.out.println("Please enter the correct choice");
            }

        }
    }
}
