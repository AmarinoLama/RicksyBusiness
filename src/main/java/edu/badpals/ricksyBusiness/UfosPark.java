package edu.badpals.ricksyBusiness;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class UfosPark implements GuestDispatcher {

    private static double FEE = 500f;
    private HashMap<String, String> flota = new HashMap<>();


    public UfosPark() {
    }


    public void add (String ovni) {
        this.flota.put(ovni, "Libre");
    }

    @Override
    public void dispatch(CreditCard card) {
        if (getUfoOf(card.number()).equals("null") && card.credit() >= UfosPark.FEE) {
            if (!getFreeOvni().equals("No hay ovnis libres")){
                flota.replace(getFreeOvni(), card.number());
                card.pay(UfosPark.FEE);
            }
        }
    }


    private String getFreeOvni() {
        for (HashMap.Entry<String, String> ovni : flota.entrySet()) {
            if (ovni.getValue() == "Libre") {
                return ovni.getKey();
            }
        }
        return "No hay ovnis libres";
    }

    public String getUfoOf(String numberOwner){
        for (HashMap.Entry<String, String> ovni : flota.entrySet()) {
            if (numberOwner.equals(ovni.getValue())) {
                return ovni.getKey();
            }
        }
        return "null";
    }

    @Override
    public String toString() {
        return flota.keySet().toString();
    }

    /* paquetes añadidos para pasar los casos test */

    boolean containsCard(String cardNumber) {
        return this.flota.containsValue(cardNumber);
    }

    Collection<String> cardNumbers() {
        return this.flota.values();
    }
}
