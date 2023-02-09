package Acc.com;
import java.util.Scanner;
public class Account
{
    static Double balance,debitAmount;
    void debit()
    {
        if (debitAmount > balance)
        {
            debitAmount = 0.0;
            System.out.println("Debit amount exceeded account balance.");
            System.out.println("Current balance is:-"+balance);
        }
        else
        {
            balance = balance - debitAmount;
            System.out.println("Amount debited:-" + debitAmount);
            System.out.println("Current Balance:-" + balance);
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Initial balance:-");
        balance=s.nextDouble();
        System.out.println("Enter amount to be debited:-");
        debitAmount=s.nextDouble();
        Account a=new Account();
        a.debit();
    }
}
