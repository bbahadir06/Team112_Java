package Day33_dataTypeUsage;

public class HunterBirds extends Birds {

    public void  move(){
        System.out.println("they fly");
    }
    public  void nutrition(){
        System.out.println("eats meat");
    }
    public  void claw(){
        System.out.println("clawed");
    }
    public  void beak(){
        System.out.println("pointed beak");
    }

    public static void main(String[] args) {

      HunterBirds hunterEagle = new HunterBirds();

        hunterEagle.move();  //they fly     HB
        hunterEagle.nutrition();  //eats meat   HB
        hunterEagle.claw();  //clawed       HB
        hunterEagle.beak();  //pointed beak     Hb
        hunterEagle.wing();  // they are winged     B
        hunterEagle.respiration();  // they breathe with lungs    B
        hunterEagle.beak();  // pointed beak        HB
        hunterEagle.multiply();  // they multiply with eggs     B
        hunterEagle.life(); // they live and die        AK
        System.out.println("====================");

        Birds birdEagle = new HunterBirds();

        // data type is bird
        birdEagle.move();  //they fly // comes from HunterBirds
        birdEagle.nutrition();  //eats meat //comes from HunterBirds
        //birdEagle.claw();  // CTE
        birdEagle.beak();  //pointed beak // comes from HunterBirds
        birdEagle.wing();  // they are winged // comes from Birds
        birdEagle.respiration();  // they breathe with lungs // comes from Birds
        birdEagle.multiply();  // they multiply with eggs // comes from Birds
        birdEagle.life(); // they live and die // comes from AnimalKingdom

        // data type is animalKingdom
        AnimalKingdom animalEagle = new HunterBirds();
        animalEagle.move();  //they fly // comes from HunterBirds
        animalEagle.nutrition();  //eats meat //comes from HunterBirds
        // animalEagle.claw();  // CTE
        //animalEagle.beak();  //CTE
        // animalEagle.wing();  // CTE
        animalEagle.respiration();  // they breathe with lungs // comes from Birds
        animalEagle.multiply();  // they multiply with eggs // comes from Birds
        animalEagle.life(); // they live and die // comes from AnimalKingdom

    }

}
