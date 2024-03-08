package net.holosen.app;

public class Bank {
    private int amount = 0;

    public int getAmount() {
        System.out.println(amount);
        return amount;
    }

    public void setAmount(int amount) throws Exception {
        if (amount < 0){
            throw new Exception("موجودی کافی نیست");
        }
        this.amount = amount;
    }
}
