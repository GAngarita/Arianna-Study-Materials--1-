public class Decimal_Operations {
    public static void runProgram() {
        // Topic: Addition, Subtracting, Multiplying and Dividing Decimals
        // Randomly generated numbers and rounded decimals to hundredths place if neccessary and compares to the answer 
        int userCutoff = 1; 
        while (userCutoff == 1) {
            System.out.println("Adding, Subtracting, Multiplying and Dividing Decimals: "); 
            System.out.println();
            System.out.println("Pick a category:");
            System.out.println("1. Adding \n2. Subtracting\n3. Multiplying\n4. Dividing\n"); 
            int categoryChoice = Program.input.nextInt();
            System.out.println();

            category(categoryChoice);
           
            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt(); // back to main menu
        }
        
        Menu.startProgram();
    }
    
    //picks a category and redirects to cooresponding method
    private static void category(int categoryChoice) {
        if(categoryChoice == 1) {
            additon(); 
        }
        else if(categoryChoice == 2) {
            subtraction();
        }
        else if(categoryChoice == 3) {
            multiplication(); 
        }
        else if(categoryChoice == 4) {
            division(); 
        }
    }

    // addtion methods - just addition problems with decimals/ no rounding in this method
    private static void additon() {
        int userCutoff = 1; 
        while(userCutoff == 1) {
            double variable1 = 0; 
            double variable2 = 0; 
            for(int i = 0; i < 4; i++) {
                variable1 *= 10; 
                variable1 += (int)(Math.random()*(9) + 1); 
            }
            variable1 /= 100; 

            for(int i = 0; i < 4; i++) {
                variable2 *= 10;
                variable2 += (int)(Math.random()*(9) + 1); 
            }
            variable2 /= 100; 

            System.out.println(variable1+ " + "+variable2+ " = ?"); 
            System.out.println("Enter your answer:"); 
            double userAnswer = Program.input.nextDouble(); 
            
            double correct = variable1 + variable2; 
            correctOrIncorrect(correct, userAnswer); 

            System.out.println("Would you like to try another? Enter 1 for Yes, 0 for No");
            userCutoff = Program.input.nextInt(); 
        }
    }

    // subtraction method- just subtraction problems with decimals/ variable 2 will always be less than variable 1 
    // answers are rounded to the nearest 100th 
    private static void subtraction() {
        int userCutoff = 1; 
        while(userCutoff == 1) {
            double variable1 = 0; 
            double variable2 = 0; 

            for(int i = 0; i < 4; i++) {
                variable1 *= 10; 
                variable1 += (int)(Math.random()*(9) + 1); 
                variable2 *= 10; 
                variable2 += (int)(Math.random()*(9) + 1);
            }
            variable1 /= 100; 
            variable2 /= 100; 
            
            while(variable2 > variable1) {
                variable2 = 0; 
                for(int i = 0; i < 4; i++) {
                    variable2 *= 10; 
                    variable2 += (int)(Math.random()*(9) + 1);
                }
                variable2 /= 100; 
            }
            
            System.out.println(variable1+ " - "+ variable2+" = ?");
            System.out.println("Enter your answer:"); 
            double userAnswer = Program.input.nextDouble(); 

            double correct = variable1 - variable2; 
            correct = round(correct); 
            System.out.println("The corrext answer is: "+correct); 
            correctOrIncorrect(correct, userAnswer); 

            System.out.println("Would you like to try another? Enter 1 for Yes, 0 for No");
            userCutoff = Program.input.nextInt(); 
        }

    }

    //multiplication method- just muliplication with deciamls/ all answers rounded to the nearest 100th
    private static void multiplication() {
        int userCutoff = 1; 
        while(userCutoff == 1) {
            double variable1 = 0; 
            double variable2 = 0; 
            for(int i = 0; i < 4; i++) {
                variable1 *= 10; 
                variable2 *= 10;
                variable1 += (int)(Math.random()*(9) + 1); 
                variable2 += (int)(Math.random()*(9) + 1); 
            }
            variable1 /= 100; 
            variable2 /= 100; 

            System.out.println(variable1+ " X "+ variable2+" = ?"); 
            System.out.println("Enter your answer: (Round to the nearest hundreths place");
            double userAnswer = Program.input.nextDouble(); 

            double correct = variable1 * variable2; 
            correct = round(correct); 

            correctOrIncorrect(correct, userAnswer);

            System.out.println("Would you like to try another? Enter 1 for Yes, 0 for No");
            userCutoff = Program.input.nextInt(); 
        }
    }

    // divison method- just division with decimals/ all answers rounded to the nearest 100th
    // variable2 values will always be less than variable1 values
    private static void division() {
        int userCutoff = 1;
        while(userCutoff == 1) {
            double variable1 = 0; 
            double variable2 = 0;
            for(int i = 0; i < 3; i++) {
                variable1 *= 10; 
                variable1 += (int)(Math.random()*(9) + 1); 
            }

            for(int i = 0; i < 2; i++) {
                variable2 *= 10; 
                variable2 += (int)(Math.random()*(9) + 1); 

            }

            variable1 /= 10;
            variable2 /= 10; 


            System.out.println(variable1+ " % "+ variable2+" = ?");
            System.out.println("Enter your answer: (Round to the nearest hundredths place)");
            double userAnswer = Program.input.nextDouble();

            double correct = variable1 / variable2; 
            
            correct = round(correct);
           
            System.out.println("correct answer is " + correct);
            correctOrIncorrect(correct, userAnswer);

            System.out.println("Would you like to try another? Enter 1 for Yes, 0 for No");
            userCutoff = Program.input.nextInt(); 
        }

    }

    //checks user answers to the correct answer of the problem
    private static void correctOrIncorrect(double correctAns, double userAns) {
        System.out.println();
        if(userAns == correctAns) {
            System.out.println("Correct!"); 
        }
        else {
            System.out.println("Incorrect :("); 
            System.out.println("The correct answer is " + correctAns);
        }
    }

    //rounds values to the nearest 100th place and returns that value as the correct answer 
    private static double round(double num) {
        num *= 100; 
        num = Math.round(num); 
        num /= 100; 

        return num; 
    }
}