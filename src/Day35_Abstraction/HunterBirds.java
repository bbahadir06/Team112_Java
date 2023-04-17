package Day35_Abstraction;

public class HunterBirds extends Birds {

    @Override
    public void move() {
        System.out.println("they fly");
    }

    @Override
    public void nutrition() {
        System.out.println("eat meat");
    }

    @Override
    public void life() {
        System.out.println("life method from hunterBirds");
    }
    public void claw () {
        System.out.println("clawed");
    }

    @Override
    public void beak() {
        System.out.println("pointed beak");
    }


    @Override
    public void isBird() {
        System.out.println("isBird method is called from hunterBird");
    }

    @Override
    public void wing() {
        System.out.println("they have wings");
    }
}
