package Creational.Factory;
/*
 *************************
 * Ramazan Can Gölgen
 * github/rmzncn
 *************************
 * */

public class Main {
    public static void main(String[] args){
        try {
                Tesla teslaCar = (Tesla) CarFactory.createCar(Tesla.class);
                teslaCar.goForward();
                teslaCar.goBack();

                Ford fordCar = (Ford) CarFactory.createCar(Ford.class);
                fordCar.goBack();
                fordCar.goForward();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
