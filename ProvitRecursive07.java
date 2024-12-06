import java.util.Scanner;
public class ProvitRecursive07 {

    static double calcuateProfit(double balance, int period) {
        if (period==0) {
            return balance;
        } else {
            return 1.11*calcuateProfit(balance, period-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input Balance: ");
        double initialBalance = input.nextInt();
        System.out.print("Input Investment Period: ");
        int investPeriod = input.nextInt();

        System.out.println("Balance after " + investPeriod + " year = " +
        calcuateProfit(initialBalance, investPeriod));
    }
}
