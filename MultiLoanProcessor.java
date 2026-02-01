import java.util.Scanner;

public class MultiLoanProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("--- JPMC Multi-Customer Loan Portal ---");

        // THIS IS THE KEY PART YOU WERE MISSING:
        while (keepRunning) { 
            System.out.print("\nEnter Annual Income (or type 0 to quit): $");
            double income = scanner.nextDouble();

            if (income == 0) {
                keepRunning = false;
                System.out.println("Closing Portal. Have a great day!");
                break; // This now has a loop to break out of!
            }

            System.out.print("Enter Credit Score: ");
            int creditScore = scanner.nextInt();

            if (income >= 50000 && creditScore >= 650) {
                double rate = (creditScore >= 750) ? 3.5 : 5.0;
                System.out.println("Status: APPROVED");
                System.out.println("Your rate: " + rate + "%");
            } else {
                System.out.println("Status: REJECTED");
                System.out.println("Reason: Does not meet minimum requirements.");
            }
            System.out.println("---------------------------------------");
        } // This brace ends the while loop

        scanner.close(); // This must stay inside the main method braces
    } // This brace ends the main method
}