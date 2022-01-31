package at.itkolleg.decorator;

import at.itkolleg.chainofresponsibility.WR;
import at.itkolleg.exceptions.UmrechnerNichtGefundenException;

public class FixGebuerenDecorator extends Decorator {


    public FixGebuerenDecorator(WR nextWR) {
        super(nextWR);
    }

    @Override
    public double umrechnen(String variante, double betrag) throws UmrechnerNichtGefundenException {

        return super.umrechnen(variante, betrag +5 );
    }


}

