package InheritanceDemoV1;

public class Animal {

    protected boolean beingDangerous;
    protected int numberOfLegs;
    protected String diet;


    // Requires setting/knowing parameters before initialization
    public Animal(boolean beingDangerous, int numberOfLegs, String diet){
        this.beingDangerous = beingDangerous;
        this.numberOfLegs = numberOfLegs;
        this.diet = diet;
    }

    // allows for setting after initialization
    public Animal() {
        // set nothing
    }

    public boolean isBeingDangerous() {
        return beingDangerous;
    }

    public void setBeingDangerous(boolean beingDangerous) {
        this.beingDangerous = beingDangerous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }


//
    public String getDiet() {
        if(diet == null){
            return "variables null!";

        }
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void makeNoise(){
        System.out.print("Animal Class: Make noise -  ");
    }

    public void eat(){
        System.out.print("Animal class: Eating -  ");
    }



}
