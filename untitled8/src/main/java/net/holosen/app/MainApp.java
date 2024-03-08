package net.holosen.app;

public class MainApp {
    public static void main(String[] args) {             try {

        Bank bank = new Bank();
        bank.setAmount(10000);
       int amount =  bank.getAmount();
       amount -= 5000;
       bank.setAmount(amount);
       amount = bank.getAmount();
       amount -= 6000;
       bank.setAmount(amount);

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
