package at.itkolleg.observer;

import at.itkolleg.interfaces.IObserver;
import at.itkolleg.interfaces.ISubjekt;

public class LogObserver implements IObserver {


    private double ausgangBetrag;
    private String ausgangWaehrung;
    private String zielWaehrung;
    private double zielBetrag;

    private ISubjekt WR;

    public LogObserver(ISubjekt WR){
            this.WR = WR;

            WR.register(this);
    }

    @Override
    public void update(double ausgangBetrag, String ausgangWaehrung, String zielWaehrung, double zielBetrag) {
            this.ausgangBetrag = ausgangBetrag;
            this.ausgangWaehrung = ausgangWaehrung;
            this.zielWaehrung = zielWaehrung;
            this.zielBetrag = zielBetrag;




    }

    public void ausgabe(){
        System.out.println(ausgangBetrag + ";" + ausgangWaehrung +";" + zielWaehrung + ";" + zielBetrag);

    }
}
