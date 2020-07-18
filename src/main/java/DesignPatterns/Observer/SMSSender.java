package DesignPatterns.Observer;

public class SMSSender {

    MessageTypes mail = MessageTypes.MAIL;
    MessageTypes sms = MessageTypes.SMS;


    public static void main(String[] args) {
        Button button = new Button();
        Listener listener1 = new Listener() {
            @Override
            public void update() {
            }
        };

        Listener listener2 = new Listener() {
            @Override
            public void update() {
            }
        };

        Listener listener3 = new Listener() {
            @Override
            public void update() {
            }
        };


        button.addListener(listener1);
        button.addListener(listener2);
        button.addListener(listener3);


        button.click();
    }
}
