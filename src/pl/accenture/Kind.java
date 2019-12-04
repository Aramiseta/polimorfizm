package pl.accenture;

public class Kind extends Vehicle {

    public Kind() {
    }

    @Override
    void start() {
        //super.start();
        System.out.println("Start nowszego silnika");
    }
    void open(){
        System.out.println("Otwieranie okien");
    }


}
