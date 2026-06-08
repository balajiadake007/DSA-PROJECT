public class bankaccount 
{
    String name;


    void deposit(double amount)
    {
        System.out.println("Account holder: " + name);
        System.out.println("Deposited amount: " + amount);
    }

    void withdraw(double amount)
    {
        System.out.println("Withdraw amount: " + amount);
    }

    void balance(double amount)
    {
        System.out.println("Balance amount: " + amount);
    }


    public static void main(String[] args)
    {

        bankaccount b = new bankaccount();
        b.name = "Balaji";

        b.deposit(2000);
        b.withdraw(1000);
        b.balance(1000);

        System.out.println();

        b.name = "Prathamesh";

        b.deposit(4000);
        b.withdraw(500);
        b.balance(3500);

        System.out.println();
        
        b.name = "Sapana";

        b.deposit(10000);
        b.withdraw(5000);
        b.balance(5000);
    }
     
}
