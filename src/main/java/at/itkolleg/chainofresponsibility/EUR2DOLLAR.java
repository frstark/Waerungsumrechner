package at.itkolleg.chainofresponsibility;

import at.itkolleg.exceptions.UmrechnerNichtGefundenException;

public class EUR2DOLLAR extends WR {


    public EUR2DOLLAR(WR nextWR){
        super(nextWR);
    }

    @Override
    public double umrechnen(String variante, double betrag) throws UmrechnerNichtGefundenException {
        if(variante.equals("EUR2DOLLAR")){
            return betrag * 1.13;
        }
        else{
            return super.umrechnen(variante, betrag);
        }



    }
}