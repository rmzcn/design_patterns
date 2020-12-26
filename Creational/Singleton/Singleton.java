package Creational.Singleton;
/*
*************************
* Ramazan Can Gölgen
* github/rmzncn
*************************
* */


public class Singleton {
    private static Singleton instance = null;

    private Singleton()
    {
        // Codes we will use during creation
    }
    public synchronized static Singleton getInstance()
    {
        if(instance == null)
        {
            instance  = new Singleton();
        }
        return instance;
    }
}
