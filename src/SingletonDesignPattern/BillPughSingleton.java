package SingletonDesignPattern;

public class BillPughSingleton {

    private BillPughSingleton(){}

    public static class BillPughSingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.INSTANCE;
    }

    /*
    This implementation uses a static inner helper class to hold the singleton instance.
    The inner class is not loaded into memory until it's referenced for the first time in the getInstance() method.
     */
}
