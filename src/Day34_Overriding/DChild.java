package Day34_Overriding;

public class DChild extends CParent {

    @Override
    void method1() {
        super.method1();
    }

    public static void main(String[] args) {
        DChild chd = new DChild();
        chd.method1();
    }

    String method3(){
        return "test2";
    }

    Integer method4() {
        Double num = 2.4;

        return 4;
    }

        void method2 () {
            super.method2();
        }

    /*
    When we create an overriding method by using inteliju
    Inteliju adds @Override notation automaticly. When
    Overridden method is deleted, because of this @Override
    we will be able to see it
     */

        protected void method5 () {


        }

    }
