public class Variable_Operations {
    public static void runProgram() {
        // Topic: Variable Operations (adding and subtracting)

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Variable Operations");        
            System.out.println();
            
            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }


}
