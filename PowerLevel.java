public class PowerLevel {
    public static void main(String[] args) {
        // variables storing information
        String traineeName = "Elric";
        int basePower = 9001;
        double boostPercentage = 0.15; // 15 % training boost

        // logic for calculating the new value
        double totalPower = basePower + (basePower * boostPercentage);

        // Output Printing results
        System.out.println("Trainee Name: " + traineeName);
        System.out.println("Original Power: " + basePower);
        System.out.println("Post-Training Power: " + totalPower);
    }
}