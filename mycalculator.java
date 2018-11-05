import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        boolean run = true;
        int firstnum = 0;
        int secondnum = 0;
        int answer = 0;

        while (run) {

            System.out.println("           Calculator        ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.printf("Select operation(1-5): ");

            int operation = scanner.nextInt();
            switch (operation) {
            case 1:
                System.out.printf("Enter first number: ");
                firstnum = scanner.nextInt();
                System.out.printf("Enter second number: ");
                secondnum = scanner.nextInt();
                answer = firstnum + secondnum;
                System.out.println("The answer is: " + answer);
                break;

            case 2:
                System.out.printf("Enter first number: ");
                firstnum = scanner.nextInt();
                System.out.printf("Enter second number: ");
                secondnum = scanner.nextInt();
                answer = firstnum - secondnum;
                System.out.println("The answer is: " + answer);
                break;

            case 3:
                System.out.printf("Enter first number: ");
                firstnum= scanner.nextInt();
                System.out.printf("Enter second number: ");
                secondnum = scanner.nextInt();
                answer = firstnum * secondnum;
                System.out.println("The answer is: " + answer);
                break;

            case 4:
                System.out.printf("Enter first number: ");
                firstnum = scanner.nextInt();
                System.out.printf("Enter second number: ");
                secondnum = scanner.nextInt();
                answer = firstnum / secondnum;
                System.out.println("The answer is: " + answer);
                break;

            case 5:
                System.out.println("Thank you.Have a good one!");
                scanner.close();
                run = false;
                break;

            default:
                System.out.println("Invalid operation!");
                break;
            }
        }
    }
}