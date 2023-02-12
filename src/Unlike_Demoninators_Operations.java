public class Unlike_Demoninators_Operations {
    public static void runProgram() {
        // Topic: Adding, Subtracting, Multipling and Dividing Uncommon Denominators

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Adding, Subtracting, Multiplying, and Dividing Uncommon Denominators");        
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

        }
        else if(categoryChoice == 2) {

        }
        else if(categoryChoice == 3) {

        }
        else if(categoryChoice == 4) {

        }
    }
}
