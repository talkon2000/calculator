import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        while(true) {
            System.out.println("To add, enter 1 \nTo subtract, enter 2" 
                                + "\nTo multiply, enter 3 \nTo divide, enter 4\n");
            
            String choice = getString("Please choose what operation to perform.");

            Double num1;
            Double num2;
            
            switch (choice) {
                case "1": 
                            num1 = getDouble("Enter first number to add");
                            num2 = getDouble("Enter second number to add");
                            System.out.println(myCalc.add(num1,num2));
                            break;
                
                case "2":   
                            num1 = getDouble("Enter number to subtract FROM");
                            num2 = getDouble("Enter number to subtract");
                            System.out.println(myCalc.subtract(num1,num2));
                            break;
                
                case "3":
                            num1 = getDouble("Enter first multiple");
                            num2 = getDouble("Enter second multiple"); 
                            System.out.println(myCalc.multiply(num1,num2));
                            break;
                
                case "4":
                            num1 = getDouble("Enter dividend (numerator)");
                            num2 = getDouble("Enter divisor (denominator)");
                            if (num2 != 0) {  
                                System.out.println(myCalc.divide(num1,num2));
                                break;
                            }
                            else {
                                System.out.println("You cannot divide by 0!");
                                break;
                            }
                default:    
                            System.out.println("Invalid input. Note: CTRL + C will exit this application");
            }

            
            if(!checkContinue()) break;
            inputScanner.nextLine();
        }
    }
    private static boolean checkContinue() {
        String input = getString("Do you wish to do another calculation? y/n");
        input = input.toLowerCase();
        if (input.equals("y") || input.equals("yes")) return true;
        else return false;

    }
    
    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.next();
    }
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }
}