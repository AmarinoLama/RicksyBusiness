package edu.badpals.ricksyBusiness;

import java.util.ArrayList;

public class RickMenu implements GuestDispatcher {

    private int stock;
    private double itemCost;
    private ArrayList<String> compradores = new ArrayList<>();

    public RickMenu(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public ArrayList<String> getCompradores() {
        return compradores;
    }
    public int stock() {
        return stock;
    }


    @Override
    public void dispatch(CreditCard card) {
        if(card.credit() >= this.itemCost && stock() > 0){
            card.pay(this.itemCost);
            this.stock -= 1;
            compradores.add(card.getOwner());
        }
    }
}
