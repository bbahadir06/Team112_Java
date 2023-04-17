package Day32_dataTypeUsage;

public class HunterBirds extends Birds {

    String move= "they fly";
    String nutrition= "eat meat";
    String claw= "clawed";
    String beak= "pointed beak";

    public static void main(String[] args) {

     HunterBirds hunterEagle = new HunterBirds();

        System.out.println(hunterEagle.move);           // they fly
        System.out.println(hunterEagle.nutrition);      // eat meat
        System.out.println(hunterEagle.claw);           // clawed
        System.out.println(hunterEagle.beak);           // pointed beak

        System.out.println(hunterEagle.wing);           // they are winged
        System.out.println(hunterEagle.respiration);    // they breathe with lungs
        System.out.println(hunterEagle.multiply);       // they multiply with eggs

        System.out.println(hunterEagle.life);           // they live and die

        System.out.println("===========================");

        // **********for variables******
        // if the data type and constructor are from different classes
        // java will check birds class for variables

        Birds birdEagle = new HunterBirds();        // get values from Birds and AnimalKingdom Classes. Give CTE when datatype is from HunterBirds Class

        System.out.println(birdEagle.move);  // Ak // they move
        System.out.println(birdEagle.nutrition);  // AK // they are fed
        //System.out.println(birdEagle.claw);  // CTE
        System.out.println(birdEagle.beak);  // Birds //they have beaks
        System.out.println(birdEagle.wing);  // Birds // they are winged
        System.out.println(birdEagle.respiration);  // Birds  // they breathe with lungs
        System.out.println(birdEagle.multiply);  // Birds // they multiply with eggs
        System.out.println(birdEagle.life);  // AK // they live and die


        AnimalKingdom animalEagle = new HunterBirds();      // get values just from AnimalKingdom class. Give CTE when datatype is from HunterBirds and Birds classes
        System.out.println(animalEagle.move);  // they move
        System.out.println(animalEagle.nutrition);  // they are fed

        //System.out.println(birdEagle.claw);  // CTE
        //System.out.println(animalEagle.beak);  // CTE
        //System.out.println(animalEagle.wing);  // CTE

        System.out.println(animalEagle.respiration);  // they breathe
        System.out.println(animalEagle.multiply);  // they multiply
        System.out.println(animalEagle.life);  // they live and die
        System.out.println("===========================");

        /*
        // **********for variables******
        // if the data type and constructor are from different classes
        // java will check birds class for variables
        // if we try to reach a variable in this kind of object, java
        will check the data type first fot that variable
        if it can not find it there, it will also check the parent classes
        and if it can not, CTE
     */




    }


}
