package at.itkolleg.interfaces;


public interface ISubjekt {

    public void register (IObserver o);
    public void unregister (IObserver o);
    public void notifyObserver();



}
