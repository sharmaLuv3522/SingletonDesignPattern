package SingletonDesignPattern;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    private synchronized static ThreadSafeSingleton getInstance(){

        if(instance==null){
            instance = new ThreadSafeSingleton();
        }
        return instance;

    }
    /*
        Problem:- This solves the problem of multiple instances being created when multiple thread calls
        getInstance method concurrently. But every time when a thread calls getInstance method it acquires lock and
        after initializing the instance it releases lock. So this takes time.
     */

}
