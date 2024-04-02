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

    @Override
    public String toString() {
        return new StringBuilder("owner: ")
                .append(this.owner)
                .append("\n")
                .append("number: ")
                .append(this.number)
                .append("\n")
                .append("credit: ")
                .append(this.credit)
                .append(SYMBOL)
                .append("\n")
                .toString();
    }
}
