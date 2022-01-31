package at.itkolleg.decorator;

import at.itkolleg.chainofresponsibility.WR;
import at.itkolleg.exceptions.UmrechnerNichtGefundenException;

public abstract class Decorator extends WR {


    protected GebuerenDecorator nextWR;

    public Decorator(WR nextWR)
    {
        super(nextWR);

    }



    public double umrechnung (String variante, double betrag) throws UmrechnerNichtGefundenException{
        return super.umrechnen(variante, betrag);

    }


















}
