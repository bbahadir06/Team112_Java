package Day36_Interface;

public class C02_ChildClass extends C01_Interface implements I01_FirstInterface, I02_Interface{


    public void add () {

    }

    public void sum () {

    }

    public int subtraction () {
        return 0;
    }

    public String division () {
        return null;
    }

    public void newMethod () {

    }

    public static void main(String[] args) {
        C02_ChildClass child = new C02_ChildClass();
        System.out.println(I01_FirstInterface.number);
    }

}
