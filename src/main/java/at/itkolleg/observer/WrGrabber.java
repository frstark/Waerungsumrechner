/*
package at.itkolleg.observer;

import at.itkolleg.interfaces.ISubjekt;

import java.util.ArrayList;

public class WrGrabber implements ISubjekt {


    private ArrayList<Observer> observers;
    private double ausgangBetrag;
    private String ausgangWaehrung;
    private String zielWaehrung;
    private double zielBetrag;

    public WrGrabber() {

        observers = new ArrayList<Observer>();

    }
    @Override
    public void register(Observer o) {

        observers.add(o);

    }
    @Override
    public void unregister(Observer o) {

        observers.remove(o);

    }
    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
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
*/
