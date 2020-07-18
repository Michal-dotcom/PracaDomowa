package DesignPatterns.Observer;

public class Button implements Observable {


    private String message = "message";


    public Button() {

    }

    public void click() {
        System.out.println(notifyListeners(message));
    }


    @Override
    public void addListener(Listener listener) {

    }

    @Override
    public void removeListener(Listener listener) {

    }


    @Override
    public String notifyListeners(String string) {
        return message;
    }
}
