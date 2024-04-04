package edu.badpals.ricksyBusiness;

import java.util.ArrayList;
import java.util.HashMap;

public class UfosPark {

    private static double FEE = 500f;
    private HashMap<String, String> flota = new HashMap<>();


    public UfosPark() {
    }


    public void add (String ovni) {
        this.flota.put(ovni, null);
    }

    public void dispatch(CreditCard card) {
        flota.replace(getFreeOvni(), card.number());
        card.pay(UfosPark.FEE);
    }

    private String getFreeOvni() {
        for (HashMap.Entry<String, String> ovni : flota.entrySet()) {
            if (ovni.getValue() == null) {
                return ovni.getKey();
            }
        }
        return null;
    }

    public String getUfoOf(String numberOwner){
        for (HashMap.Entry<String, String> ovni : flota.entrySet()) {
            if (numberOwner.equals(ovni.getValue())) {
                return ovni.getKey();
            }
        }
        return null;
    }
}
