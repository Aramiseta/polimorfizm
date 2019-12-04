package pl.accenture;

public class Main {



    public static void main(String[] args) {
        Vehicle ship = new Kind();
        Vehicle plane= new Kind();
        Vehicle car= new Kind();
        Vehicle truck = new Model();
        Vehicle race_Car = new Model();
        Vehicle vehicle = new Vehicle();
        Vehicle [] vehicles={ship, plane, car, truck, race_Car, vehicle};

        for (Vehicle ab : vehicles){
            if(ab instanceof Model){
                ab.start();
                ((Model) ab).open();
                ((Model) ab).music();
            }
            else if(ab instanceof Kind){
                ab.start();
                ((Kind) ab).open();
            }
            else if(ab instanceof Vehicle){
                ab.start();
            }
        }	// write your code here
    }
}
