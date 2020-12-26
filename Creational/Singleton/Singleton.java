package Creational.Singleton;
/*
*************************
* Ramazan Can Gölgen
* github/rmzncn
*************************
* */


public class Singleton {
    // We're making the object static because we want an instance and it shouldn't have been created before.
    private static Singleton instance = null;

    // We define the consturactor of the class as private or protected, so we prevent creating an instance.
    private Singleton()
    {
        // Codes we will use during creation
    }

    // Our method by which we will call our class from other class.
    // We prevented it from running at the same time with the synchronized keyword
    // Because if it runs at the same time, multiple instances can be created.
    public synchronized static Singleton getInstance()
    {
        // Create single instance of the class if no instance has been created before.
        if(instance == null)
        {
            instance  = new Singleton();
        }
        return instance;
    }
}
