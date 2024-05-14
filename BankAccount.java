import javax.print.DocFlavor.STRING;
public class MainClass{
public static void main(String[] args) {
    BankAccount ac = new BankAccount();
    System.out.println("Balance: " + ac.accBalance);
    System.out.println("Title: " + ac.accBalance); 
    System.out.println("Account Number: " + ac.accBalance);
    ac.deposit(6000);
    System.out.println(" " + ac.accBalance);
}
}
class BankAccount{
    String IBAN = "PK123456789";
           String accTitle = "Aliza Khan";
      double accBalance =5000;

      double deposit(double amount){
        accBalance = accBalance + amount;
        return accBalance;
      }

      void withdraw(double amount){
        accBalance = accBalance - amount;
      }
}
