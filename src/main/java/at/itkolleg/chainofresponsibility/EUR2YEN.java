package at.itkolleg.chainofresponsibility;

import at.itkolleg.exceptions.UmrechnerNichtGefundenException;

public class EUR2YEN extends WR {

    public EUR2YEN(WR nextWR){
        super(nextWR);
    }

    @Override
    public double umrechnen(String variante, double betrag) throws UmrechnerNichtGefundenException {
        if(variante.equals("EUR2YEN")){
            return betrag * 128.75;
        }
        else{
            return super.umrechnen(variante, betrag);
        }



    }
}






