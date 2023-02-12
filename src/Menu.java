public class Menu {
    public static void startProgram() {

        System.out.println("Practice Topics: ");
        System.out.println("1. Place Value");
        System.out.println("2. Addition, Subtracting, Multiplying and Dividing Decimals"); 
        System.out.println("3. GCF (greatest common factor)");
        System.out.println("4. LCM (least common multiple)");
        System.out.println("5. PEMDAS");
        System.out.println("6. Adding, Subtracting, Multiplying and Dividing Mixed Numbers");
        System.out.println("7. Adding, Subtracting, Multipling and Dividing Uncommon Denominators");
        System.out.println("8. Simplify Fractions");
        
        System.out.println();
        System.out.println("Enter your option (1-8): ");
        int topicOption = Program.input.nextInt(); 
                
        if(topicOption == 1) {
            Place_Value.runProgram();
        }
        else if(topicOption == 2) {
            Decimal_Operations.runProgram();
        }
        else if(topicOption == 3) {
            GCF.runProgram(); 
        }
        else if(topicOption == 4) {
            LCM.runProgram(); 
        }
        else if(topicOption == 5) {
            PEDMAS.runProgram();
        }
        else if(topicOption == 6) {
            Mixed_Fractions_Operations.runProgram();
        }
        else if(topicOption == 7) {
            Unlike_Demoninators_Operations.runProgram();
        }
        else if(topicOption == 8) {
            Simplify.runProgram();
        }
    }
}