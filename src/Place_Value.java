public class Place_Value {
    // Topic: Place Value
    // Ex: 6278.345, what is the place value of 7, it is the tens place
    // Randomly generated number and no duplicate numbers and ask user what the place is of the number and compare the answer
    
    public static void runProgram() {
        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Place Value: ");
            System.out.println();
            
            double num = generateRandomDouble();
            placeValue(num);
            
            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }
        
        Menu.startProgram();
    }

    private static int[] numArray; 
    private static String[] places = {"thousands place", "hundreds place", "tens place", "ones place", "tenths place", "hundreths place", "thousandths place"};

    private static double generateRandomDouble() {  
        double num = 0;
        
        // Creates a 7 digit randomized number
        for(int i = 0; i < 7; i++) {
            num *= 10; 
            num += (int)(Math.random()*(9) + 1);
        }
        
        // Replaces Duplicates
        num = replaceDuplicates((int)num);

        // gives said randomized number 3 decimal places
        num /= 1000.0; 
        
        return num;
    }
    
    private static boolean checkForDuplicates(int[] arr) {
        // Checks for Duplicates 
        boolean duplicates = true;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    duplicates = false;
                }
            }
        }
        return duplicates; 
    }

    private static int replaceDuplicates(int num) {
        numArray = new int[7];

        // Every element of the array is allocated to a place from biggest to smallest in the number 
        int temp = 6;
        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = (int)((num / Math.pow(10, temp)) % 10); 
            temp -= 1;
        }

        // Replaces the duplicated digits with a different number 
        // While there is a duplicate, it keeps replacing the number with something different
        while(!checkForDuplicates(numArray)) {
            for(int i = 0; i < numArray.length; i++) {
                for(int j = 0; j < numArray.length; j++) {
                    numArray[j] = (int)(Math.random()*(9) + 1);
                }
            }
        }
        
        // Changes the array back into an usable number 
        int newNum = 0;
        int temp2 = 6;
        for(int i = 0; i < numArray.length; i++) {
           newNum += numArray[i] * (int)Math.pow(10, temp2);
           temp2--;
        }
        
        return newNum;
    }

    private static void placeValue(double num) {
        // Randomizes the place value to test the user with
        int placeValue = (int)(Math.random()*7);

        // Asking the user for what the place value of said number is
        System.out.println("What is the place value of " + numArray[placeValue] + " in the number " + num + "?");
        System.out.println("thousands place");
        System.out.println("hundreds place");
        System.out.println("tens place");
        System.out.println("ones place");
        System.out.println("tenths place");
        System.out.println("hundreths place");
        System.out.println("thousandths place");
        System.out.println();
        Program.input.nextLine();
        String answer = Program.input.nextLine();
        
        checkPlaceValue(answer, placeValue);
    }

    private static void checkPlaceValue(String answer, int placeValue) {
        // Checks if the answer is valid or not and if not then asks the user again
        answer = spellChecker(answer);
        
        // Checks the answer and the place value if it's correct
        if(places[placeValue].equals(answer)) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
        }
    }

    private static String spellChecker(String answer) {
        boolean spellChecker = true;
        
        // Checks the user's response to every answer and compares it to if it is one of the options
        while(spellChecker) {
            for(int i = 0; i < places.length; i++) {
                if(places[i].equals(answer)) {
                    spellChecker = false;
                }
            }
        
            // If the response isn't one of the choices, then asks the user again for a response
            if(spellChecker) {
                System.out.println("Your answer isn't spelt correctly, spell it again:");
                answer = Program.input.nextLine();
            }
        }
        return answer;
    }
}