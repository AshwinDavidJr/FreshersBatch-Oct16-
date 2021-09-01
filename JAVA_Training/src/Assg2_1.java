/* SINGLETON CLASS EXAMPLE
In object-oriented programming, a singleton class is a class that can have only
one object (an instance of the class) at a time.
All Singleton objects will have a single address and any
changes amde through one object will reflect the other too.
*
* */class Singleton{
    private Singleton(){}

    private static Singleton instance = null;
    public static  Singleton createObject()
    {
        if(instance==null)
            instance = new Singleton();
        return  instance;
    }
}


public class Assg2_1 {
    public static void main(String[] args) {

        Singleton S1 = Singleton.createObject();
        Singleton S2 = Singleton.createObject();
        System.out.println("Address of S1: "+ S1.hashCode());
        System.out.println("Address of S2: "+ S2.hashCode());
    }


}
