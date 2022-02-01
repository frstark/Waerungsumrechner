package at.itkolleg.observer;

import at.itkolleg.interfaces.IObserver;
import at.itkolleg.interfaces.ISubjekt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

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

        //log in .txt anhängen
        try
        {
            String filePath = "D:\\IT-Kolleg D\\5AAIF\\FSE DOBL\\Mikroarchitektur\\log-dateien\\log.txt";
            FileOutputStream f = new FileOutputStream(filePath, true);
            String log = ("\r\n"+ausgangBetrag + ";" + ausgangWaehrung +";" + zielWaehrung + ";" + zielBetrag+"-- Zeit: " + LocalDateTime.now());
            byte[] byteArr = log.getBytes(); //converting string into byte array
            f.write(byteArr);
            f.close();

            System.out.println("Vorgang in log.txt gespeichert.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }









    }
}
