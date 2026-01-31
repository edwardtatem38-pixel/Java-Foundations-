import java.util.Scanner; // imports the ear that listens to your keyboard

public class InteractivePower {
    public static void main(String[] args) {
        // create the scanner object
        Scanner keyboard = new Scanner(System.in);

        // get user input
        System.out.print("Enter your trainee name: ");
        String name = keyboard.nextLine(); // waits for you to type a number

        System.out.print("Enter your current power level: ");
        int power = keyboard.nextInt(); // waits for you type a number

        // calculation 
        double boost = power * 1.15;

        // Output results
        System.out.println("\n--- Result ---");
        System.out.println("Trainee:" + name);
        System.out.println("Boosted Power Level: " + boost);

        // close the listener
        keyboard.close();

    }
}