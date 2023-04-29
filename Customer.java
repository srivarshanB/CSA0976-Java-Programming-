class Customer {
    private int accountNo;
    private String accName;
    private double balance;

    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing $" + amount);
        balance += amount;
        System.out.println("New balance after deposit: $" + balance);
        notify();
    }

    public synchronized void withdraw(double amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is withdrawing $" + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            wait();
        }
        balance -= amount;
        System.out.println("New balance after withdrawal: $" + balance);
    }
}
class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1234, "John", 1000);

        Thread withdrawalThread = new Thread(() -> {
            try {
                customer.withdraw(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Withdrawal Thread");

        Thread depositThread = new Thread(() -> customer.deposit(2000), "Deposit Thread");

        withdrawalThread.start();
        depositThread.start();
    }
}