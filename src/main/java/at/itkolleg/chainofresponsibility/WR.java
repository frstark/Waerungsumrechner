package at.itkolleg.chainofresponsibility;

import at.itkolleg.interfaces.IUmrechnen;


import at.itkolleg.exceptions.UmrechnerNichtGefundenException;


public class WR implements IUmrechnen {

    private WR nextWR;

    public WR(WR nextWR) {
        this.nextWR = nextWR;

    }

    @Override
    public double umrechnen(String variante, double betrag) throws UmrechnerNichtGefundenException {
        if (nextWR != null)
            return nextWR.umrechnen(variante, betrag);

        else
            throw new UmrechnerNichtGefundenException();

    }








}






