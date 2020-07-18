package DesignPatterns.Observer;


public interface Observable {


    public void addListener(Listener listener);

    public void removeListener(Listener listener);


    public String notifyListeners(String string);
}
