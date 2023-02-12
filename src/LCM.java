import java.util.ArrayList;

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
    
    public static void generateRandomNumbers() {
        number1 = (int)(Math.random()*9 +2);
        number2 = (int)(Math.random()*9 +2);

         while(number1 == number2 || number1 > number2) {
           number1 = (int)(Math.random()*(9)+ 2);
       }
    }

    public static void lcm() {
        System.out.println("What is the LCM of " + number1 + " and " + number2);
        int num = Program.input.nextInt();

        checkSolution(num); 
    }

    public static void checkSolution(int num) {
        // int LCM = 0;

        //  ArrayList<Integer> int1List = new ArrayList<Integer>(); 
        // for(int i = 1; i <= 10; i++) {
        //    int1List.add(i - 1, number1 * i); 
        // }

        // ArrayList<Integer> int2List = new ArrayList<Integer>(); 
        // for(int i = 1; i <= 10; i++) {
        //     int2List.add(i - 1, number2 * i); 
        // }
        
        // for(int i = 0; i < int1List.size(); i++) {
        //     for(int j = 0; j < int2List.size(); j++) {
        //         if(int1List.get(i) == int2List.get(j)) {
        //             LCM = int1List.get(i); 
        //             break;
        //         }
        //     }
        //     if(LCM != 0) {
        //         break;
        //     }
        // }


        // use GCF's recursion method to find LCM a/gcd(a, b) * b;

        if(num == LCM) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
            System.out.println("The correct answer is " + LCM);
        }
    }
}