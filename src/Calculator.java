import java.util.Scanner;

public class Calculator {
    public static double addition(double a,double b){
        return a+b;
    }
    public static double subtraction(double a,double b){
        return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
        if(b == 0){
            System.out.println("Value cannot be divide by 0");
        }
            return a/b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 for addition: ");
            System.out.println("Enter 2 for subtraction: ");
            System.out.println("Enter 3 for Multiplication: ");
            System.out.println("Enter 4 for Division: ");
            System.out.println("Enter 5 to exit: ");

            int choice = input.nextInt();

            if(choice == 5){
                System.out.println("Exiting....");
                break;
            }

            if(choice<1 || choice >5){
                System.out.println("Invalid option ! Enter an valid Option...");
                continue;
            }

            System.out.println("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = input.nextDouble();
            double result = 0;
            switch(choice){
                case 1:
                    result = addition(num1,num2);
                    break;
                case 2:
                    result = subtraction(num1,num2);
                    break;
                case 3:
                    result = multiplication(num1,num2);
                    break;
                case 4:
                    result = division(num1,num2);
                    break;
            }
            System.out.println("Result is: "+ result);
        }
        input.close();
    }
}
