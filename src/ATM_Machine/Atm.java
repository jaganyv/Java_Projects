package ATM_Machine;
import java.util.Scanner;
public class Atm {
    public static boolean validateInputAmount(Integer Amount){
        return Amount > 0;
    }
    public static void main(String[] args) {

        int balance = 10000,withdraw,deposit;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter money to be withdrawn: ");

                    withdraw = scanner.nextInt();
                    if(!validateInputAmount(withdraw)){
                        System.out.println("Enter amount greater than zero");
                        break;
                    }
                    if(balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("Please Collect Your Money");
                    }else{
                        System.out.println("Insufficient Balance!");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter money to deposited: ");
                    deposit = scanner.nextInt();
                    if(!validateInputAmount(deposit)){
                        System.out.println("Enter amount greater than zero");
                        break;
                    }
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
