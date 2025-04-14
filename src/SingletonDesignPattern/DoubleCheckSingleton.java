package SingletonDesignPattern;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){
    }

    public static DoubleCheckSingleton getInstance(){
        if(instance==null){

            synchronized (DoubleCheckSingleton.class){
                if(instance==null){
                    instance=new DoubleCheckSingleton();
                }
            }

        }
        return instance;
    }

    /* watch shrayansh jain vdo for singleton class to understand the problem and why we have to use volatile here
        Link- https://www.youtube.com/watch?v=SqDbZOjW1uM
     */

}
