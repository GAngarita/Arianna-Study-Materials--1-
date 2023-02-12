public class Simplify {
    public static void runProgram() {
        // Simplfying Fractions

        int userCutoff = 1;
        while (userCutoff == 1) {
            System.out.println("Simplfy Fractions");        
            System.out.println();

            System.out.println("\nTo continue, enter 1\nTo return to the main menu, enter 0");
            userCutoff = Program.input.nextInt();
        }

        Menu.startProgram();
    }

    
}