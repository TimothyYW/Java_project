import java.util.Scanner;

public class Calculator {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Calculator");
        System.out.println("Input first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Input operand: (+,-,*,/)");
        char operand = scanner.next().charAt(0);
        System.out.println("Input second number:");
        double num2 = scanner.nextDouble();
        double result;
        scanner.close();
        switch(operand) {
            case '+' :
                result = num1 + num2 ;
                break;
            case '-' :
                result = num1 - num2 ;
                break;
            case '*' :
                result = num1 * num2 ;
                break;
            case '/' :
                if(num2 == 0){
                    System.out.println("Error: division by zero");
                    return;
                }
                result = num1 / num2 ;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: "+result);
    }
}