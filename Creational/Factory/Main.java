package Creational.Factory;

public class Main {
    public static void main(){
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
