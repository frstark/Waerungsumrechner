package at.itkolleg.interfaces;

import at.itkolleg.exceptions.UmrechnerNichtGefundenException;

public interface IUmrechnen {
    public double umrechnen(String variante, double betrag) throws UmrechnerNichtGefundenException;


}


