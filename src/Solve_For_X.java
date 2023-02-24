public class Solve_For_X {
    public static void runProgram() {
        // Simplfying Fractions

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Solve for X");        
            System.out.println();
            System.out.println("Pick a Category:");
            System.out.println("1. Addition\n2. Substitution\n3. Multiplication\n4. Division");
            int categoryPick = Program.input.nextInt(); 
            
            Category(categoryPick); 
            

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }

    private static void Category(int category) {

        if(category == 1) {
            add(); 
        }

        else if(category == 2) {
            sub(); 
        }

        else if(category == 3) {
            mult(); 
        }

        else if(category == 4) {
            div(); 
        }

    }

    private static int numberGen() {
        int number = (int)(Math.random()*25 + 1); 
        return number; 
    }

    private static void add() {
        int num1 = numberGen();
        int num2 = numberGen();
        
        while(num1 > num2) {
            num1 = numberGen(); 
        }

        
        //changes the placement of the variable based on an even or odd variable 
        if(num1 % 2 == 0) {
            System.out.println("What is the value of x?"); 
            System.out.println("x "+num1+" =  "+num2);
             int userAnswer = Program.input.nextInt(); 
             int correctAnswer = num2 - num1; 

            checkAnswer(userAnswer, correctAnswer); 
        }

        else {
             System.out.println("What is the value of x?"); 
             System.out.println(num1 +" + x =  "+num2);
             int userAnswer = Program.input.nextInt(); 
             int correctAnswer = num2 - num1; 

        checkAnswer(userAnswer, correctAnswer); 
        }
    }

    public static void sub() {
        int num1 = numberGen(); 
        int num2 = numberGen();
        

        if(num1 % 2 == 0) {
            System.out.println("What is the value of x?");
            System.out.println("x - " + num1 + " =  "+num2);
            int userAnswer = Program.input.nextInt(); 

            int correctAnswer = num2 + num1; 

         checkAnswer(userAnswer, correctAnswer); 
        }

        else {
            while(num2 > num1) {
                num2 = numberGen(); 
            }

            System.out.println("What is the value of x?"); 
            System.out.println(num1+" - x =  "+num2); 
            int userAnswer = Program.input.nextInt(); 

            int correctAnswer = num1 - num2; 

            checkAnswer(userAnswer, correctAnswer); 
        }
    }

    public static void mult() {
        int num1 = (int)(Math.random()*60 + 2); 
        int num2 = (int)(Math.random()*10 + 2); 

        while(num1 % num2 != 0) {
            num1 = (int)(Math.random()*60 + 2); 
        }

        System.out.println("What is the value of x?");
        System.out.println(num2+"x = "+num1);
        int userAnswer = Program.input.nextInt(); 
        
        int correctAnswer = num1 / num2; 

        checkAnswer(userAnswer, correctAnswer); 
    }

    public static void div() {
        int num1 = (int)(Math.random()*10 + 2); 
        int num2 = (int)(Math.random()*10 + 2);

        System.out.println("What is the value of x?");
        System.out.println("x/"+num1+" =  "+num2); 
        int userAnswer = Program.input.nextInt(); 

        int correctAnswer = num1 * num2; 

        checkAnswer(userAnswer, correctAnswer); 


    }

    private static void checkAnswer(int user, int correct) {
        if(user == correct) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :("); 
        }
    }
}
