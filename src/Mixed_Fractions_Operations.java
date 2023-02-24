public class Mixed_Fractions_Operations {
    public static void runProgram() {
        // Topic: Adding, Subtracting, Multiplying and Dividing Mixed Numbers

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Adding, Subtracting, Multiplying, and Dividing Mixed Numbers: ");        
            System.out.println();
            
            System.out.println("Pick a category:");
            System.out.println("1. Adding \n2. Subtracting\n3. Multiplying\n4. Dividing\n"); 
            int categoryChoice = Program.input.nextInt();

            Program.input.nextLine(); 

            category(categoryChoice);

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }

    private static void category(int categoryChoice) {        
        if(categoryChoice == 1) {
            add();
        }
        else if(categoryChoice == 2) {
            sub(); 
        }
        else if(categoryChoice == 3) {
            mult(); 
        }
        else if(categoryChoice == 4) {
            div(); 
        }
    }

    private static int numberGen() {
        int number = (int)(Math.random()*10 + 1); 
        return number; 
    }

    private static void add() {
        int numerator = numberGen(); 
        int denominator = numberGen(); 
        int numerator2 = numberGen(); 
        int denominator2 = numberGen(); 
        int coefficient = (int)(Math.random()*7 + 1); 
        int coefficient2 = (int)(Math.random()*7 + 1); 

        while(denominator == denominator2) {
            denominator2 = numberGen(); 
        }
        
        while(numerator == denominator || numerator > denominator) {
            numerator = numberGen(); 
        }
        
        while(numerator2 == denominator2 || numerator2 > denominator2 || numerator2 > numerator) {
            numerator2 = numberGen(); 
        }


        Fraction fraction1 = new Fraction(numerator, denominator);
        Fraction fraction2 = new Fraction(numerator2, denominator2); 
        //Fraction fraction3 = fraction1.addition(fraction2);

        System.out.println("Solve: " + coefficient + " " + fraction1.getNumerator() + "/" + fraction1.getDenominator() + " + "+coefficient2 + " " + fraction2.getNumerator() + "/" + fraction2.getDenominator()); 

        //calculating the correct answer
        numerator += coefficient*denominator;
        numerator2 += coefficient2*denominator2; 
        Fraction fraction3 = fraction1.addition(fraction2);

        int findCorrectNumerator = fraction3.getNumerator();
        int findCorrectDenominator = fraction3.getDenominator(); 
        int gcd = GCF.gcd(findCorrectNumerator, findCorrectDenominator); 

        int correctNumerator = findCorrectNumerator / gcd; 
        int correctDenominator = findCorrectDenominator / gcd; 

        //debugging 
        System.out.println("the gcd is: "+ gcd); 

        //users answer
        System.out.println("Enter your answer (number/number format)");
        String userAnswer = Program.input.nextLine(); 
        
        checkAnswer(correctNumerator, correctDenominator, userAnswer); 
    }


    //these all still need to be converted 
    private static void sub() {
        int numerator = numberGen() * 2; 
        int denominator = numberGen(); 
        int numerator2 = numberGen(); 
        int denominator2 = numberGen(); 

        while(denominator == denominator2) {
            denominator2 = numberGen(); 
        }
        
        while(numerator == denominator || numerator > denominator) {
            numerator = numberGen() * 2; 
        }
        
        while(numerator2 == denominator2 || numerator2 > denominator2 || numerator2 > numerator) {
            numerator2 = numberGen(); 
        }
        //replace all while loops to check for ALL conditions!! 

        Fraction fraction1 = new Fraction(numerator, denominator);
        Fraction fraction2 = new Fraction(numerator2, denominator2); 

        Fraction fraction3 = fraction1.subtraction(fraction2);
        System.out.println("Solve: " + fraction1.getNumerator() + "/" + fraction1.getDenominator() + " - " + fraction2.getNumerator() + "/" + fraction2.getDenominator());

        int correctNumerator = fraction3.getNumerator();
        int correctDenominator = fraction3.getDenominator(); 

        System.out.println("Enter your answer (number/number format)");
        Program.input.nextLine(); 
        String userAnswer = Program.input.nextLine(); 

        checkAnswer(correctNumerator, correctDenominator, userAnswer); 
    }

    private static void mult() {
        int numerator = numberGen(); 
        int denominator = numberGen(); 
        int numerator2 = numberGen(); 
        int denominator2 = numberGen(); 

        while(denominator == denominator2) {
            denominator2 = numberGen(); 
        }
        
        while(numerator == denominator || numerator > denominator) {
            numerator = numberGen(); 
        }
        
        while(numerator2 == denominator2 || numerator2 > denominator2 || numerator2 > numerator) {
            numerator2 = numberGen(); 
        }

        Fraction fraction1 = new Fraction(numerator, denominator);
        Fraction fraction2 = new Fraction(numerator2, denominator2); 

        Fraction fraction3 = fraction1.multiplying(fraction2);
        System.out.println("Solve: " + numerator+"/"+denominator+" x "+numerator2+"/"+denominator2);


        int correctNumerator = fraction3.getNumerator();
        int correctDenominator = fraction3.getDenominator();

        System.out.println("Enter your answer (number/number format)");
        Program.input.nextLine(); 
        String userAnswer = Program.input.nextLine(); 

        checkAnswer(correctNumerator, correctDenominator, userAnswer); 
    }

    private static void div() {
        int numerator = numberGen(); 
        int denominator = numberGen(); 
        int numerator2 = numberGen(); 
        int denominator2 = numberGen(); 

        while(denominator == denominator2) {
            denominator2 = numberGen(); 
        }
        
        while(numerator == denominator || numerator > denominator) {
            numerator = numberGen(); 
        }
        
        while(numerator2 == denominator2 || numerator2 > denominator2 || numerator2 > numerator) {
            numerator2 = numberGen(); 
        }

        Fraction fraction1 = new Fraction(numerator, denominator);
        Fraction fraction2 = new Fraction(numerator2, denominator2); 

        Fraction fraction3 = fraction1.dividing(fraction2);
        System.out.println("Solve: " + fraction1.getNumerator() + "/" + fraction1.getDenominator() + " / " + fraction2.getNumerator() + "/" + fraction2.getDenominator());

        int correctNumerator = fraction3.getNumerator();
        int correctDenominator = fraction3.getDenominator(); 

        System.out.println("Enter your answer (number/number format)");
        Program.input.nextLine(); 
        String userAnswer = Program.input.nextLine(); 

        checkAnswer(correctNumerator, correctDenominator, userAnswer); 
    }

    private static void checkAnswer(int numerator, int denominator, String userAns) {
        int userNum = Integer.parseInt(userAns.substring(0,userAns.indexOf("/"))); 
        int userDen = Integer.parseInt(userAns.substring(userAns.indexOf("/") + 1));

        if(userNum == numerator && userDen == denominator) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :("); 
            System.out.println("Correct answer: " + numerator + "/" + denominator); 
        }
    }
}