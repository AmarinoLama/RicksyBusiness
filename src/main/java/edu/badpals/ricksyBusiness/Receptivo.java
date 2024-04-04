package edu.badpals.ricksyBusiness;

import java.util.ArrayList;

public class Receptivo {

    private ArrayList<GuestDispatcher> observers = new ArrayList<>();

    public Receptivo() {
    }

    public void registra(GuestDispatcher observer){
        observers.add(observer);
    }

    public void dispatch(CreditCard tarjeta) {
        for (GuestDispatcher paquete : observers) {
            paquete.dispatch(tarjeta);
        }
    }
}
