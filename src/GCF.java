public class GCF {
    public static void runProgram() {
        // Topic: GCF (greatest common factor)

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("GCF");        
            System.out.println();
            
            generateRandomNumbers();
            gcf();

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }

    private static int number1;
    private static int number2;
    
    public static void generateRandomNumbers() {
        number1 = (int)(Math.random()*10 +1) * (int)(Math.random()*10 +1);
        number2 = (int)(Math.random()*10 +1) * (int)(Math.random()*10 +1);

        if(number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }

    public static void gcf() {
        System.out.println("What is the GCF of " + number1 + " and " + number2);
        int num = Program.input.nextInt();

        checkSolution(num); 
    }

    public static void checkSolution(int num) {
        int GCF = 0;
        
        for(int i = 1; i <= number1; i++) {
            if(number1 % i == 0 && number2 % i == 0) {
                GCF = i;
            }
        }

        if(num == GCF) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
            System.out.println("The correct answer is " + GCF);
        }
    }
}