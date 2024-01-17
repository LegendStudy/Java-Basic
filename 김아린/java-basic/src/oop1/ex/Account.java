package oop1.ex;

public class Account {
    int balnace; // 잔액

    void deposit(int amount) {
        balnace += amount;
    }

    void withdraw(int amount) {
        if (balnace < amount) {
            System.out.println("잔액 부족");
        } else {
            balnace -= amount;
        }
    }
}
