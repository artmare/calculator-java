import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Calculator123

        System.out.println("Calculator");

        Scanner input = new Scanner(System.in);

        label:
        while(true){
            int num1;
            int num2;
            int result;
            String operator;

            System.out.print("Enter first number: ");
            num1 = input.nextInt();

            System.out.print("Enter second number: ");
            num2 = input.nextInt();

            System.out.print("Write a operator: ");
            operator = input.next();

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "exit":
                    break label;
                default:
                    System.out.println("Unknown operator");
                    continue;
            }

            System.out.println("Result - " + result);
        }


    }
}