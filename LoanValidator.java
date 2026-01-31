import java.util.Scanner;

public class LoanValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- JPMC Mock Loan Portal ---");

        // gather user data 
        System.out.print("Enter your Annual Income: $");
        double income = input.nextDouble();

        System.out.print("Enter your credit score (300-850):");
        int creditScore = input.nextInt();

        // Decision Logic (Nestd if/Else)
        if (income >= 30000) {
            if (creditScore >= 650) {
                System.out.println("Status: APPROVED");

                // conditional interest rate logic
                double interestRate;
                if (creditScore >= 750) {
                    interestRate = 3.5; // Excellent credit
        
                } else if (creditScore >= 700) {
                    interestRate = 5.0; // Good credit
                } else {
                    interestRate = 7.5; // Fair credit
                }
                System.out.println("Your personalized interest rate is:" + interestRate + "%");
            } else {
                System.out.println("Status: REJECTED");
                System.out.println("Reason: Credit score too low for our current requirments.");
            }
        } else {
            System.out.println("Status: REJECTED");
            System.out.println("Reason: Minimum income requirement not met.");
        }
        System.out.println("-----------------------");
        input.close();
    }
}