public class Mixed_Fractions_Operations {
    public static void runProgram() {
        // Topic: Adding, Subtracting, Multiplying and Dividing Mixed Numbers

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Adding, Subtracting, Multiplying, and Dividing Mixed Numbers");        
            System.out.println();
            
            System.out.println("Pick a category:");
            System.out.println("1. Adding \n2. Subtracting\n3. Multiplying\n4. Dividing\n"); 
            int categoryChoice = Program.input.nextInt();

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
}