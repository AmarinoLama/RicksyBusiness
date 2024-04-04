package edu.badpals.ricksyBusiness;


public class CreditCard {

    private String owner;
    private String number;
    private float credit = 3000f;
    private static String SYMBOL = "EZI";


    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public String number() {
        return this.number;
    }

    public float credit() {
        return credit;
    }

    public boolean pay(double price) {
        if (credit >= price) {
            credit -= price;
        } else {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuilder("owner: ")
                .append(this.owner)
                .append("\n")
                .append("number: ")
                .append(number())
                .append("\n")
                .append("credit: ")
                .append(credit())
                .append(SYMBOL)
                .append("\n")
                .toString();
    }
}
