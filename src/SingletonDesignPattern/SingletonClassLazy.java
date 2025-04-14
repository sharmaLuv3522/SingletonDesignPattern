package SingletonDesignPattern;

public class SingletonClassLazy {

    private static SingletonClassLazy instance;

    private SingletonClassLazy(){

    }

    public static SingletonClassLazy getInstance() {
        if(instance==null){
            instance=new SingletonClassLazy();
        }
        return instance;
    }

}

/*
    Problem:-  If multiple thread concurrently call getInstance method then there is chance of multiple instance
    being created.
 */