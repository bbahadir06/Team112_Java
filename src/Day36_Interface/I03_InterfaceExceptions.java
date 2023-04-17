package Day36_Interface;

public interface I03_InterfaceExceptions {

    void method1(); // an abstract method

    static void method2(){
        System.out.println("child class is not forced to override this method");
    }

    default void method3 (){
        System.out.println("it may seem like default access modifier but it is not");
    }

}
