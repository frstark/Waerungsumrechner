package at.itkolleg.interfaces;

//Ziel-interface

import at.itkolleg.exceptions.UmrechnerNichtGefundenException;

public interface ISammelumrechnung {

    public double sammelumrechnen(double[] betraege, String variante) throws UmrechnerNichtGefundenException;
}



