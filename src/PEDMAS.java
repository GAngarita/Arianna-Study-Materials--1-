public class PEDMAS {
    public static void runProgram() {
        // Topic: PEMDAS
        // Example: (8 x 3) + 6 / 3
        
        int userCutOff = 1;
        while (userCutOff == 1) {
            System.out.println("PEMDAS");        
            System.out.println();
            
            firstOperation = randomizeOperation();
            secondOperation = randomizeOperation();
            thirdOperation = randomizeOperation();
            PEMDAS_1();
            
            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutOff = Program.input.nextInt();
        }
    }

    private static int number1; // 1st number in the example
    private static int number2; // 2st number in the example
    private static int number3; // 3st number in the example
    private static int number4; // 4st number in the example
    private static int firstOperation; // 1 = multiplying, 0 =dividing for the first operation
    private static int secondOperation; // 1 = addition, 0 = subtraction for the second operation
    private static int thirdOperation; // 1 = multiplying, 0 = dividing for the third operation
    private static int number5; // 1st number dependent on firstOperation`
    private static int number6; // 2nd number dependent on secondOperation

    private static void PEMDAS_1() {
        generateNumbers();
        PEMDAS_2();
    }
    
    private static void PEMDAS_2() {
        System.out.print("(" + number1 + " ");

        if(firstOperation == 1) {
            System.out.print("x ");
        }
        else {
            System.out.print("/ ");
        }
        
        System.out.print(number2 + ") "); 
        
        if(secondOperation == 1) {
            System.out.print("+ ");
        }
        else {
            System.out.print("- ");
        }
        
        System.out.print(number3 + " ");
        
        if(thirdOperation == 1) {
            System.out.print("x ");
        }
        else {
            System.out.print("/ ");
        }
        
        System.out.println(number4);
        System.out.println("Enter your answer: ");
        int userAnswer = Program.input.nextInt();
        
        checkAnswer(userAnswer);
    }
    
    private static void checkAnswer(int userAnswer) {
        // take care of all 4 situations
        int correctAnswer;
        
        if(secondOperation == 1) {
            correctAnswer = number5 + number6;
        }
        else {
            correctAnswer = number5 - number6;
        }
        
        if(userAnswer == correctAnswer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
            System.out.println("The correct answer is " + correctAnswer);
        }
    }
    
    private static void generateNumbers() {
        // Should I draw from a pool of numbers that are divisble?
        randomizeFirstSetOfNums(firstOperation);
        randomizeSecondSetOfNums(thirdOperation);
        
        if(firstOperation == 1) {
            number5 = number1*number2;
        }
        else {
            number5 = number1/number2;
        }
        
        if(thirdOperation == 1) {
            number6 = number3*number4;
        }
        else {
            number6 = number3/number4;
        }
        
        if(secondOperation == 0 && number6 > number5) {
            generateNumbers();
        }
    }
    
    private static void randomizeFirstSetOfNums(int op) {
        number1 = (int)(Math.random()*10 + 1);
        number2 = (int)(Math.random()*10 + 1);
        
        if(op == 0) {
            number1 *= number2;
        }
    }
    
    private static void randomizeSecondSetOfNums(int op) {
        number3 = (int)(Math.random()*10 + 1);
        number4 = (int)(Math.random()*10 + 1);

        if(op == 0) {
            number3 *= number4;
        }
    }
    
    private static int randomizeOperation() {
        return (int)(Math.random()*2);
    }
}