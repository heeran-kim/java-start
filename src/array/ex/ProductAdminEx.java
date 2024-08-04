package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        // dynamic allocation
        int maxProducts = 10;
        // class
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("1. Register Product | 2. Product List | 3. Terminate\nEnter the Menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1: {
                    if (productCount >= 10){
                        System.out.println("Cannot register another products.");
                        continue;
                    }
                    System.out.print("Enter the name of the product: ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("Enter the price of the product: ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                    break;
                }
                case 2: {
                    if (productCount == 0){
                        System.out.println("There is no product in the list.");
                        continue;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + " won");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Terminate the program.");
                    return;
                }
                default: {
                    System.out.println("Wrong number");
                    break;
                }
            }

            System.out.println();
        }
    }
}
