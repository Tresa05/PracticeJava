package assignmentDec15th;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
        double initialDeposit = 15000.0;
       
        
        PersonAccountDetails myAccount = new PersonAccountDetails("420009120", "TresaThomson",1234,"password@2");
        ATM atm = new ATM(initialDeposit);
        OnlineBanking onlineBanking = new OnlineBanking(initialDeposit);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking System!");
        System.out.println("Choose your banking service: ");
        System.out.println("1. ATM");
        System.out.println("2. Online Banking");
        int choice = scanner.nextInt();

        BankOperations selectedService = (choice == 1) ? atm : onlineBanking;

        System.out.println("Enter your PIN/online banking password: ");
        String enteredPinOrPassword = scanner.next();

        if (enteredPinOrPassword.equals(myAccount.getPin()) || enteredPinOrPassword.equals(myAccount.getOnlineBankingPassword())) {
            System.out.println("Choose your action: ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. View Balance");
            int actionChoice = scanner.nextInt();

            switch (actionChoice) {
                case 1:
                    System.out.println("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    selectedService.withdraw(withdrawalAmount);
                    break;
                case 2:
                    System.out.println("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    selectedService.deposit(depositAmount);
                    break;
                case 3:
                    double balance = selectedService.viewBalance();
                    System.out.println("Current balance: " + balance);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Incorrect PIN or online banking password. Transaction failed.");
        }

        scanner.close();
    }

	}


