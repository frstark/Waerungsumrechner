package at.itkolleg.chainofresponsibility;

import at.itkolleg.interfaces.ISubjekt;
import at.itkolleg.interfaces.IUmrechnen;


import at.itkolleg.exceptions.UmrechnerNichtGefundenException;
import at.itkolleg.interfaces.IObserver;

import java.util.ArrayList;


public class WR implements IUmrechnen,ISubjekt{

    private ArrayList<IObserver> observers;
    private double ausgangBetrag;
    private String ausgangWaehrung;
    private String zielWaehrung;
    private double zielBetrag;

    private WR nextWR;


    public WR(WR nextWR) {
        this.nextWR = nextWR;
        observers = new ArrayList<IObserver>();

    }

    @Override
    public double umrechnen(String variante, double betrag) throws UmrechnerNichtGefundenException {
        if (nextWR != null) {
            ausgangBetrag = betrag;
            ausgangWaehrung = variante;
            zielWaehrung = variante;
            zielBetrag = nextWR.umrechnen(variante, betrag);
            notifyObserver();

            return zielBetrag;


        }
        else
            throw new UmrechnerNichtGefundenException();

    }

    @Override
    public void register(IObserver o) {

        observers.add(o);

    }
    @Override
    public void unregister(IObserver o) {

        observers.remove(o);

    }
    @Override
    public void notifyObserver() {

        for (IObserver observer : observers) {
            observer.update(ausgangBetrag,ausgangWaehrung,zielWaehrung,zielBetrag );
        }


    }

    public void setAusgangBetrag(double ausgangBetrag) {
        this.ausgangBetrag = ausgangBetrag;
        notifyObserver();
    }

    public void setAusgangWaehrung(String ausgangWaehrung) {
        this.ausgangWaehrung = ausgangWaehrung;
        notifyObserver();
    }

    public void setZielWaehrung(String zielWaehrung) {
        this.zielWaehrung = zielWaehrung;
        notifyObserver();
    }

    public void setZielBetrag(double zielBetrag) {
        this.zielBetrag = zielBetrag;
        notifyObserver();
    }
}












