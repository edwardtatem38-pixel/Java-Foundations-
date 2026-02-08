import java.util.Scanner;
public class BankStatementGenerator {
    public static void main(String[] args){
        // important code goes here !
        Scanner  scanner = new Scanner(System.in);

        // 1. start array
        // java must define the size [3] upfront
        int[] scoreHistory = new int[3];

        System.out.println("End of Day Batch Processor");

        // For LOOP used  exact amount times to run 
        // loop 3 times to fill the array 
        for (int i =0; i < scoreHistory.length; i++) {
            System.out.print("Enter score for customer #" + (i + 1) + ": ");
            scoreHistory[i] = scanner.nextInt(); // storing input in array 

        }

        System.out.println("\n FINAL BANIK STATEMENT");

        // Data retrieval pulling data back out of the array
        for (int i = 0; i < scoreHistory.length; i++) {
            // re using strict math 
            double probability = (double) scoreHistory[i] / 850 * 100;
            System.out.println("Customer" + (i + 1) + "Score: " + scoreHistory[i] + " Approval: " + probability + "%");

        }

        scanner.close();
    }
}