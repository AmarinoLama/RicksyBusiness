package edu.badpals.ricksyBusiness;

public class CrystalExpender implements GuestDispatcher{

    private int stock;
    private double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return stock;
    }

    @Override
    public void dispatch(CreditCard card) {
        if(card.credit() >= this.itemCost && stock() > 0){
            card.pay(this.itemCost);
            this.stock -= 1;
        }

    }

    @Override
    public String toString() {
        return new StringBuilder("stock: ")
                .append(stock())
                .append("\n")
                .append("cost: ")
                .append(this.itemCost)
                .toString();
    }
}
