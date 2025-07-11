
// BankAccount.java
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("----------------------------");
    }
}

// BankSystem
public class Bank {
    public static void main(String[] args) {
        // Create array of 5 BankAccount objects
        BankAccount[] accounts = new BankAccount[5];

        // Initialize accounts
        accounts[0] = new BankAccount(1234, "Surya", 1000.0);
        accounts[1] = new BankAccount(2345, "Shreya", 2000.0);
        accounts[2] = new BankAccount(3456, "Ishwarya", 1500.0);
        accounts[3] = new BankAccount(4567, "Jasmine", 2500.0);
        accounts[4] = new BankAccount(5678, "Swetha", 3000.0);

        // Display initial details of Account 1
        System.out.println("Initial Details of Account 1:");
        accounts[0].display();

        // Deposit $500 into Account 1
        System.out.println("Depositing $500 into Account 1:");
        accounts[0].deposit(500);
        accounts[0].display();

        // Withdraw $200 from Account 1
        System.out.println("Withdrawing $200 from Account 1:");
        accounts[0].withdraw(200);
        accounts[0].display();

        // Additional testing on another account
        System.out.println("Depositing $1000 into Account 2:");
        accounts[1].deposit(1000);
        accounts[1].display();

        System.out.println("Withdrawing $500 from Account 2:");
        accounts[1].withdraw(500);
        accounts[1].display();
    }
}
