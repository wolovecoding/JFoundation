package mutiThread.syn3;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/24 14:00
 */
public class Account {
    private int balance = 600;

    public void withDraw(int money){
          this.balance-=money;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
