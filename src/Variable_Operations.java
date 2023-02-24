public class Variable_Operations {
    public static void runProgram() {
        // Topic: Variable Operations (adding and subtracting)

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Variable Operations");        
            System.out.println();
            System.out.println("Pick a Category:");
            System.out.println("1. Addition\n2. Subtraction\n3. Distribution"); 
            int choice = Program.input.nextInt(); 
            Program.input.nextLine(); // clearing buffer!! 

            category(choice); 

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }

    private static void category(int choice) {
        if(choice == 1) {
            add(); 
        }
        else if(choice == 2) {
            sub();
        }
        else if(choice == 3) {
            distribution(); 
        }
    }

    private static int numberGen() {
        int number = (int)(Math.random()*30 + 2); 
        return number; 
    }


    private static void add() {
        int num1 = numberGen();
        int num2 = numberGen();
        int num3 = numberGen(); 
        int num4 = numberGen(); 

        System.out.println("Evaluate the following problem: 2x + 2y format: spaces included!");
        System.out.println(num1+"x + "+num2+"y + "+num3+"x + "+num4+"y"); 
        String userAns = Program.input.nextLine(); 

        int xAns = num1 + num3; 
        int yAns = num2 + num4;

        int xNum = Integer.parseInt(userAns.substring(0,userAns.indexOf("x"))); 
        int yNum = Integer.parseInt(userAns.substring(userAns.indexOf("+") + 2,userAns.indexOf("y") ));


        checkAnswer(xNum, yNum, xAns, yAns);
    }

    private static void sub() {
        int num1 = numberGen();
        int num2 = numberGen();
        int num3 = numberGen(); 
        int num4 = numberGen(); 

        while(num1 < num3 || num1 == num3) {
            num3 = numberGen(); 
        }

        while(num2 < num4 || num2 == num4) {
            num4 = numberGen(); 
        }

        System.out.println("Evaluate the following problem: 2x - 2y format: spaces included!"); 
        System.out.println(num1+"x - "+num2+"y - "+num3+"x - "+num4+"y"); 
        String userAns = Program.input.nextLine(); 

        int xNum = Integer.parseInt(userAns.substring(0,userAns.indexOf("x"))); 
        int yNum = Integer.parseInt(userAns.substring(userAns.indexOf("-") + 2,userAns.indexOf("y") ));

        int xAns = num1 - num3; 
        int yAns = num2 - num4; 

        checkAnswer(xNum, yNum, xAns, yAns); 
    }

    //sorta my way of implimenting multiplication 
    private static void distribution() {
        int multiplier = (int)(Math.random()*9 + 2); 
        int operation = (int)(Math.random()*4 + 1);
        int num1 = (int)(Math.random()*9 + 2);
        int num2 = (int)(Math.random()*9 + 2);

        //even operation means addition in the parenthesis - I want to expand on this is the future with more variables
        //and multilpe different operations but this will do for now - this is just framework
        if(operation % 2 == 0) {
            System.out.println("Evaluate the following problem: 2x - 2y format: spaces included!"); 
            System.out.println(multiplier+"("+num1+"x + "+num2+"y)"); 
            String userAns = Program.input.nextLine(); 

            int xNum = Integer.parseInt(userAns.substring(userAns.indexOf("(") + 1,userAns.indexOf("x"))); 
            int yNum = Integer.parseInt(userAns.substring(userAns.indexOf("+") + 2,userAns.indexOf("y") ));

            int xAns = multiplier * num1; 
            int yAns = multiplier * num2; 

            checkAnswer(xNum, yNum, xAns, yAns); 

        }

        else if(operation % 2 == 1) {
            System.out.println("Evaluate the following proble: (2x - 2y format: spaces included!)"); 
            System.out.println(multiplier+"("+num1+"x - "+num2+"y)"); 
            String userAns = Program.input.nextLine(); 

            int xNum = Integer.parseInt(userAns.substring(userAns.indexOf("(") + 1,userAns.indexOf("x"))); 
            int yNum = Integer.parseInt(userAns.substring(userAns.indexOf("-") + 2,userAns.indexOf("y") ));

            int xAns = multiplier * num1; 
            int yAns = multiplier * num2; 

            checkAnswer(xNum, yNum, xAns, yAns); 
        }

    }



    //impliment division when they get to that and I have more examples to look at 

   
    private static void checkAnswer(int userX,int userY, int x, int y) {
        //int userNum = Integer.parseInt(userAns.substring(0,userAns.indexOf("/"))); 
        //example to extract the numbers
        if(userX == x && userY == y) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :("); 
        }

    }


}
