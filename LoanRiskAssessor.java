// 1. IMPORT: This brings in the tool to read user input. 
// In Python, this is just 'input()'; in Java, we must import the Scanner class.
import java.util.Scanner;

// 2. CLASS: The container for your entire program. 
// It MUST match your filename (LoanRiskAssessor.java) exactly.
public class LoanRiskAssessor {

    // 3. MAIN METHOD: The 'engine' that starts the program. 
    // Everything between these { } braces is what actually executes.
    public static void main(String[] args) {

        // 4. SCANNER OBJECT: We create an instance of the Scanner called 'scanner'.
        // System.in tells it to listen to your keyboard.
        Scanner scanner = new Scanner(System.in);

        // 5. PROMPT & INPUT: Print a message and save the next whole number (int) the user types.
        System.out.print("Enter Credit Score (300-850): ");
        int creditScore = scanner.nextInt();

        // 6. THE "STRICT MATH" (CASTING): 
        // '(double)' is the magic word. It converts the integer 'creditScore' into a 
        // decimal temporarily so the division doesn't just round down to zero.
        // This is where Java's precision shines compared to Python's "best guess".
        double riskProbability = (double) creditScore / 850;

        // 7. OUTPUT: We display the results. 
        // The '+' symbol "glues" (concatenates) the text and the calculated value together.
        System.out.println("--- Risk Analysis ---");
        System.out.println("Probability of Repayment: " + (riskProbability * 100) + "%");

        // 8. LOGIC GATES: Standard if/else logic to categorize the data based on the math.
        if (riskProbability > 0.8) {
            System.out.println("Verdict: Low Risk Asset");
        } else {
            System.out.println("Verdict: High Risk Asset");
        }

        // 9. CLEANUP: Always close your scanner to free up memory (a standard Java best practice).
        scanner.close();

    } // Ends the main method
} // Ends the class   