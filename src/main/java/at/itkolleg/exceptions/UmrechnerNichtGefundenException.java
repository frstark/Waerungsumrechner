package at.itkolleg.exceptions;

public class UmrechnerNichtGefundenException extends Exception {
    public UmrechnerNichtGefundenException() {
        super("Umrechner nicht vorhanden!");
    }
}
