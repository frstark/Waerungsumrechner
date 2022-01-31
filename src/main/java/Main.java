import at.itkolleg.adapter.SA;
import at.itkolleg.chainofresponsibility.EUR2DOLLAR;
import at.itkolleg.chainofresponsibility.EUR2YEN;
import at.itkolleg.chainofresponsibility.WR;
import at.itkolleg.decorator.FixGebuerenDecorator;
import at.itkolleg.decorator.GebuerenDecorator;
import at.itkolleg.exceptions.UmrechnerNichtGefundenException;
import at.itkolleg.observer.LogObserver;


public class Main {
    public static void main(String[] args) {


        //COR




        //Kette wird hier erstellt; es könnten neue Kettenglieder hinzugefügt oder alte, je am Ende gelöscht werden.
        /*WR kette1 = new EUR2YEN();
        kette1.setNext(new EUR2DOLLAR()); //So lassen sich einfacher neue Kettenglieder einfügen.*/

        //Dekoration

        WR kette = new EUR2YEN(new EUR2DOLLAR(null));

        WR kette2 = new GebuerenDecorator(new EUR2DOLLAR(new EUR2YEN(null)));

        WR kette3 = new FixGebuerenDecorator(new EUR2DOLLAR(new EUR2YEN(null)));

        double[] liste = {100,200,300,400,500};

        SA tests = new SA(new GebuerenDecorator(new EUR2DOLLAR(new EUR2YEN(null))));

        WR kette4 = new FixGebuerenDecorator(new EUR2DOLLAR(new EUR2YEN(null)));

        LogObserver observer1 = new LogObserver(kette4);




        try {

            System.out.println("Sammelrechnung");
            System.out.println(tests.sammelumrechnen(liste,"EUR2DOLLAR"));



            System.out.println("Normalbetrag:");
            System.out.println(kette.umrechnen("EUR2YEN",150));
            System.out.println(kette.umrechnen("EUR2DOLLAR",150));
           // System.out.println(kette.umrechnen("EUR2YUAN",100));

            System.out.println(" +5% Gebueren:");
            System.out.println(kette2.umrechnen("EUR2YEN",150));
            System.out.println(kette2.umrechnen("EUR2DOLLAR",150));
//            System.out.println(kette2.umrechnen("EUR2YUAN",100));

            System.out.println(" +5€ Gebueren:");
            System.out.println(kette3.umrechnen("EUR2YEN",150));
            System.out.println(kette3.umrechnen("EUR2DOLLAR",150));
            //System.out.println(kette3.umrechnen("EUR2YUAN",100));

            kette4.umrechnen("EUR2DOLLAR",150);
            observer1.ausgabe();





        } catch (UmrechnerNichtGefundenException e) {
            System.err.println(e.getMessage());
        }


    }
}
