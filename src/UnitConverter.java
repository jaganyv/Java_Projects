import java.util.Scanner;

public class UnitConverter {

    //Temperature
    public static double celsiusToFahrenhiet(double c){
        return (c*9/5)+32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }

    //Distance
    public static double meterToKilometer(double m){
        return m/1000;
    }
    public static double kilometerToMeter(double km){
        return km*1000;
    }

    //Weight
    public static double kilogramToGram(double kg){
        return kg*1000;
    }
    public static double gramToKilogram(double g){
        return g/1000;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("\n1. Temperature Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Weight Converter");
            System.out.println("4. Exit");
            System.out.print("Choose a category: ");

            int choice = input.nextInt();

            if(choice == 4){
                System.out.println("Exiting...");
                break;
            }

            if(choice < 1 || choice > 4){
                System.out.println("Enter a valid option...");
                continue; // FIX
            }

            double result;
            double inp, value;
            int cont;

            switch(choice){

                case 1:
                    System.out.println("\n--- Temperature Converter ---");
                    System.out.println("1. Celsius → Fahrenheit");
                    System.out.println("2. Fahrenheit → Celsius");
                    System.out.println("3. Back to Main Menu");
                    inp = input.nextInt();

                    if(inp == 3) break;

                    if(inp == 1){
                        System.out.print("Enter Celsius: ");
                        value = input.nextDouble();
                        result = celsiusToFahrenhiet(value);
                        System.out.println("Result: " + result + " °F");

                    } else if(inp == 2){
                        System.out.print("Enter Fahrenheit: ");
                        value = input.nextDouble();
                        result = fahrenheitToCelsius(value);
                        System.out.println("Result: " + result + " °C");

                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;


                case 2:
                    System.out.println("\n--- Distance Converter ---");
                    System.out.println("1. Meter → Kilometer");
                    System.out.println("2. Kilometer → Meter");
                    System.out.println("3. Back to Main Menu");
                    inp = input.nextInt();

                    if(inp == 3) break;

                    if(inp == 1){
                        System.out.print("Enter Meter value: ");
                        value = input.nextDouble();
                        result = meterToKilometer(value);
                        System.out.println("Result: " + result + " km");

                    } else if(inp == 2){
                        System.out.print("Enter Kilometer value: ");
                        value = input.nextDouble();
                        result = kilometerToMeter(value);
                        System.out.println("Result: " + result + " m");

                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;


                case 3:
                    System.out.println("\n--- Weight Converter ---");
                    System.out.println("1. Kg → Gram");
                    System.out.println("2. Gram → Kg");
                    System.out.println("3. Back to Main Menu");
                    inp = input.nextInt();

                    if(inp == 3) break;

                    if(inp == 1){
                        System.out.print("Enter Kg value: ");
                        value = input.nextDouble();
                        result = kilogramToGram(value);
                        System.out.println("Result: " + result + " g");

                    } else if(inp == 2){
                        System.out.print("Enter Gram value: ");
                        value = input.nextDouble();
                        result = gramToKilogram(value);
                        System.out.println("Result: " + result + " kg");

                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
            }
        }
    }
}
