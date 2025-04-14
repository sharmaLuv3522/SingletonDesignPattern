package SingletonDesignPattern;

public class SingletonClassEager {

    private static SingletonClassEager instance = new SingletonClassEager();

    private SingletonClassEager(){}

    public static SingletonClassEager getInstance(){
        return instance;
    }

    /*
        Problem:- It initializes the instance everytime, even if it is needed or not.
     */

}
