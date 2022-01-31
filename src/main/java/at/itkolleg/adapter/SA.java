package at.itkolleg.adapter;

import at.itkolleg.interfaces.ISammelumrechnung;
import at.itkolleg.chainofresponsibility.WR;
import at.itkolleg.exceptions.UmrechnerNichtGefundenException;

public class SA extends WR implements ISammelumrechnung {



    public SA(WR nextWR) {
        super(nextWR);
    }


    @Override
    public double sammelumrechnen(double[] betraege, String variante) throws UmrechnerNichtGefundenException {

        double ergebnis = 0;

        for(int i=0; i<betraege.length; i++){
           ergebnis = ergebnis + betraege[i];
        }
        return umrechnen(variante,ergebnis);

    }
}
