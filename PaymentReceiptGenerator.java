/*
- Shop Name and Welcome Letter
- Things you can offer (at least 10 items)
- User can ask what are the items that we gonna buy and then how many (quantity) they want
- Discount will be there based on the amount 
- For the first time the coupon will be there.
- Total bill (After Tax and all)
- Thanking the customer
*/

import java.util.Scanner;

public class PaymentReceiptGenerator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello Customer! Welcome to Mehta's Shop! Here, we offer a variety of items.");
        System.out.println("Enter 'yes' to start shopping or 'no' to exit our store: ");
        String firstUserChoice = myScanner.nextLine().toLowerCase();

        if (firstUserChoice.equals("yes")) {

            double totalBill = 0; // <-- Added only for storing total
            boolean shopping = true; // <-- Loop controller

            while (shopping) {

                System.out.println("\nThe items we offer are as following: ");
                System.out.println("1. Blue Jeans\n2. Hoodies\n3. Jackets\n4. Belts\n5. Perfume\n6. Coats\n7. Jewelry\n8. Sunglasses\n9. Purses\n10. Headphones");
                System.out.println("Enter one of the numbers to see some information about it: ");

                int userItemChoice = myScanner.nextInt();
                myScanner.nextLine(); // FIX scanner bug

                if (userItemChoice == 1) {

                    System.out.println("Okay! Blue jeans available for men, women, and kids.");
                    System.out.println("Enter 'men', 'women', or 'kids': ");
                    String userFirstJeans = myScanner.nextLine().toLowerCase();

                    if (userFirstJeans.equals("men")) {
                        System.out.println("Size Options: 1=Small, 2=Medium, 3=Large, 4=XL");
                        int menJeansSize = myScanner.nextInt();
                        System.out.println("Price: $35");
                        
                        if (menJeansSize < 1 || menJeansSize > 4) {
                            System.out.println("Invalid size. Going back...");
                        } else {
                            System.out.println("How many jeans would you like?");
                            int qty = myScanner.nextInt();
                            int price = qty * 35;
                            totalBill += price;
                            System.out.println("Added to cart: $" + price);
                        }
                        myScanner.nextLine();
                    }

                    else if (userFirstJeans.equals("women")) {
                        System.out.println("Size Options: 1=Small, 2=Medium, 3=Large, 4=XL");
                        int womenJeansSize = myScanner.nextInt();
                        System.out.println("Price: $35");

                        if (womenJeansSize < 1 || womenJeansSize > 4) {
                            System.out.println("Invalid size. Going back...");
                        } else {
                            System.out.println("How many jeans would you like?");
                            int qty = myScanner.nextInt();
                            int price = qty * 35;
                            totalBill += price;
                            System.out.println("Added to cart: $" + price);
                        }
                        myScanner.nextLine();
                    }

                    else if (userFirstJeans.equals("kids")) {
                        System.out.println("Size Options: 1=Small, 2=Medium, 3=Large");
                        int kidJeansSize = myScanner.nextInt();
                        System.out.println("Price: $20");

                        if (kidJeansSize < 1 || kidJeansSize > 3) {
                            System.out.println("Invalid size. Going back...");
                        } else {
                            System.out.println("How many jeans would you like?");
                            int qty = myScanner.nextInt();
                            int price = qty * 20;
                            totalBill += price;
                            System.out.println("Added to cart: $" + price);
                        }
                        myScanner.nextLine();
                    }

                    else {
                        System.out.println("Invalid category!");
                    }
                }

                // No other item details were given by you, so not modified.
                // Only Blue Jeans block existed originally — so it remains same.

                System.out.println("\nDo you want to buy more items? (yes/no)");
                String more = myScanner.nextLine().toLowerCase();

                if (!more.equals("yes")) {
                    shopping = false;
                }
            }

            // ---- CHECKOUT ----
            System.out.println("\n----- FINAL CHECKOUT -----");
            System.out.println("Your total bill is: $" + totalBill);
            System.out.println("Thank you for shopping with us!");
        }
    }
}
