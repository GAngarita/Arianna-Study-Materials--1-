public class Simplify {
    public static void runProgram() {
        // Simplfying Fractions

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Simplfy Fractions");        
            System.out.println();

            simplify();

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }
    
    private static void generateNumbers() {
        boolean check = false;
        while(!check) {
            numerator = (int)(Math.random() * 30 + 1);
            denominator = numerator * (int)(Math.random() * 7 + 2);
            numerator *= (int)(Math.random() * 2 + 2);
            check = checkGenerateNumbers(numerator, denominator);
        }
    }

    private static boolean checkGenerateNumbers(int numerator, int denominator) {
        gcd = GCF.gcd(numerator, denominator);

        if(numerator/gcd == 1) {
            return false;
        }
        else if(numerator / gcd == numerator || denominator / gcd == denominator) {

        }

        return true;
    }

    private static int numerator;
    private static int denominator;
    private static int gcd;

    private static void simplify() {
        generateNumbers();
        System.out.println("Simplify " + numerator + "/" + denominator + " (enter your answer in number/number format)");
        Program.input.nextLine();
        String fraction = Program.input.nextLine();
        int userNumerator = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
        int userDenominator = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1));

        checkSolution(userNumerator, userDenominator);
    }

    private static void checkSolution(int userNumerator, int userDenominator) {
       // System.out.println("The gcd is " + gcd);
        numerator /= gcd;
        denominator /= gcd;
        
        if(numerator == userNumerator && denominator == userDenominator) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
            System.out.println("The correct fraction is " + numerator + "/" + denominator);
        }
    }
}