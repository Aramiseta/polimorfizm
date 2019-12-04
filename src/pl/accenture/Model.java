package pl.accenture;

public class Model  extends Kind {
    public Model() {
    }

    @Override
    void start() {
        //super.start();
        System.out.println("Uruchamianie dużego nowoczesnego silnika");
    }

    @Override
    void open() {
       // super.open();
        System.out.println("Otwieranie elektrycznych okien");
    }

    void music(){
        System.out.println("Włączanie muzyki");
    }
}
