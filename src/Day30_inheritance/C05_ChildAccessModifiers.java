package Day30_inheritance;

public class C05_ChildAccessModifiers extends C04_ParentAccessModifiers {
    public static void main(String[] args) {


        C05_ChildAccessModifiers child = new C05_ChildAccessModifiers();

        System.out.println(child.publicNumber);     // 0
        System.out.println(child.normalNumber);     // 0
        System.out.println(child.protectedNumber);  // 0

        /*
        By using child object fromthe child class we can reach all normal variables
        except private and static variables
         */


       // System.out.println(child.privateNumber);    we cannot reach a parent's private variable from a child class

        System.out.println(child.staticNormalNumber);   // 234

        // static variables belong to the class itself so they can not be inherited
        // if we want to reach a static variable from other classes we should
        // write the class name before the variable name to reach it



    }

}
