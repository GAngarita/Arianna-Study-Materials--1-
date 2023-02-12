public class LCM {
    public static void runProgram() {
        // Topic: LCM (least common multiple)

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("LCM");        
            System.out.println();
            
            generateRandomNumbers();
            lcm();

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }

    private static int number1;
    private static int number2;
    
    private static void generateRandomNumbers() {
        number1 = (int)(Math.random()*9 +2);
        number2 = (int)(Math.random()*9 +2);

         while(number1 == number2 || number1 > number2) {
           number1 = (int)(Math.random()*(9)+ 2);
       }
    }

    private static void lcm() {
        System.out.println("What is the LCM of " + number1 + " and " + number2);
        int num = Program.input.nextInt();

        checkSolution(num); 
    }

    private static void checkSolution(int num) {
        int LCM = number1/GCF.gcd(number1, number2) * number2;
        
        if(num == LCM) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
            System.out.println("The correct answer is " + LCM);
        }
    }
}