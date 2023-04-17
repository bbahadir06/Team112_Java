package Day31_inheritance;

import Day30_inheritance.C07_Parent;

public class C01_ChildClass extends C07_Parent {


    /*
    When we create a child class from different package, Parent's access modifiers should be PUBLIC or PROTECTED as
    child class will try to reach that constructor form different package
     */
    String childStr;
    C01_ChildClass() {
        super(); // calls parent's constructor
        System.out.println("New child constructor is executed");
    }


    public static void main(String[] args) {

        C01_ChildClass childObj = new C01_ChildClass();

        }

       /*
    If there is a parent-child relation, when we try to create an object from subclass, because of extends keyword, before
    all constructors, java will add an invisible constructor call ( super() )
    when we create an object, because of these super() constructor calls, object receives all variables and methods from
    parent classes
     */
}
