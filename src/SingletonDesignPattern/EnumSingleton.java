package SingletonDesignPattern;

public enum EnumSingleton {
    INSTANCE;
}


/*
In this method, the singleton is declared as an enum rather than a class.

Java ensures that only one instance of an enum value is created, even in a multithreaded environment.

The Enum Singleton pattern is the most robust and concise way to implement a singleton in Java.
 */