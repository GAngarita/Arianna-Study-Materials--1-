public class GCF {
    public static void runProgram() {
        // Topic: GCF (greatest common factor)

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Greatest Common Factor: ");        
            System.out.println();
            
            generateRandomNumbers();
            problem();

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }

    private static int number1;
    private static int number2;
    
    private static void generateRandomNumbers() {
        number1 = (int)(Math.random()*10 +1) * (int)(Math.random()*10 +1);
        number2 = (int)(Math.random()*10 +1) * (int)(Math.random()*10 +1);

        if(number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }

    private static void problem() {
        System.out.println("What is the GCF of " + number1 + " and " + number2);
        int num = Program.input.nextInt();

        checkSolution(num); 
    }

    private static void checkSolution(int num) {
        // recursion GCF
        int GCF = 0;
        
        for(int i = 1; i <= number1; i++) {
            if(number1 % i == 0 && number2 % i == 0) {
                GCF = i;
            }
        }

        if(num == gcd(number1, number2)) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
            System.out.println("The correct answer is " + GCF);
        }
    }

    public static int gcd(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;

    }
}